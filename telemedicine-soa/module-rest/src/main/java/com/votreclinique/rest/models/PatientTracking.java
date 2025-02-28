package com.votreclinique.rest.models;

import java.util.List;

public class PatientTracking {
    private Long id;
    private String name;
    private int age;
    private String address;
    private List<String> consultations;

    public PatientTracking(Long id, String name, int age, String address, List<String> consultations) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.consultations = consultations;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<String> consultations) {
        this.consultations = consultations;
    }
}