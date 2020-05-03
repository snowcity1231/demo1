package com.xc.amqp.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MySender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/send")
    public @ResponseBody String send(String message) {
        rabbitTemplate.convertAndSend(message);
        return "ok";
    }

}
