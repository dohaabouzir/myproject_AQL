package com.votreclinique.soap.services.impl;

import com.votreclinique.soap.services.MedicalRecordService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.votreclinique.soap.services.MedicalRecordService")
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Override
    public String createMedicalRecord(String patientId, String details) {
        return "Medical record created for patient: " + patientId;
    }

    @Override
    public String getMedicalRecord(String patientId) {
        return "Details of medical record for patient: " + patientId;
    }

    @Override
    public String updateMedicalRecord(String patientId, String details) {
        return "Medical record updated for patient: " + patientId;
    }

    @Override
    public boolean deleteMedicalRecord(String patientId) {
        return true;
    }
}