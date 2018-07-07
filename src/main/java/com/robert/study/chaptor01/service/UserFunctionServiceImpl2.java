package com.robert.study.chaptor01.service;

import org.springframework.stereotype.Service;

@Service
public class UserFunctionServiceImpl2 implements UserFunctionService{
    @Override
    public void doSayHello(String str) {
        System.out.println("do nothing");
    }
}
