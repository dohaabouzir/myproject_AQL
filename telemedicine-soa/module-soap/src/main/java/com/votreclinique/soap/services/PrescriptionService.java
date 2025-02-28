package com.votreclinique.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PrescriptionService {

    @WebMethod
    @WebResult(targetNamespace = "")
    public String addPrescription(
            @WebParam(name = "prescriptionId") String prescriptionId,
            @WebParam(name = "details") String details);

    @WebMethod
    @WebResult(targetNamespace = "")
    public String getPrescription(
            @WebParam(name = "prescriptionId") String prescriptionId);

    @WebMethod
    @WebResult(targetNamespace = "")
    public String updatePrescription(
            @WebParam(name = "prescriptionId") String prescriptionId,
            @WebParam(name = "updatedDetails") String updatedDetails);

    @WebMethod
    @WebResult(targetNamespace = "")
    public boolean deletePrescription(
            @WebParam(name = "prescriptionId") String prescriptionId);
}