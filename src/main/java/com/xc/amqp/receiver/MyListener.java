package com.xc.amqp.receiver;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        String messageBody = new String(message.getBody());
        System.out.println(" [x] Received '" + messageBody + "'");
    }
}
