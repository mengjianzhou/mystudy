package com.robert.study.chaptor01.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserFunctionService functionService = context.getBean(UserFunctionServiceImpl2.class);
        functionService.doSayHello("spring");
    }
}
