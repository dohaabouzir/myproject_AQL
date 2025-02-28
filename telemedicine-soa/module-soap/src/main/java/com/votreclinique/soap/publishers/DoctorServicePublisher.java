package com.votreclinique.soap.publishers;

import com.votreclinique.soap.services.impl.DoctorServiceImpl;

import javax.xml.ws.Endpoint;

public class DoctorServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:9090/doctorService";
        Endpoint.publish(url, new DoctorServiceImpl());
        System.out.println("DoctorService published at: " + url);
    }
}