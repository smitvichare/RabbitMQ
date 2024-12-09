package com.example.rabbitmq.consumer;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.dto.OrderStatus;
import com.example.rabbitmq.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
        emailService.sendEmail(orderStatus.getOrder().getEmail(),"Your order was "+orderStatus.getMessage()+"!!",orderStatus.getOrder());


    }
}
