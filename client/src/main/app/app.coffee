'use strict'

# Declare app level module which depends on filters, and services
App = angular.module('app', [
    'ui.router'
    'ngResource'
    'app.customers.controllers'
    'app.customers.services'
    'app.customers.directives'
    'app.controllers'
    'app.directives'
    'app.filters'
    'app.services'
])
.constant(
    'RESOURCE_SOURCE'
    APP_ID: if querystring.parse(window.location.search.remove(/^[?]/)).appId? then querystring.parse(window.location.search.remove(/^[?]/)).appId else 19
    USR: if querystring.parse(window.location.search.remove(/^[?]/)).usr? then querystring.parse(window.location.search.remove(/^[?]/)).usr else ''
    PWD: if querystring.parse(window.location.search.remove(/^[?]/)).pwd? then querystring.parse(window.location.search.remove(/^[?]/)).pwd else ''
    DOMAIN: if querystring.parse(window.location.search.remove(/^[?]/)).domain? then querystring.parse(window.location.search.remove(/^[?]/)).domain else window.location.origin
    PATHNAME: if querystring.parse(window.location.search.remove(/^[?]/)).pathname? then querystring.parse(window.location.search.remove(/^[?]/)).pathname else window.location.pathname + '../../rest/')

App.run([
    '$rootScope'
    '$state'
    '$stateParams'
    'LoginService'
    'RESOURCE_SOURCE'
    ($rootScope, $state, $stateParams, loginService, RESOURCE_SOURCE) ->
        # A method to determine if the current active state is equal to or is the child
        # of the state stateName.
        #
        # It's very handy to add references to $state and $stateParams to the $rootScope
        # so that you can access them from any scope within your applications.For example,
        # <li ng-class="{ active: $state.includes('contacts.list') }"> will set the <li>
        # to active whenever 'contacts.list' or one of its descendants is active.
        $rootScope.$state = $state
        $rootScope.$stateParams = $stateParams

#        if RESOURCE_SOURCE.USR != '' and RESOURCE_SOURCE.PWD != ''
#            debugger
#            loginUser =
#                username: RESOURCE_SOURCE.USR
#                password: RESOURCE_SOURCE.PWD
#                submit:'Login'
#
#            loginService.loginUser(loginUser)

])
.config([
    '$stateProvider'
    '$urlRouterProvider'
    '$httpProvider'

    ($stateProvider, $urlRouterProvider, $httpProvider) ->

        $httpProvider.defaults.withCredentials = true

        # For any unmatched url, redirect to /state1
        $urlRouterProvider.otherwise("/customers")
        $httpProvider.interceptors.push('spaHttpInterceptor')

        # Now set up the states
        $stateProvider
        .state('customers', {
          url: '/customers'
          templateUrl: 'partials/customers/customers_container.html'
        })
        .state('customers_srv_side_tbl', {
                url: '/customers'
                templateUrl: 'partials/customers/customers_container_srv_side_tbl.html'
            })
        .state('tree', {
                url: '/tree'
                templateUrl: 'partials/tree/tree_container.html'
        })
        .state('graph', {
                url: '/graph'
                templateUrl: 'partials/graph/graph_container.html'
            })

])

# register the interceptor as a service
.factory(
    'spaHttpInterceptor'
    [
        '$q'
        'MessageService'
        '$rootScope'
        ($q, messageService, $rootScope) ->
            'request': (config) ->
                # do something on success
                messageService.log '$$$$$$$ spaHttpInterceptor request $$$$$$$'
                $rootScope.$broadcast 'httpCallStarted'
                messageService.log config
                config
            'requestError': (rejection) ->
                # do something on error
                messageService.log '$$$$$$$ spaHttpInterceptor requestError $$$$$$$'
                $rootScope.$broadcast 'httpCallStopped'
                $q.reject rejection
            'response': (response) ->
                # do something on success
                messageService.log '$$$$$$$ spaHttpInterceptor response $$$$$$$'
                $rootScope.$broadcast 'httpCallStopped'
                response
            'responseError': (rejection) ->
                # do something on error
                messageService.log '$$$$$$$ spaHttpInterceptor responseError $$$$$$$'
                $rootScope.$broadcast 'httpCallStopped'
                $q.reject rejection
    ])
