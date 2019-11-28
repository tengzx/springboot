package com.tzx.springbootlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tzx.springbootlearn.mapper")
@SpringBootApplication
class SpringBootLearnApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootLearnApplication.class, args);
  }

}
