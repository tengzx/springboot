package com.tzx.springbootlearn.service;

import com.tzx.springbootlearn.model.User;

public interface UserService {
  User findById(int id);
}
