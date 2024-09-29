package com.technotes.mysqldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.technotes.mysqldemo.mybatis.dao"})
@SpringBootApplication
public class MysqlDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MysqlDemoApplication.class, args);
    }
}
