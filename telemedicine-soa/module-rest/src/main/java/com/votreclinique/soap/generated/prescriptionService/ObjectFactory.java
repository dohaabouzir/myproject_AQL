
package com.votreclinique.soap.generated.prescriptionService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.votreclinique.soap.generated.prescriptionService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPrescriptionResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "addPrescriptionResponse");
    private final static QName _DeletePrescription_QNAME = new QName("http://services.soap.votreclinique.com/", "deletePrescription");
    private final static QName _GetPrescription_QNAME = new QName("http://services.soap.votreclinique.com/", "getPrescription");
    private final static QName _AddPrescription_QNAME = new QName("http://services.soap.votreclinique.com/", "addPrescription");
    private final static QName _UpdatePrescription_QNAME = new QName("http://services.soap.votreclinique.com/", "updatePrescription");
    private final static QName _DeletePrescriptionResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "deletePrescriptionResponse");
    private final static QName _UpdatePrescriptionResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "updatePrescriptionResponse");
    private final static QName _GetPrescriptionResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "getPrescriptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.votreclinique.soap.generated.prescriptionService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPrescriptionResponse }
     * 
     */
    public AddPrescriptionResponse createAddPrescriptionResponse() {
        return new AddPrescriptionResponse();
    }

    /**
     * Create an instance of {@link DeletePrescription }
     * 
     */
    public DeletePrescription createDeletePrescription() {
        return new DeletePrescription();
    }

    /**
     * Create an instance of {@link GetPrescription }
     * 
     */
    public GetPrescription createGetPrescription() {
        return new GetPrescription();
    }

    /**
     * Create an instance of {@link AddPrescription }
     * 
     */
    public AddPrescription createAddPrescription() {
        return new AddPrescription();
    }

    /**
     * Create an instance of {@link UpdatePrescription }
     * 
     */
    public UpdatePrescription createUpdatePrescription() {
        return new UpdatePrescription();
    }

    /**
     * Create an instance of {@link DeletePrescriptionResponse }
     * 
     */
    public DeletePrescriptionResponse createDeletePrescriptionResponse() {
        return new DeletePrescriptionResponse();
    }

    /**
     * Create an instance of {@link UpdatePrescriptionResponse }
     * 
     */
    public UpdatePrescriptionResponse createUpdatePrescriptionResponse() {
        return new UpdatePrescriptionResponse();
    }

    /**
     * Create an instance of {@link GetPrescriptionResponse }
     * 
     */
    public GetPrescriptionResponse createGetPrescriptionResponse() {
        return new GetPrescriptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "addPrescriptionResponse")
    public JAXBElement<AddPrescriptionResponse> createAddPrescriptionResponse(AddPrescriptionResponse value) {
        return new JAXBElement<AddPrescriptionResponse>(_AddPrescriptionResponse_QNAME, AddPrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "deletePrescription")
    public JAXBElement<DeletePrescription> createDeletePrescription(DeletePrescription value) {
        return new JAXBElement<DeletePrescription>(_DeletePrescription_QNAME, DeletePrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "getPrescription")
    public JAXBElement<GetPrescription> createGetPrescription(GetPrescription value) {
        return new JAXBElement<GetPrescription>(_GetPrescription_QNAME, GetPrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "addPrescription")
    public JAXBElement<AddPrescription> createAddPrescription(AddPrescription value) {
        return new JAXBElement<AddPrescription>(_AddPrescription_QNAME, AddPrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "updatePrescription")
    public JAXBElement<UpdatePrescription> createUpdatePrescription(UpdatePrescription value) {
        return new JAXBElement<UpdatePrescription>(_UpdatePrescription_QNAME, UpdatePrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "deletePrescriptionResponse")
    public JAXBElement<DeletePrescriptionResponse> createDeletePrescriptionResponse(DeletePrescriptionResponse value) {
        return new JAXBElement<DeletePrescriptionResponse>(_DeletePrescriptionResponse_QNAME, DeletePrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "updatePrescriptionResponse")
    public JAXBElement<UpdatePrescriptionResponse> createUpdatePrescriptionResponse(UpdatePrescriptionResponse value) {
        return new JAXBElement<UpdatePrescriptionResponse>(_UpdatePrescriptionResponse_QNAME, UpdatePrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "getPrescriptionResponse")
    public JAXBElement<GetPrescriptionResponse> createGetPrescriptionResponse(GetPrescriptionResponse value) {
        return new JAXBElement<GetPrescriptionResponse>(_GetPrescriptionResponse_QNAME, GetPrescriptionResponse.class, null, value);
    }

}
