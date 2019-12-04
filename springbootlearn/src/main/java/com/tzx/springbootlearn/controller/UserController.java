package com.tzx.springbootlearn.controller;

import com.tzx.springbootlearn.model.User;
import com.tzx.springbootlearn.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  public User getUser(@PathVariable int id){
    return userService.findById(id);
  }


  @PostMapping("/{id}/{money}")
  @ApiOperation("根据id修改金钱")
  public Boolean updateById(@PathVariable int id,@PathVariable BigDecimal money){
    return userService.updateById(id,money);
  }

  @GetMapping("/findStr")
  @ApiOperation("查找字符串-测试")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "location", value = "地点", defaultValue = "北京"),
      @ApiImplicitParam(name = "name", value = "姓名", defaultValue = "tengzx", required = true)
  })
  public String findStr(String location,String name){
    return location + "--" + name;
  }
}
