package com.tzx.springbootlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  //这是一个测试的demo
  //feature003
  //feature101
  //102
  @GetMapping(value="/get/demoStr")
  public String demo(){
    return "1111";
  }

  //test004
  //103
  //finfish


  //test reset

}
