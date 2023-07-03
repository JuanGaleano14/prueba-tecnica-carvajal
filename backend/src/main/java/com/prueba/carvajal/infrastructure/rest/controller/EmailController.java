package com.prueba.carvajal.infrastructure.rest.controller;

import com.prueba.carvajal.application.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@CrossOrigin("*")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send")
    public String sendEmail() {
        emailService.sendEmail("recipient@example.com", "Prueba de correo", "Este es un correo de prueba");
        return "Correo enviado";
    }

}
