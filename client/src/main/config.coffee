exports.config =
# See docs at https://github.com/brunch/brunch/blob/stable/docs/config.md.
    conventions:
        ignored: /^(bower_components\/bootstrap-less(-themes)?|app\/styles\/overrides|(.*?\/)?[_]\w*)/
    modules:
        definition: false
        wrapper: false
    paths:
        public: 'resources/META-INF/resources/webjars/spa-client'
    files:
        javascripts:
            joinTo:
                'js/app.js': /^app/
                'js/vendor.js': /^bower_components/
        stylesheets:
            joinTo:
                'css/app.css': /^(app|vendor|bower_components)/
            order:
                before: [
                    'app/styles/app.less'
                ]

        templates:
            joinTo:
                'js/dontUseMe': /^app/ # dirty hack for Jade compiling.

    plugins:
        jadePages:
            destination: (path) ->
                path.replace /^app[\/\\](.*)\.jade$/, "$1.html"
            jade:
                doctype: "html"
                htmlmin: false
        jade_angular:
            modules_folder: 'partials'

# Enable or disable minifying of result js / css files.
# minify: true
