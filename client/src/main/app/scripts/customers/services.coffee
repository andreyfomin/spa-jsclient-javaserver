'use strict'

angular.module('app.customers.services', [])
.factory('CustomerService', [
    '$http'
    'MessageService'
    'RESOURCE_SOURCE'
    ($http, messageService, RESOURCE_SOURCE) ->
      findAll: ->
        messageService.log "Call findAll of CustomersService"
        $http.get(RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "customer/list")
        .error(
          (data, status, header, config) ->
            if (status == 0)
              messageService.error "Connection to server refused!"
            else if (status == 404)
              messageService.error 'Resource not found on server!'
            else
              serverError = if data.defaultMessage? then data.defaultMessage else 'Undefined'
              messageService.error 'Server error: ' + serverError
        )


      addCustomer: (customer)->
        messageService.log "Call addCustomer of CustomersService"

        $http.post(RESOURCE_SOURCE.DOMAIN + RESOURCE_SOURCE.PATHNAME + "customer/add", customer)
        .error(
          (data, status, header, config) ->
            if (status == 0)
              messageService.error "Connection to server refused!"
            else if (status == 404)
              messageService.error 'Resource not found on server!'
            else
              serverError = if data.defaultMessage? then data.defaultMessage else 'Undefined'
              messageService.error 'Server error: ' + serverError
        )
  ])