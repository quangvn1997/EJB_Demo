
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _CalutorFee_QNAME = new QName("http://service/", "calutorFee");
    private final static QName _CalutorFeeResponse_QNAME = new QName("http://service/", "calutorFeeResponse");
    private final static QName _Count_QNAME = new QName("http://service/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://service/", "countResponse");
    private final static QName _Create_QNAME = new QName("http://service/", "create");
    private final static QName _Edit_QNAME = new QName("http://service/", "edit");
    private final static QName _Find_QNAME = new QName("http://service/", "find");
    private final static QName _FindAll_QNAME = new QName("http://service/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://service/", "findAllResponse");
    private final static QName _FindRange_QNAME = new QName("http://service/", "findRange");
    private final static QName _FindRangeResponse_QNAME = new QName("http://service/", "findRangeResponse");
    private final static QName _FindResponse_QNAME = new QName("http://service/", "findResponse");
    private final static QName _GetListOrderbyCustormer_QNAME = new QName("http://service/", "getListOrderbyCustormer");
    private final static QName _GetListOrderbyCustormerResponse_QNAME = new QName("http://service/", "getListOrderbyCustormerResponse");
    private final static QName _GetListOrderbyUser_QNAME = new QName("http://service/", "getListOrderbyUser");
    private final static QName _GetListOrderbyUserResponse_QNAME = new QName("http://service/", "getListOrderbyUserResponse");
    private final static QName _Order1_QNAME = new QName("http://service/", "order1");
    private final static QName _Remove_QNAME = new QName("http://service/", "remove");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalutorFee }
     * 
     */
    public CalutorFee createCalutorFee() {
        return new CalutorFee();
    }

    /**
     * Create an instance of {@link CalutorFeeResponse }
     * 
     */
    public CalutorFeeResponse createCalutorFeeResponse() {
        return new CalutorFeeResponse();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetListOrderbyCustormer }
     * 
     */
    public GetListOrderbyCustormer createGetListOrderbyCustormer() {
        return new GetListOrderbyCustormer();
    }

    /**
     * Create an instance of {@link GetListOrderbyCustormerResponse }
     * 
     */
    public GetListOrderbyCustormerResponse createGetListOrderbyCustormerResponse() {
        return new GetListOrderbyCustormerResponse();
    }

    /**
     * Create an instance of {@link GetListOrderbyUser }
     * 
     */
    public GetListOrderbyUser createGetListOrderbyUser() {
        return new GetListOrderbyUser();
    }

    /**
     * Create an instance of {@link GetListOrderbyUserResponse }
     * 
     */
    public GetListOrderbyUserResponse createGetListOrderbyUserResponse() {
        return new GetListOrderbyUserResponse();
    }

    /**
     * Create an instance of {@link Order1 }
     * 
     */
    public Order1 createOrder1() {
        return new Order1();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalutorFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calutorFee")
    public JAXBElement<CalutorFee> createCalutorFee(CalutorFee value) {
        return new JAXBElement<CalutorFee>(_CalutorFee_QNAME, CalutorFee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalutorFeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calutorFeeResponse")
    public JAXBElement<CalutorFeeResponse> createCalutorFeeResponse(CalutorFeeResponse value) {
        return new JAXBElement<CalutorFeeResponse>(_CalutorFeeResponse_QNAME, CalutorFeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOrderbyCustormer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getListOrderbyCustormer")
    public JAXBElement<GetListOrderbyCustormer> createGetListOrderbyCustormer(GetListOrderbyCustormer value) {
        return new JAXBElement<GetListOrderbyCustormer>(_GetListOrderbyCustormer_QNAME, GetListOrderbyCustormer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOrderbyCustormerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getListOrderbyCustormerResponse")
    public JAXBElement<GetListOrderbyCustormerResponse> createGetListOrderbyCustormerResponse(GetListOrderbyCustormerResponse value) {
        return new JAXBElement<GetListOrderbyCustormerResponse>(_GetListOrderbyCustormerResponse_QNAME, GetListOrderbyCustormerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOrderbyUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getListOrderbyUser")
    public JAXBElement<GetListOrderbyUser> createGetListOrderbyUser(GetListOrderbyUser value) {
        return new JAXBElement<GetListOrderbyUser>(_GetListOrderbyUser_QNAME, GetListOrderbyUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOrderbyUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getListOrderbyUserResponse")
    public JAXBElement<GetListOrderbyUserResponse> createGetListOrderbyUserResponse(GetListOrderbyUserResponse value) {
        return new JAXBElement<GetListOrderbyUserResponse>(_GetListOrderbyUserResponse_QNAME, GetListOrderbyUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "order1")
    public JAXBElement<Order1> createOrder1(Order1 value) {
        return new JAXBElement<Order1>(_Order1_QNAME, Order1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

}
