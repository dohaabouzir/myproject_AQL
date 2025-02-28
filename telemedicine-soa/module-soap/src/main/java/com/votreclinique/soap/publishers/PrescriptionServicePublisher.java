package com.votreclinique.soap.publishers;

import com.votreclinique.soap.services.impl.PrescriptionServiceImpl;

import javax.xml.ws.Endpoint;

public class PrescriptionServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:9092/prescriptionService";
        Endpoint.publish(url, new PrescriptionServiceImpl());
        System.out.println("PrescriptionRecordService published at: " + url);
    }
}