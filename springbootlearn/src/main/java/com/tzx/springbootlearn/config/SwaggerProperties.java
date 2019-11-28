package com.tzx.springbootlearn.config;

import lombok.Data;

@Data
public class SwaggerProperties {

  private String basePackage;

  private String title;

  private String description;

  private String version;

  private boolean enable;
}
