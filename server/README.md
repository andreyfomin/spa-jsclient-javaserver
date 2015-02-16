# spa-web-server

## Client request URL (Deployed on Tomcat Server)
[http://localhost:8080/spa.web/webjars/spa-client/]
(http://localhost:8080/spa.web/webjars/spa-client/)

## Client request URL (Client debug mode)
[http://localhost:4444/?domain=http://localhost:8080&pathname=/spa.web/rest/]
(http://localhost:4444/?domain=http://localhost:8080&pathname=/spa.web/rest/)

## REST Request GET
[http://localhost:8080/spa.web/rest/customer/list]
(http://localhost:8080/spa.web/rest/customer/list)
## REST Response

```javascript
[
  {
    "id": 1,
    "firstName": "Alon",
    "lastName": "Avital",
    "emailAddress": {},
    "addresses": [
      {
        "id": 1,
        "street": "Kaplansky",
        "city": "Rishon",
        "country": "Israel"
      }
    ]
  }
]
```

# Web application configuration

The optional **VM** parameter can be defined in **Tomcat**  to search properties configuration file
it is defined by spring as **<context:property-placeholder location="${config:classpath*:config/dev/}jdbc.properties"/>**

Example:

* -Dconfig=classpath*:config/prod/
* -Dconfig=classpath*:config/dev/