
package com.votreclinique.soap.generated.doctorService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.votreclinique.soap.generated.doctorService package. 
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

    private final static QName _DeleteDoctorResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "deleteDoctorResponse");
    private final static QName _GetDoctor_QNAME = new QName("http://services.soap.votreclinique.com/", "getDoctor");
    private final static QName _DeleteDoctor_QNAME = new QName("http://services.soap.votreclinique.com/", "deleteDoctor");
    private final static QName _AddDoctor_QNAME = new QName("http://services.soap.votreclinique.com/", "addDoctor");
    private final static QName _GetDoctorResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "getDoctorResponse");
    private final static QName _UpdateDoctor_QNAME = new QName("http://services.soap.votreclinique.com/", "updateDoctor");
    private final static QName _AddDoctorResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "addDoctorResponse");
    private final static QName _UpdateDoctorResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "updateDoctorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.votreclinique.soap.generated.doctorService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteDoctorResponse }
     * 
     */
    public DeleteDoctorResponse createDeleteDoctorResponse() {
        return new DeleteDoctorResponse();
    }

    /**
     * Create an instance of {@link GetDoctor }
     * 
     */
    public GetDoctor createGetDoctor() {
        return new GetDoctor();
    }

    /**
     * Create an instance of {@link DeleteDoctor }
     * 
     */
    public DeleteDoctor createDeleteDoctor() {
        return new DeleteDoctor();
    }

    /**
     * Create an instance of {@link AddDoctor }
     * 
     */
    public AddDoctor createAddDoctor() {
        return new AddDoctor();
    }

    /**
     * Create an instance of {@link GetDoctorResponse }
     * 
     */
    public GetDoctorResponse createGetDoctorResponse() {
        return new GetDoctorResponse();
    }

    /**
     * Create an instance of {@link UpdateDoctor }
     * 
     */
    public UpdateDoctor createUpdateDoctor() {
        return new UpdateDoctor();
    }

    /**
     * Create an instance of {@link AddDoctorResponse }
     * 
     */
    public AddDoctorResponse createAddDoctorResponse() {
        return new AddDoctorResponse();
    }

    /**
     * Create an instance of {@link UpdateDoctorResponse }
     * 
     */
    public UpdateDoctorResponse createUpdateDoctorResponse() {
        return new UpdateDoctorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "deleteDoctorResponse")
    public JAXBElement<DeleteDoctorResponse> createDeleteDoctorResponse(DeleteDoctorResponse value) {
        return new JAXBElement<DeleteDoctorResponse>(_DeleteDoctorResponse_QNAME, DeleteDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "getDoctor")
    public JAXBElement<GetDoctor> createGetDoctor(GetDoctor value) {
        return new JAXBElement<GetDoctor>(_GetDoctor_QNAME, GetDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "deleteDoctor")
    public JAXBElement<DeleteDoctor> createDeleteDoctor(DeleteDoctor value) {
        return new JAXBElement<DeleteDoctor>(_DeleteDoctor_QNAME, DeleteDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "addDoctor")
    public JAXBElement<AddDoctor> createAddDoctor(AddDoctor value) {
        return new JAXBElement<AddDoctor>(_AddDoctor_QNAME, AddDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "getDoctorResponse")
    public JAXBElement<GetDoctorResponse> createGetDoctorResponse(GetDoctorResponse value) {
        return new JAXBElement<GetDoctorResponse>(_GetDoctorResponse_QNAME, GetDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "updateDoctor")
    public JAXBElement<UpdateDoctor> createUpdateDoctor(UpdateDoctor value) {
        return new JAXBElement<UpdateDoctor>(_UpdateDoctor_QNAME, UpdateDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "addDoctorResponse")
    public JAXBElement<AddDoctorResponse> createAddDoctorResponse(AddDoctorResponse value) {
        return new JAXBElement<AddDoctorResponse>(_AddDoctorResponse_QNAME, AddDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "updateDoctorResponse")
    public JAXBElement<UpdateDoctorResponse> createUpdateDoctorResponse(UpdateDoctorResponse value) {
        return new JAXBElement<UpdateDoctorResponse>(_UpdateDoctorResponse_QNAME, UpdateDoctorResponse.class, null, value);
    }

}
