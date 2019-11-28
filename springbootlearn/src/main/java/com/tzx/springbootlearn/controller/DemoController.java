package com.tzx.springbootlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping(value="/get/demoStr")
  public String demo(){
    return "1111";
  }



}
