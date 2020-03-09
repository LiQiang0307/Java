package com.liqiang.hello.spring.service;

import com.liqiang.hello.spring.service.impl.UserServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;


/**
 * @author 李强
 * @data 2020/3/9 下午 08:38
 */
public class MyTest {

    private static final Logger logger= LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
       ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();

        logger.info("info 级别的日志");
        logger.debug("debug 级别的日志");
        logger.warn("warn 级别的日志");
        logger.error("error 级别的日志");

        String message1="测试1";
        String message2="测试2";
        logger.info("message is : {} {}",message1,message2);

        System.out.println(String.format("message is :%s %s",message1,message2));
        System.out.println(message1.concat(message2));

    }

}
