package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;

@Service("emailSenderService")
public class EmailService {

    private static JavaMailSender javaMailSender;


    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        EmailService.javaMailSender = javaMailSender;
    }

    @Async
    public static void sendEmail(SimpleMailMessage email) {
        javaMailSender.send(email);
    }

    
}