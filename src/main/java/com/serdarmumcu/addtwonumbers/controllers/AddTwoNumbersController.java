package com.serdarmumcu.addtwonumbers.controllers;

import com.serdarmumcu.addtwonumbers.bean.AddRequest;
import com.serdarmumcu.addtwonumbers.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddTwoNumbersController {

    @Autowired
    private AddService service;

    @PostMapping("/addnumbers")
    public int addnumbers(@RequestBody AddRequest request){
        return service.addTwoNumbers(request.getNum1(),request.getNum2());
    }
}
