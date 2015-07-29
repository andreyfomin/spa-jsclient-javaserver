spa-jsclient-javaserver
=======================

## Run from from Jetty

```
mvn jetty:run -Djetty.port=9999 -Dconfig=classpath*:config/prod/
```

##client request
* URL Tomcat [http://localhost:8080/spa.web/webjars/spa-client/](http://localhost:8080/spa.web/webjars/spa-client/)
* URL Jetty [http://localhost:9999/spa.web/webjars/spa-client/](http://localhost:9999/spa.web/webjars/spa-client/)
* URL Jetty [http://localhost:4444/?usr=admin&pwd=123456&domain=http://localhost:9999&pathname=/spa.web/rest/](http://localhost:4444/?usr=admin&pwd=123456&domain=http://localhost:9999&pathname=/spa.web/rest/)
* URL Jetty and Client Debug [http://localhost:4444/?domain=http://localhost:9999&pathname=/spa.web/rest/](http://localhost:4444/?domain=http://localhost:9999&pathname=/spa.web/rest/)

