package com.tzx.springbootlearn.controller;

import com.tzx.springbootlearn.model.User;
import com.tzx.springbootlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public User GetUser(@PathVariable int id){
    return userService.findById(id);
  }
}
