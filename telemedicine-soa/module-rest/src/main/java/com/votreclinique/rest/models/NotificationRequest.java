package com.votreclinique.rest.models;

public class NotificationRequest {
    private String to;
    private String subject;
    private String message;
    private Long appointmentId;

    // Constructeurs
    public NotificationRequest() {}
    public NotificationRequest(String to, String subject, String message, Long appointmentId) {
        this.to = to;
        this.subject = subject;
        this.message = message;
        this.appointmentId = appointmentId;
    }

    // Getters et Setters
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }
}