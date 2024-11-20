package com.fernando.email_service.controllers;

import com.fernando.email_service.application.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/email")
public class EmailSenderContoller {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderContoller(EmailSenderService emailService){
        this.emailSenderService = emailService;
    }

}
