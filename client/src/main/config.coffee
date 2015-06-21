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
                'js/vendor.js': /^(bower_components|vendor[\\/])/
        stylesheets:
            joinTo:
                'css/app.css': /^app/
                'css/vendor.css': /^(bower_components|vendor[\\/])/
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
        assetsmanager:
            copyTo:
                '/fonts' : ['bower_components/bootstrap/fonts/*', 'bower_components/font-awesome/fonts/*']
                '/images' : ['bower_components/datatables/media/images/*']
                '/css/imgs' : ['vendor/dhtmlxSuite_v413_std/codebase/imgs/*']
        minTimeSpanSeconds: 10

# Enable or disable minifying of result js / css files.
# minify: true
