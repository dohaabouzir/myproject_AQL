package com.votreclinique.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class AwsSesConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("email-smtp.eu-west-1.amazonaws.com"); // Remplacez par votre région SES
        mailSender.setPort(587);
        mailSender.setUsername("AKIA5CBGTKAKMVLMVBZZ"); // Remplacez par votre nom d'utilisateur IAM
        mailSender.setPassword("BCY5RAJjlYAUmka8eD3GX4A+ELuGvUVg/LzUmb/DjYSW"); // Remplacez par votre mot de passe IAM

        java.util.Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }
}