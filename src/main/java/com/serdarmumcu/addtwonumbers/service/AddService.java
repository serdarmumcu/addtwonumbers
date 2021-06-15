package com.serdarmumcu.addtwonumbers.service;

import org.springframework.stereotype.Component;

@Component
public class AddService {
    public int addTwoNumbers(int num1,int num2){
        return  num1 + num2;
    }
}
