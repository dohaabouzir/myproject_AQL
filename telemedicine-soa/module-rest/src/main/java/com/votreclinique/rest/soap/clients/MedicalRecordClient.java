package com.votreclinique.rest.soap.clients;

import com.votreclinique.soap.generated.medicalRecordService.MedicalRecordService;
import com.votreclinique.soap.generated.medicalRecordService.MedicalRecordServiceImplService;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
@Service
public class MedicalRecordClient {

    private final MedicalRecordServiceImplService service = new MedicalRecordServiceImplService();
    private final MedicalRecordService port = service.getMedicalRecordServiceImplPort();

    private static final String ENDPOINT = "http://localhost:9091/medicalRecordService";

    public MedicalRecordClient() {
        // Configurer l'URL de l'endpoint SOAP
        ((BindingProvider) port).getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                ENDPOINT
        );
    }

    public String createMedicalRecord(String id, String history) {
        return port.createMedicalRecord(id, history);
    }

    public String getMedicalRecord(String id) {
        return port.getMedicalRecord(id);
    }

    public String updateMedicalRecord(String id, String newHistory) {
        return port.updateMedicalRecord(id, newHistory);
    }

    public boolean deleteMedicalRecord(String id) {
        return port.deleteMedicalRecord(id);
    }
}