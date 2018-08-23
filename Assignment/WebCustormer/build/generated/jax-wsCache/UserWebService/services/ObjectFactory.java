
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _CheckUserCs_QNAME = new QName("http://service/", "checkUserCs");
    private final static QName _CheckUserCsResponse_QNAME = new QName("http://service/", "checkUserCsResponse");
    private final static QName _CheckUserKh_QNAME = new QName("http://service/", "checkUserKh");
    private final static QName _CheckUserKhResponse_QNAME = new QName("http://service/", "checkUserKhResponse");
    private final static QName _EditUser_QNAME = new QName("http://service/", "editUser");
    private final static QName _EditUserResponse_QNAME = new QName("http://service/", "editUserResponse");
    private final static QName _EditUserWithId_QNAME = new QName("http://service/", "editUserWithId");
    private final static QName _EditUserWithIdResponse_QNAME = new QName("http://service/", "editUserWithIdResponse");
    private final static QName _User1_QNAME = new QName("http://service/", "user1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckUserCs }
     * 
     */
    public CheckUserCs createCheckUserCs() {
        return new CheckUserCs();
    }

    /**
     * Create an instance of {@link CheckUserCsResponse }
     * 
     */
    public CheckUserCsResponse createCheckUserCsResponse() {
        return new CheckUserCsResponse();
    }

    /**
     * Create an instance of {@link CheckUserKh }
     * 
     */
    public CheckUserKh createCheckUserKh() {
        return new CheckUserKh();
    }

    /**
     * Create an instance of {@link CheckUserKhResponse }
     * 
     */
    public CheckUserKhResponse createCheckUserKhResponse() {
        return new CheckUserKhResponse();
    }

    /**
     * Create an instance of {@link EditUser }
     * 
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link EditUserWithId }
     * 
     */
    public EditUserWithId createEditUserWithId() {
        return new EditUserWithId();
    }

    /**
     * Create an instance of {@link EditUserWithIdResponse }
     * 
     */
    public EditUserWithIdResponse createEditUserWithIdResponse() {
        return new EditUserWithIdResponse();
    }

    /**
     * Create an instance of {@link User1 }
     * 
     */
    public User1 createUser1() {
        return new User1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserCs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkUserCs")
    public JAXBElement<CheckUserCs> createCheckUserCs(CheckUserCs value) {
        return new JAXBElement<CheckUserCs>(_CheckUserCs_QNAME, CheckUserCs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserCsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkUserCsResponse")
    public JAXBElement<CheckUserCsResponse> createCheckUserCsResponse(CheckUserCsResponse value) {
        return new JAXBElement<CheckUserCsResponse>(_CheckUserCsResponse_QNAME, CheckUserCsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserKh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkUserKh")
    public JAXBElement<CheckUserKh> createCheckUserKh(CheckUserKh value) {
        return new JAXBElement<CheckUserKh>(_CheckUserKh_QNAME, CheckUserKh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserKhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkUserKhResponse")
    public JAXBElement<CheckUserKhResponse> createCheckUserKhResponse(CheckUserKhResponse value) {
        return new JAXBElement<CheckUserKhResponse>(_CheckUserKhResponse_QNAME, CheckUserKhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "editUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<EditUser>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "editUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<EditUserResponse>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserWithId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "editUserWithId")
    public JAXBElement<EditUserWithId> createEditUserWithId(EditUserWithId value) {
        return new JAXBElement<EditUserWithId>(_EditUserWithId_QNAME, EditUserWithId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserWithIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "editUserWithIdResponse")
    public JAXBElement<EditUserWithIdResponse> createEditUserWithIdResponse(EditUserWithIdResponse value) {
        return new JAXBElement<EditUserWithIdResponse>(_EditUserWithIdResponse_QNAME, EditUserWithIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "user1")
    public JAXBElement<User1> createUser1(User1 value) {
        return new JAXBElement<User1>(_User1_QNAME, User1 .class, null, value);
    }

}
