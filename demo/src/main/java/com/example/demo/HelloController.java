package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RestController
    public class ExampleController {

        @PostMapping("/create")
        public String create(@RequestBody(required = true) String data) {
            // Process the data and create a resource
            return "Resource created successfully";
        }
    }

}
