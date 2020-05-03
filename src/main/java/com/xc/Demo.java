package com.xc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {

    @RequestMapping("/hello")
    public @ResponseBody String hello(String name) {
        return "hello " + name;
    }
}
