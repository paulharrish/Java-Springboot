package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// @RestController
// public class HelloController {

// @GetMapping("/hello")
// public String hello(Model model) {
// model.addAttribute("message", "Hello, World!");
// return "helloPage";
// }
// }
