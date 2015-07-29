'use strict'

### Directives ###

# register the module with Angular
angular.module('app.customers.directives', [
# require the 'app.service' module
    'app.services'
])

.directive('customersGrid', [
        'MessageService'
        (messageService) ->
            restrict: "A"
            link: ($scope, $elem, attrs) ->
                options =
                    scrollY: "266px"
                    scrollX: true
                    dom: '<"top">rt<"bottom"p><"clear">'
                    columns: [
                        {
                            data: 'firstName'
                        }
                        {
                            data: 'lastName'
                        }
                    ]

                $scope.customersTable = $($elem).DataTable(options)

                # watch for any changes to our data, rebuild the DataTable
                $scope.$watch attrs.provider, (value) ->
                    messageService.log "Watch customers list!"
                    messageService.log value
                    messageService.log attrs
                    if value
                        $scope.customersTable.clear()
                        $scope.customersTable.rows.add(value)
                        $scope.customersTable.draw()

    ])
# As an object, ajaxDT maps directly onto the jQuery ajax configuration object,
# so any options you can use in a jQuery request
# https://www.datatables.net/manual/server-side
# https://api.jquery.com/jQuery.ajax/
.directive('customersGridServerSideProc', [
        'MessageService'
        'CustomerService'
        (messageService, customerService) ->
            restrict: "A"
            link: ($scope, $elem, attrs) ->
                options =
                    serverSide: true
                    ajax:
                        url: customerService.getAjaxURLTblServerProc()
                        type: 'POST'
                        contentType: "application/json"
                        xhrFields:
                            withCredentials: true
                        data: (data) ->
                            JSON.stringify(data)
                        dataSrc: (json)->
                            messageService.log "!!!!! Got data from server"
                            messageService.log json
                            $scope.customersPage = json.data
                            $scope.$digest()
                            json.data

                    scrollY: "266px"
                    scrollX: true
                    dom: '<"top">rt<"bottom"p><"clear">'
                    columns: [
                        {
                            data: 'firstName'
                        }
                        {
                            data: 'lastName'
                        }
                    ]

                $scope.customersSrvSideTable = $($elem).DataTable(options)
    ])
