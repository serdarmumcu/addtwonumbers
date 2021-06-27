package com.serdarmumcu.addtwonumbers.service;

import org.springframework.stereotype.Component;

@Component
public class AddService {
    public double addTwoNumbers(double num1,double num2){
        return  num1 + num2;
    }
    
}
