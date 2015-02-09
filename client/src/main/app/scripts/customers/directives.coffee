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

                $scope.customersTable =  $($elem).DataTable(options)

                # watch for any changes to our data, rebuild the DataTable
                $scope.$watch attrs.dataprovider, (value) ->
                    messageService.log "Watch customers list!"
                    messageService.log value
                    messageService.log attrs
                    if value
                        $scope.customersTable.clear()
                        $scope.customersTable.rows.add(value)
                        $scope.customersTable.draw()

    ])
