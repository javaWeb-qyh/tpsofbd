package com.qyh.tpsofbd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan({"com.qyh.tpsofbd.server.dao"})
@SpringBootApplication
@EnableAsync
@EnableScheduling
@ServletComponentScan
public class TpsofbdApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpsofbdApplication.class, args);
    }
}
