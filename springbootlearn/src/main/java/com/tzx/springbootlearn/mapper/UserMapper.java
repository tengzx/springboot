package com.tzx.springbootlearn.mapper;

import com.tzx.springbootlearn.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
  User findById(int id);
}
