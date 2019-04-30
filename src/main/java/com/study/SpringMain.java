package com.study;

import com.study.dao.UserDao;
import com.study.services.UserService;
import config.SpringDemoConfig;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by idodo-i7-01 on 2019/4/24.
 */
public class SpringMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        System.out.println(userDao);
        System.out.println(userService.userDao);
        System.out.println(jdbcTemplate);
        System.out.println(userDao.jdbcTemplate);
        if(userDao == userService.userDao) {
            System.out.println("1111");
        }
        System.out.println(userService.queryUserName(1));

        //language=JSON
        String json = "{\"name\":\"yangc\"}";

    }
}