package com.votreclinique.rest.services;

public interface NotificationService {
    void sendEmail(String to, String subject, String body);
}