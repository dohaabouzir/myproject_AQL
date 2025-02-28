package com.votreclinique.commun;

import com.votreclinique.soap.publishers.DoctorServicePublisher;
import com.votreclinique.soap.publishers.MedicalRecordServicePublisher;
import com.votreclinique.soap.publishers.PrescriptionServicePublisher;

public class ServiceLauncher {

    public static void main(String[] args) {
        try {
            System.out.println("Starting SOAP Services...");

            // Lancer le service DoctorService
            Thread doctorServiceThread = new Thread(() -> {
                try {
                    DoctorServicePublisher.main(new String[]{});
                } catch (Exception e) {
                    System.err.println("Failed to start DoctorService: " + e.getMessage());
                }
            });

            // Lancer le service MedicalRecordService
            Thread medicalRecordServiceThread = new Thread(() -> {
                try {
                    MedicalRecordServicePublisher.main(new String[]{});
                } catch (Exception e) {
                    System.err.println("Failed to start MedicalRecordService: " + e.getMessage());
                }
            });

            // Lancer le service PrescriptionService
            Thread prescriptionServiceThread = new Thread(() -> {
                try {
                    PrescriptionServicePublisher.main(new String[]{});
                } catch (Exception e) {
                    System.err.println("Failed to start PrescriptionService: " + e.getMessage());
                }
            });

            // Démarrer les threads
            doctorServiceThread.start();
            medicalRecordServiceThread.start();
            prescriptionServiceThread.start();

            // Attendre quelques secondes pour s'assurer que les services SOAP sont démarrés
            Thread.sleep(5000);

            // Lancer l'application REST
            System.out.println("Starting RestApplication...");
            com.votreclinique.rest.RestApplication.main(args);

        } catch (Exception e) {
            System.err.println("Error while starting services: " + e.getMessage());
        }
    }
}