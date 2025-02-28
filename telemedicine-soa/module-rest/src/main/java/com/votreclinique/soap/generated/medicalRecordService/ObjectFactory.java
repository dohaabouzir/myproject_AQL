
package com.votreclinique.soap.generated.medicalRecordService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.votreclinique.soap.generated.medicalRecordService package. 
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

    private final static QName _CreateMedicalRecordResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "createMedicalRecordResponse");
    private final static QName _GetMedicalRecord_QNAME = new QName("http://services.soap.votreclinique.com/", "getMedicalRecord");
    private final static QName _GetMedicalRecordResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "getMedicalRecordResponse");
    private final static QName _UpdateMedicalRecordResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "updateMedicalRecordResponse");
    private final static QName _DeleteMedicalRecordResponse_QNAME = new QName("http://services.soap.votreclinique.com/", "deleteMedicalRecordResponse");
    private final static QName _CreateMedicalRecord_QNAME = new QName("http://services.soap.votreclinique.com/", "createMedicalRecord");
    private final static QName _UpdateMedicalRecord_QNAME = new QName("http://services.soap.votreclinique.com/", "updateMedicalRecord");
    private final static QName _DeleteMedicalRecord_QNAME = new QName("http://services.soap.votreclinique.com/", "deleteMedicalRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.votreclinique.soap.generated.medicalRecordService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateMedicalRecordResponse }
     * 
     */
    public CreateMedicalRecordResponse createCreateMedicalRecordResponse() {
        return new CreateMedicalRecordResponse();
    }

    /**
     * Create an instance of {@link GetMedicalRecord }
     * 
     */
    public GetMedicalRecord createGetMedicalRecord() {
        return new GetMedicalRecord();
    }

    /**
     * Create an instance of {@link GetMedicalRecordResponse }
     * 
     */
    public GetMedicalRecordResponse createGetMedicalRecordResponse() {
        return new GetMedicalRecordResponse();
    }

    /**
     * Create an instance of {@link UpdateMedicalRecordResponse }
     * 
     */
    public UpdateMedicalRecordResponse createUpdateMedicalRecordResponse() {
        return new UpdateMedicalRecordResponse();
    }

    /**
     * Create an instance of {@link DeleteMedicalRecordResponse }
     * 
     */
    public DeleteMedicalRecordResponse createDeleteMedicalRecordResponse() {
        return new DeleteMedicalRecordResponse();
    }

    /**
     * Create an instance of {@link CreateMedicalRecord }
     * 
     */
    public CreateMedicalRecord createCreateMedicalRecord() {
        return new CreateMedicalRecord();
    }

    /**
     * Create an instance of {@link UpdateMedicalRecord }
     * 
     */
    public UpdateMedicalRecord createUpdateMedicalRecord() {
        return new UpdateMedicalRecord();
    }

    /**
     * Create an instance of {@link DeleteMedicalRecord }
     * 
     */
    public DeleteMedicalRecord createDeleteMedicalRecord() {
        return new DeleteMedicalRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedicalRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "createMedicalRecordResponse")
    public JAXBElement<CreateMedicalRecordResponse> createCreateMedicalRecordResponse(CreateMedicalRecordResponse value) {
        return new JAXBElement<CreateMedicalRecordResponse>(_CreateMedicalRecordResponse_QNAME, CreateMedicalRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "getMedicalRecord")
    public JAXBElement<GetMedicalRecord> createGetMedicalRecord(GetMedicalRecord value) {
        return new JAXBElement<GetMedicalRecord>(_GetMedicalRecord_QNAME, GetMedicalRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "getMedicalRecordResponse")
    public JAXBElement<GetMedicalRecordResponse> createGetMedicalRecordResponse(GetMedicalRecordResponse value) {
        return new JAXBElement<GetMedicalRecordResponse>(_GetMedicalRecordResponse_QNAME, GetMedicalRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMedicalRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "updateMedicalRecordResponse")
    public JAXBElement<UpdateMedicalRecordResponse> createUpdateMedicalRecordResponse(UpdateMedicalRecordResponse value) {
        return new JAXBElement<UpdateMedicalRecordResponse>(_UpdateMedicalRecordResponse_QNAME, UpdateMedicalRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMedicalRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "deleteMedicalRecordResponse")
    public JAXBElement<DeleteMedicalRecordResponse> createDeleteMedicalRecordResponse(DeleteMedicalRecordResponse value) {
        return new JAXBElement<DeleteMedicalRecordResponse>(_DeleteMedicalRecordResponse_QNAME, DeleteMedicalRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedicalRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "createMedicalRecord")
    public JAXBElement<CreateMedicalRecord> createCreateMedicalRecord(CreateMedicalRecord value) {
        return new JAXBElement<CreateMedicalRecord>(_CreateMedicalRecord_QNAME, CreateMedicalRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMedicalRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "updateMedicalRecord")
    public JAXBElement<UpdateMedicalRecord> createUpdateMedicalRecord(UpdateMedicalRecord value) {
        return new JAXBElement<UpdateMedicalRecord>(_UpdateMedicalRecord_QNAME, UpdateMedicalRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMedicalRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.votreclinique.com/", name = "deleteMedicalRecord")
    public JAXBElement<DeleteMedicalRecord> createDeleteMedicalRecord(DeleteMedicalRecord value) {
        return new JAXBElement<DeleteMedicalRecord>(_DeleteMedicalRecord_QNAME, DeleteMedicalRecord.class, null, value);
    }

}
