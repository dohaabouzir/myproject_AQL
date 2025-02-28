package com.votreclinique.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface MedicalRecordService {

    @WebMethod
    @WebResult(targetNamespace = "")
    public String createMedicalRecord(
            @WebParam(name = "patientId") String patientId,
            @WebParam(name = "medicalHistory") String medicalHistory);

    @WebMethod
    @WebResult(targetNamespace = "")
    public String getMedicalRecord(
            @WebParam(name = "patientId") String patientId);

    @WebMethod
    @WebResult(targetNamespace = "")
    public String updateMedicalRecord(
            @WebParam(name = "patientId") String patientId,
            @WebParam(name = "newMedicalHistory") String newMedicalHistory);

    @WebMethod
    @WebResult(targetNamespace = "")
    public boolean deleteMedicalRecord(
            @WebParam(name = "patientId") String patientId);
}