package com.serdarmumcu.addtwonumbers.service;

import org.springframework.stereotype.Component;

@Component
public class AddService {
    public int addTwoNumbers(int num1,int num2){
        return  num1 + num2;
    }

    public int sumTwoNumbers(int num1,int num2){
        try {
            /* some work which end up throwing an exception */
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException e){
            return num1 + num2;
        }
        finally {
            /* clean up */
            throw new RuntimeException();       // Noncompliant; masks the IllegalArgumentException
        }
    }
}
