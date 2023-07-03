package com.prueba.carvajal.application.service;

public interface EmailService {
    void sendEmail(String to, String subject, String text);
}
