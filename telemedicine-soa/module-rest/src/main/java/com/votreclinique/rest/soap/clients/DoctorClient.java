package com.votreclinique.rest.soap.clients;

import com.votreclinique.soap.generated.doctorService.DoctorService;
import com.votreclinique.soap.generated.doctorService.DoctorServiceImplService;

public class DoctorClient {

    private DoctorService doctorService;

    public DoctorClient() {
        DoctorServiceImplService service = new DoctorServiceImplService();
        this.doctorService = service.getDoctorServiceImplPort();
    }

    public DoctorService getDoctorService() {
        return doctorService;
    }
}