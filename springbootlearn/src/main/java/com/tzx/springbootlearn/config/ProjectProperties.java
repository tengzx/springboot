package com.tzx.springbootlearn.config;

import com.tzx.springbootlearn.config.constant.GlobalManager;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = GlobalManager.ROOT_PREFIX)
public class ProjectProperties {

  private SwaggerProperties swagger;
}
