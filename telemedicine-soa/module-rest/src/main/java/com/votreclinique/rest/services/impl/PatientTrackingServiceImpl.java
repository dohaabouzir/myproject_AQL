package com.votreclinique.rest.services.impl;

import com.votreclinique.rest.models.PatientTracking;
import com.votreclinique.rest.services.PatientTrackingService;
import com.votreclinique.rest.soap.clients.MedicalRecordClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientTrackingServiceImpl implements PatientTrackingService {

    private final List<PatientTracking> patients = new ArrayList<>();
    private final MedicalRecordClient medicalRecordClient;

    @Autowired
    public PatientTrackingServiceImpl(MedicalRecordClient medicalRecordClient) {
        this.medicalRecordClient = medicalRecordClient;

        // Sample data for testing
        PatientTracking patient1 = new PatientTracking(1L, "John Doe", 35, "123 Main St", new ArrayList<>());
        PatientTracking patient2 = new PatientTracking(2L, "Jane Smith", 28, "456 Elm St", new ArrayList<>());
        patients.add(patient1);
        patients.add(patient2);
    }

    @Override
    public List<PatientTracking> getAllPatients() {
        return patients;
    }

    @Override
    public PatientTracking getPatientById(Long id) {
        return patients.stream()
                .filter(patient -> patient.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Patient not found with ID: " + id));
    }

    @Override
    public void addConsultation(Long id, String consultation) {
        PatientTracking patient = getPatientById(id);
        patient.getConsultations().add(consultation);
    }

    @Override
    public String getMedicalRecord(Long id) {
        PatientTracking patient = getPatientById(id);
        return medicalRecordClient.getMedicalRecord(String.valueOf(patient.getId()));
    }

    @Override
    public String syncMedicalRecord(Long id, String history) {
        return medicalRecordClient.createMedicalRecord(String.valueOf(id), history); // Return the result
    }
}