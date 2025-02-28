package com.votreclinique.rest.controllers;

import com.votreclinique.rest.models.PatientTracking;
import com.votreclinique.rest.services.PatientTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientTrackingController {

    @Autowired
    private PatientTrackingService patientTrackingService;

    @GetMapping
    public List<PatientTracking> getAllPatients() {
        return patientTrackingService.getAllPatients();
    }

    @GetMapping("/{id}")
    public PatientTracking getPatientById(@PathVariable Long id) {
        return patientTrackingService.getPatientById(id);
    }

    @PostMapping("/{id}/consultations")
    public void addConsultation(@PathVariable Long id, @RequestBody String consultation) {
        patientTrackingService.addConsultation(id, consultation);
    }

    @GetMapping("/{id}/medical-record")
    public String getMedicalRecord(@PathVariable Long id) {
        return patientTrackingService.getMedicalRecord(id);
    }

    @PostMapping("/{id}/sync-medical-record")
    public String syncMedicalRecord(@PathVariable Long id, @RequestBody String newHistory) {
        return patientTrackingService.syncMedicalRecord(id, newHistory);
    }

}