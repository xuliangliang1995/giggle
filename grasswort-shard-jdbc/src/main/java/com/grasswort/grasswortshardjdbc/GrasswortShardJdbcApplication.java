package com.grasswort.grasswortshardjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.grasswort.grasswortshardjdbc.mapper")
public class GrasswortShardJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrasswortShardJdbcApplication.class, args);
    }

}
