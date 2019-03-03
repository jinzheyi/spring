package com.jinzheyi.example.hikaricp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jinzheyi.example.hikaricp")
public class HikaricpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HikaricpApplication.class, args);
    }

}
