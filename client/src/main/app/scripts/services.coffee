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