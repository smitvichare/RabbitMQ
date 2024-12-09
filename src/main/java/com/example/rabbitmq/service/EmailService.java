package com.example.rabbitmq.service;

import com.example.rabbitmq.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String email, String subject, Order order){
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText("Hi "+order.getName()+",Your order with order ID:"+order.getOrderId()+" has been placed successfully!!");
        javaMailSender.send(simpleMailMessage);

    }
}
