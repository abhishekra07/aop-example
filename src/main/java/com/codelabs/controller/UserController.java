package com.codelabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/by-username")
    public String getUsersByUsername(@RequestParam String username) {
        return "Dummy Response";
    }
}