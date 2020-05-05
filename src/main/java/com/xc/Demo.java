package com.xc;

import com.xc.redis.proxy.RedisProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class Demo {

    @Resource
    private RedisProxy redisProxy;

    @RequestMapping("/hello")
    public @ResponseBody String hello(String name) {
        return "hello " + name;
    }

    @RequestMapping("/get")
    public @ResponseBody String get(String key) {
        return (String)redisProxy.get(key);
    }

    @RequestMapping("/set")
    public @ResponseBody String set(String key, String value) {
        redisProxy.set(key, value);
        return "ok";
    }
}
