package com.robert.study.chaptor01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionServiceImpl implements UserFunctionService{

    @Autowired
    private FunctionService functionService;

    @Override
    public void doSayHello(String str){
        functionService.sayHello(str);
    }
}
