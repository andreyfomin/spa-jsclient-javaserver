'use strict'

# Declare app level module which depends on filters, and services
App = angular.module('app', [
    'ui.router'
    'ngResource'
    'app.controllers'
    'app.directives'
    'app.filters'
    'app.services'
    'app.templates'
])

App.config([
    '$stateProvider'
    '$urlRouterProvider'

    ($stateProvider, $urlRouterProvider, config) ->

        # For any unmatched url, redirect to /state1
        $urlRouterProvider.otherwise("/todo")

        # Now set up the states
        $stateProvider
        .state('todo', {
          url: '/todo'
          templateUrl: 'partials/todo.html'
        })
        .state('view1', {
            url: '/view1'
            templateUrl: 'partials/partial1.html'
        })
        .state('view2', {
            url: '/view2'
            templateUrl: 'partials/partial2.html'
        })
])