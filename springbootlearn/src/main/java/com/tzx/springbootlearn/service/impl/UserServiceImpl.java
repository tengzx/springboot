package com.tzx.springbootlearn.service.impl;

import com.tzx.springbootlearn.mapper.UserMapper;
import com.tzx.springbootlearn.model.User;
import com.tzx.springbootlearn.service.UserService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public User findById(int id) {
    return userMapper.findById(id);
  }

  @Override
  public Boolean updateById(int id, BigDecimal money) {
    return userMapper.updateById(id,money);
  }
}
