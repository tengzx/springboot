package com.tzx.springbootlearn.mapper;

import com.tzx.springbootlearn.model.User;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
  User findById(int id);

  @Select("select * from user where id = #{id}")
  User findUserById(int id);

  @Update("update user set money = money + #{money} where id = #{id} and money + #{money}>0")
  Boolean updateById(int id, BigDecimal money);
}
