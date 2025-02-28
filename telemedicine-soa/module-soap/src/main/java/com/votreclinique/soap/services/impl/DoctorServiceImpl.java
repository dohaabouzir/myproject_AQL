package com.votreclinique.soap.services.impl;

import com.votreclinique.soap.services.DoctorService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.votreclinique.soap.services.DoctorService")
public class DoctorServiceImpl implements DoctorService {

    // Stockage interne des docteurs dans une HashMap
    private final Map<String, String> doctorDatabase = new HashMap<>();

    @Override
    public String addDoctor(String doctorId, String doctorDetails) {
        if (doctorDatabase.containsKey(doctorId)) {
            return "Error: Doctor with ID " + doctorId + " already exists.";
        }
        doctorDatabase.put(doctorId, doctorDetails);
        return "Doctor added with ID: " + doctorId;
    }

    @Override
    public String getDoctor(String doctorId) {
        String doctorDetails = doctorDatabase.get(doctorId);
        if (doctorDetails == null) {
            return "Error: Doctor with ID " + doctorId + " not found.";
        }
        return "Doctor details for ID " + doctorId + ": " + doctorDetails;
    }

    @Override
    public String updateDoctor(String doctorId, String doctorDetails) {
        if (!doctorDatabase.containsKey(doctorId)) {
            return "Error: Doctor with ID " + doctorId + " not found.";
        }
        doctorDatabase.put(doctorId, doctorDetails);
        return "Doctor updated with ID: " + doctorId;
    }

    @Override
    public boolean deleteDoctor(String doctorId) {
        if (!doctorDatabase.containsKey(doctorId)) {
            return false; // Indiquer que la suppression a échoué
        }
        doctorDatabase.remove(doctorId);
        return true;
    }
}