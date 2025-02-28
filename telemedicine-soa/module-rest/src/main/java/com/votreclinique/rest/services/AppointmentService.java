package com.votreclinique.rest.services;

import com.votreclinique.rest.models.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    Appointment createAppointment(Appointment appointment);
    Appointment cancelAppointment(Long id);
}