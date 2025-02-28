package com.votreclinique.rest.services;

import com.votreclinique.rest.models.PatientTracking;

import java.util.List;

public interface PatientTrackingService {
    List<PatientTracking> getAllPatients();
    PatientTracking getPatientById(Long id);
    void addConsultation(Long id, String consultation);
    String getMedicalRecord(Long id);
    String syncMedicalRecord(Long id, String history); // Ensure this matches the implementation
}
