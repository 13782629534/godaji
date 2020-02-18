package com.woniu.godaji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woniu.godaji.mapper")
public class GodajiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GodajiApplication.class, args);
    }

}
