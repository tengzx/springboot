package com.tzx.springbootlearn.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户")
public class User {
  @ApiModelProperty("主键")
  private Integer id;
  @ApiModelProperty("用户名")
  private String userName;
  @ApiModelProperty("用户密码")
  private String passWord;
  @ApiModelProperty("用户真实名字")
  private String realName;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", userName='" + userName + '\'' +
        ", passWord='" + passWord + '\'' +
        ", realName='" + realName + '\'' +
        '}';
  }
}
