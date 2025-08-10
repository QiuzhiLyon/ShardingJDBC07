package com.qiuzhitech.shardingjdbc07;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiuzhitech.shardingjdbc07.db.mappers")
public class ShardingJdbc07Application {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbc07Application.class, args);
    }

}
