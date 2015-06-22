'use strict'

angular.module('app.customers.services', [])
.factory('CustomerService', [
        '$http'
        'MessageService'
        'RESOURCE_SOURCE'
        'HttpServiceResponseHandler'
        ($http, messageService, RESOURCE_SOURCE, httpServiceResponseHandler) ->
            findAll: ->
                messageService.log "Call findAll of CustomersService"
                $http.get(
                    RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "customer/list"
                )
                .error(
                    (data, status, header, config) ->
                        httpServiceResponseHandler.errorHandler(data, status, header, config)
                )


            getAjaxURLTblServerProc: ()->
                RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "customer/page/list"


            addCustomer: (customer)->
                messageService.log "Call addCustomer of CustomersService"

                $http.post(
                    RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "customer/add"
                    customer
                )
                .error(
                    (data, status, header, config) ->
                        httpServiceResponseHandler.errorHandler(data, status, header, config)
                )
    ])