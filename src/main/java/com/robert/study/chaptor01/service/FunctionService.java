package com.robert.study.chaptor01.service;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    public void sayHello(String str){
        System.out.println("hello "+str);
    }

}
