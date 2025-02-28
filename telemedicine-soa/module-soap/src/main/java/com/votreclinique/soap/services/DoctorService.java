package com.votreclinique.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface DoctorService {

    @WebMethod
    @WebResult(targetNamespace = "")
    public String addDoctor(
            @WebParam(name = "doctorId") String doctorId,
            @WebParam(name = "doctorName") String doctorName);

    @WebMethod
    @WebResult(targetNamespace = "")
    public String getDoctor(
            @WebParam(name = "doctorId") String doctorId);

    @WebMethod
    @WebResult(targetNamespace = "")
    public String updateDoctor(
            @WebParam(name = "doctorId") String doctorId,
            @WebParam(name = "updatedDoctorName") String updatedDoctorName);

    @WebMethod
    @WebResult(targetNamespace = "")
    public boolean deleteDoctor(
            @WebParam(name = "doctorId") String doctorId);
}