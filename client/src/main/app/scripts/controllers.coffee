'use strict'

### Controllers ###

angular.module('app.controllers', [])

.controller('AppCtrl', [
            '$scope'
            '$location'
            '$resource'
            '$rootScope'

            ($scope, $location, $resource, $rootScope) ->

                # Uses the url to determine if the selected
                # menu item should have the class active.
                $scope.$location = $location
                $scope.$watch('$location.path()', (path) ->
                    $scope.activeNavId = path || '/'
                )

        ])

.controller('PersonTableCtrl', [
            '$scope'
            'personService'
            'messageService'
            '$log'

            ($scope, personService, messageService, $log) ->
                personService
                .findAll()
                .then(
                    (persons)->
                        $log.log "Got persons"
                        $log.log persons
                    (error)->
                        messageService.error "Error!<br>" + error.config.url
                        $log.log error
                )
        ])

.controller('MyCtrl1', [
            '$scope'

            ($scope) ->
                $scope.onePlusOne = 2
        ])

.controller('MyCtrl2', [
            '$scope'

            ($scope) ->
                $scope
        ])

.controller('TodoCtrl', [
            '$scope'

            ($scope) ->
                $scope.todos = [
                    text: "learn angular"
                    done: true
                ,
                    text: "build an angular app"
                    done: false
                ]

                $scope.addTodo = ->
                    $scope.todos.push
                        text: $scope.todoText
                        done: false

                    $scope.todoText = ""

                $scope.remaining = ->
                    count = 0
                    angular.forEach $scope.todos, (todo) ->
                        count += (if todo.done then 0 else 1)

                    count

                $scope.archive = ->
                    oldTodos = $scope.todos
                    $scope.todos = []
                    angular.forEach oldTodos, (todo) ->
                        $scope.todos.push todo  unless todo.done

        ])

