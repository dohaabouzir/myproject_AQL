package com.votreclinique.rest.soap.clients;

import com.votreclinique.soap.generated.prescriptionService.PrescriptionService;
import com.votreclinique.soap.generated.prescriptionService.PrescriptionServiceImplService;

public class PrescriptionClient {

    private PrescriptionService prescriptionService;

    public PrescriptionClient() {
        PrescriptionServiceImplService service = new PrescriptionServiceImplService();
        this.prescriptionService = service.getPrescriptionServiceImplPort();
    }

    public PrescriptionService getPrescriptionService() {
        return prescriptionService;
    }
}