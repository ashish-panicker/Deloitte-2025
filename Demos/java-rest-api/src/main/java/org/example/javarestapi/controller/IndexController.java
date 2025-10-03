package org.example.javarestapi.controller;

import org.example.javarestapi.requests.WelcomeReq;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/index")
public class IndexController {

    /**
     * Sending and Receiving Http Requests
     * GET      Fetching information
     * POST     Create new information
     * PUT      Update existing information
     * DELETE   Remove existing information
     */

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // /welcome/ashish
    @GetMapping("/welcome/{userName}")
    public String welcome(@PathVariable String userName) {
        return "welcome: " + userName;
    }

    @PostMapping("/greet")
    public String greet(@RequestBody WelcomeReq req) {
        return req.getMessage() + " " + req.getUserName();
    }
}
