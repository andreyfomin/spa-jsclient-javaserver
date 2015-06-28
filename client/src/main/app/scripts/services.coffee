'use strict'

angular.module('app.services', [])

.factory('version', ()->
    "0.1"
)
.factory('MessageService', [
        '$log'
        ($log)->
            message: (message)->
                dhtmlx.message
                    text: message

            error: (message)->
                dhtmlx.message
                    type: "error"
                    text: message

            log: (message)->
                $log.log message
    ])

.factory('HttpServiceResponseHandler', [
        'MessageService'
        '$location'
        (messageService, $location)->
            messageService.log "HttpServiceResponseHandler is loaded!"

            errorHandler: (data, status, header, config) ->
                if (status == 0)
                    messageService.error "Connection to server refused!"
                else if (status == 404)
                    messageService.error 'Resource not found on server!'
                else if (status == 302)
                    debugger
                    messageService.error 'Redirect to login from server!'
                else
                    serverError = if data.defaultMessage? then data.defaultMessage else 'Undefined'
                    messageService.error 'Server error: ' + serverError


            securityHandler: (data, status, header, config) ->
                if (status == 302)
                    debugger
                    messageService.error 'Redirect to login from server!'
    ])