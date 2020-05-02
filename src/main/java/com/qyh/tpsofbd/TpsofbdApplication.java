package com.qyh.tpsofbd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.qyh.tpsofbd.dao"})
@SpringBootApplication
public class TpsofbdApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpsofbdApplication.class, args);
    }
}
