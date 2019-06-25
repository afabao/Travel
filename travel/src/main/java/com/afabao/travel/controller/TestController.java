package com.afabao.travel.controller;

import com.afabao.travel.service.TestService;
import com.afabao.travel.test.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Wells on 2019/6/25 0025.
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<Test> list(){
        return service.list();
    }
}
