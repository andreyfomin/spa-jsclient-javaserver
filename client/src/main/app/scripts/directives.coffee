'use strict'

### Directives ###

# register the module with Angular
angular.module('app.directives', [
    # require the 'app.service' module
    'app.services'
])

.directive('appVersion', [
        'version'
        (version) ->
            (scope, elm, attrs) ->
                elm.text(version)
    ])
.factory('DistributorService', [
        '$http'
        'RESOURCE_SOURCE'
        'MessageService'
        ($http, RESOURCE_SOURCE, messageService) ->
            getDistributors: ()->
                messageService.log "DistributorService getDistributors call!"
                $http.get(RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "distributor/list")
                .error (data, status, header, config) ->
                    if (status == 0)
                        messageService.error "Connection to server refused!"
                    else if (status == 404)
                        messageService.error 'Can\'t get  diftibutors lis from server!'
                    else
                        serverError = if data.defaultMessage? then data.defaultMessage else 'Undefined'
                        messageService.error 'Server error: ' + serverError

            getDistributor: (distributorId)->
                messageService.log "DistributorService getDistributor call!"
                $http.get(RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "distributor/" + distributorId).then (response) ->
                    response.data

            activeSegments: (distributorId)->
                $http.get(RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "distributor/" + distributorId + "/segments-status/run").then (response) ->
                    response.data

            suspendSegments: (distributorId)->
                $http.get(RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "distributor/" + distributorId + "/segments-status/suspend").then (response) ->
                    response.data
    ])
