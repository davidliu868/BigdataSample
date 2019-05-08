package com.bigdata.sample.task_7.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortraitController {

    @RequestMapping(method = RequestMethod.GET,produces = "application/json;charset=UTF-8",value="/hello")
    public String say(){
        return "hello胜多负少的==asd=";
    }
}
