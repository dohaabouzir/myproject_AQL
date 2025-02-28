package com.votreclinique.soap.publishers;

import com.votreclinique.soap.services.impl.MedicalRecordServiceImpl;

import javax.xml.ws.Endpoint;

public class MedicalRecordServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:9091/medicalRecordService";
        Endpoint.publish(url, new MedicalRecordServiceImpl());
        System.out.println("MedicalRecordService published at: " + url);
    }
}