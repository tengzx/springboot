package com.tzx.springbootlearn.controller;

import com.tzx.springbootlearn.model.User;
import com.tzx.springbootlearn.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "用户设置")
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  @ApiOperation("根据id查询用户")
  @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "1", required = true)
  public User GetUser(@PathVariable int id){
    return userService.findById(id);
  }
}
