package com.fernando.email_service.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String Subject, String body);
}
