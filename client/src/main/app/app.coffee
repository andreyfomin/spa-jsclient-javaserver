'use strict'

# Declare app level module which depends on filters, and services
App = angular.module('app', [
    'ui.router'
    'ngResource'
    'app.controllers'
    'app.directives'
    'app.filters'
    'app.services'
])
.constant(
    'RESOURCE_SOURCE'
    DOMAIN: if querystring.parse(window.location.search.remove(/^[?]/)).domain? then querystring.parse(window.location.search.remove(/^[?]/)).domain else window.location.origin
    PATHNAME: if querystring.parse(window.location.search.remove(/^[?]/)).pathname? then querystring.parse(window.location.search.remove(/^[?]/)).pathname else window.location.pathname + '../../spring/'
    DISTRIBUTOR_ID: if querystring.parse(window.location.search.remove(/^[?]/)).distributorId? then querystring.parse(window.location.search.remove(/^[?]/)).distributorId else 0
)

App.run([
    '$rootScope'
    '$state'
    '$stateParams'
    ($rootScope, $state, $stateParams) ->
        # A method to determine if the current active state is equal to or is the child
        # of the state stateName.
        #
        # It's very handy to add references to $state and $stateParams to the $rootScope
        # so that you can access them from any scope within your applications.For example,
        # <li ng-class="{ active: $state.includes('contacts.list') }"> will set the <li>
        # to active whenever 'contacts.list' or one of its descendants is active.
        $rootScope.$state = $state
        $rootScope.$stateParams = $stateParams

])
.config([
    '$stateProvider'
    '$urlRouterProvider'

    ($stateProvider, $urlRouterProvider) ->

        # For any unmatched url, redirect to /state1
        $urlRouterProvider.otherwise("/tables/tables.datatables")

        # Now set up the states
        $stateProvider
        .state('tables', {
          url: '/tables'
          templateUrl: 'partials/tables/tables_container.html'
        })
        .state('tables.datatables', {
                url: '/tables.datatables'
                templateUrl: 'partials/tables/tables.datatables.html'
        })
        .state('tables.jqgrid', {
              url: '/tables.jqgrid'
              templateUrl: 'partials/tables/tables.jqgrid.html'
          })
        .state('tables.datatables.simple', {
              url: '/tables.datatables.simple'
              templateUrl: 'partials/tables/tables.datatables.simple.html'
          })
        .state('tables.jqgrid.simple', {
              url: '/tables.jqgrid.sample'
              templateUrl: 'partials/tables/tables.jqgrid.simple.html'
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
