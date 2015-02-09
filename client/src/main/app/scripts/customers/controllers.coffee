'use strict'

angular.module('app.customers.controllers', [])
.controller('CustomerController', [
    '$scope'
    'CustomerService'
    'MessageService'
    ($scope, customerService, messageService) ->
      $scope.customers = []

      $scope.customer = {}

      $scope.addNewCustomer = ()->
        $('#customerDialog').modal('show')
        return

      $scope.createCustomer = ()->
        messageService.log "Create Customer!"

        customerService
        .addCustomer($scope.customer)
        .success(
          (updatedCustomer, status, headers, config)->
            messageService.log "Successfully added New Rule!!!"
            $('#customerDialog').modal('hide')
            $scope.customers.add(updatedCustomer)

            $scope.customersTable.clear()
            $scope.customersTable.rows.add($scope.customers)
            $scope.customersTable.draw()

            $scope.customer = {}
            
        )

      customerService
      .findAll()
      .success(
        (customers, status, headers, config)->
          messageService.log "Successfully got Customers!!!"
          $scope.customers = customers
      )
  ])
