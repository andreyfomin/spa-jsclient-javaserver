'use strict'

### Sevices ###

angular.module('app.services', [])

.factory 'version', ->
  "0.1"

.factory 'engineService', ($http) ->
  findAll: ->
    $http.get("http://localhost:8080/spa-server/rest/greeting").then(response) ->
      response.data


