package com.votreclinique.rest.controllers;
import com.votreclinique.rest.models.EmailRequest;

import com.votreclinique.rest.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        // Validation des données reçues
        if (emailRequest.getBody() == null || emailRequest.getBody().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Le champ 'body' de l'email ne peut pas être vide.");
        }
        if (emailRequest.getTo() == null || emailRequest.getTo().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Le champ 'to' de l'email ne peut pas être vide.");
        }
        if (emailRequest.getSubject() == null || emailRequest.getSubject().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Le champ 'subject' de l'email ne peut pas être vide.");
        }

        try {
            notificationService.sendEmail(
                    emailRequest.getTo(),
                    emailRequest.getSubject(),
                    emailRequest.getBody()
            );
            return ResponseEntity.ok("Email envoyé avec succès !");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erreur lors de l'envoi de l'email : " + e.getMessage());
        }
    }
}