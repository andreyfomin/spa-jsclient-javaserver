'use strict'

### Sevices ###

angular.module('app.services', [])

.factory 'version', ->
  "0.1"

.factory 'personService', ($http) ->
  findAll: ->
    $http.get("http://localhost:8080/spa-server/rest/person/list").then (response) ->
      response.data


.factory 'messageService', ->

  message: (message)->
    dhtmlx.message
      text: message

  error: (message)->
    dhtmlx.message
      type: "error"
      text: message
#      expire: -1

