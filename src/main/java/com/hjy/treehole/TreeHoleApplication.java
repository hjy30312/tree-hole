package com.hjy.treehole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hjy.treehole.mapper")
public class TreeHoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreeHoleApplication.class, args);
    }

}
