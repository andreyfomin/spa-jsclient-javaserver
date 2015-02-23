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
        (messageService)->
            messageService.log "HttpServiceResponseHandler is loaded!"

            errorHandler: (data, status, header, config) ->
                if (status == 0)
                    messageService.error "Connection to server refused!"
                else if (status == 404)
                    messageService.error 'Resource not found on server!'
                else
                    serverError = if data.defaultMessage? then data.defaultMessage else 'Undefined'
                    messageService.error 'Server error: ' + serverError

    ])