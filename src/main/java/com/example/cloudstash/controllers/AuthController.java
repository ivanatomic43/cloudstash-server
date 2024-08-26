package com.example.cloudstash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloudstash.model.User;
import com.example.cloudstash.service.AuthService;

@RestController
@RequestMapping("/api")
public class AuthController {

  @Autowired
  private AuthService authService;

  @PostMapping("/users")
  public String registerUser(@RequestBody User u) {
    return authService.registerUser(u);
  }
}
