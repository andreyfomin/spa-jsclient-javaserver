package com.ebs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AFomin on 9/14/2014.
 */

@RestController
public class HelloWorldController {
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        Greeting g = new Greeting(100,"ssss");
        return g;
    }
}
