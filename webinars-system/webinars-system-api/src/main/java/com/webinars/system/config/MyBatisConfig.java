package com.webinars.system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.webinars.system.mapper")
public class MyBatisConfig {
    // ...
}
