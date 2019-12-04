package com.tzx.springbootlearn.service;

import com.tzx.springbootlearn.model.User;
import java.math.BigDecimal;

public interface UserService {
  User findById(int id);

  Boolean updateById(int id, BigDecimal money);
}
