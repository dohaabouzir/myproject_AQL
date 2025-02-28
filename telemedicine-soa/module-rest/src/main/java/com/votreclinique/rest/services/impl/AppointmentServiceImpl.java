package com.votreclinique.rest.services.impl;

import com.votreclinique.rest.models.Appointment;
import com.votreclinique.rest.services.AppointmentService;
import com.votreclinique.rest.services.NotificationService;
import com.votreclinique.rest.soap.clients.DoctorClient;
import com.votreclinique.soap.generated.doctorService.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();
    private Long nextId = 1L;
    private DoctorService doctorService;

    @Autowired
    private NotificationService notificationService;

    public AppointmentServiceImpl() {
        DoctorClient doctorClient = new DoctorClient();
        this.doctorService = doctorClient.getDoctorService();
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointments.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        appointment.setId(nextId++);
        // Logique pour utiliser le service SOAP
        String doctorDetails = doctorService.getDoctor(appointment.getDoctorId().toString());
        System.out.println("Doctor details fetched from SOAP: " + doctorDetails);

        appointments.add(appointment);

        // Envoi d'une notification pour confirmer le rendez-vous
        String subject = "Confirmation de rendez-vous";
        String body = "Votre rendez-vous avec le Dr " + appointment.getDoctorId() +
                " est confirmé pour le " + appointment.getDate() + ".";
        notificationService.sendEmail(appointment.getPatientEmail(), subject, body);

        return appointment;
    }

    @Override
    public Appointment cancelAppointment(Long id) {
        Appointment appointment = getAppointmentById(id);
        if (appointment != null) {
            appointment.setStatus("Canceled");

            // Envoi d'une notification pour informer de l'annulation
            String subject = "Annulation de rendez-vous";
            String body = "Votre rendez-vous avec le Dr " + appointment.getDoctorId() +
                    " prévu pour le " + appointment.getDate() + " a été annulé.";
            notificationService.sendEmail(appointment.getPatientEmail(), subject, body);
        }
        return appointment;
    }
}