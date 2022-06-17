package com.pdx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pdx.mapper")
public class SupperlierSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupperlierSpringApplication.class, args);
    }

}
