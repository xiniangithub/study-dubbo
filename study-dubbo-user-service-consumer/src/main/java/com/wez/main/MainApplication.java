package com.wez.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用启动类
 * @Author wez
 * @Time 2021/3/6 16:34
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.wez.user"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
