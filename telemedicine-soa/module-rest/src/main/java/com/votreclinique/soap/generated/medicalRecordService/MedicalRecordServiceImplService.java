
package com.votreclinique.soap.generated.medicalRecordService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MedicalRecordServiceImplService", targetNamespace = "http://impl.services.soap.votreclinique.com/", wsdlLocation = "http://localhost:9091/medicalRecordService?wsdl")
public class MedicalRecordServiceImplService
    extends Service
{

    private final static URL MEDICALRECORDSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MEDICALRECORDSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MEDICALRECORDSERVICEIMPLSERVICE_QNAME = new QName("http://impl.services.soap.votreclinique.com/", "MedicalRecordServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9091/medicalRecordService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDICALRECORDSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MEDICALRECORDSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MedicalRecordServiceImplService() {
        super(__getWsdlLocation(), MEDICALRECORDSERVICEIMPLSERVICE_QNAME);
    }

    public MedicalRecordServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDICALRECORDSERVICEIMPLSERVICE_QNAME, features);
    }

    public MedicalRecordServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MEDICALRECORDSERVICEIMPLSERVICE_QNAME);
    }

    public MedicalRecordServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDICALRECORDSERVICEIMPLSERVICE_QNAME, features);
    }

    public MedicalRecordServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MedicalRecordServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MedicalRecordService
     */
    @WebEndpoint(name = "MedicalRecordServiceImplPort")
    public MedicalRecordService getMedicalRecordServiceImplPort() {
        return super.getPort(new QName("http://impl.services.soap.votreclinique.com/", "MedicalRecordServiceImplPort"), MedicalRecordService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MedicalRecordService
     */
    @WebEndpoint(name = "MedicalRecordServiceImplPort")
    public MedicalRecordService getMedicalRecordServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.services.soap.votreclinique.com/", "MedicalRecordServiceImplPort"), MedicalRecordService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDICALRECORDSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MEDICALRECORDSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MEDICALRECORDSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
