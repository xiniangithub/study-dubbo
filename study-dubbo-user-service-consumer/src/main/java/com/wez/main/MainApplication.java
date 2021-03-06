package com.wez.main;

import com.wez.user.svc.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 应用启动类
 * @Author wez
 * @Time 2021/3/6 16:34
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        UserService userService = context.getBean(UserService.class);
        userService.listOrder("zhangsan");

        System.in.read();
    }

}
