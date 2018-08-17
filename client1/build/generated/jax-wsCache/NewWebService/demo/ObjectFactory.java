
package demo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demo package. 
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

    private final static QName _CheckAccount_QNAME = new QName("http://service/", "CheckAccount");
    private final static QName _Payment_QNAME = new QName("http://service/", "Payment");
    private final static QName _PaymentResponse_QNAME = new QName("http://service/", "PaymentResponse");
    private final static QName _Account_QNAME = new QName("http://service/", "account");
    private final static QName _CheckAccountResponse_QNAME = new QName("http://service/", "CheckAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link CheckAccount }
     * 
     */
    public CheckAccount createCheckAccount() {
        return new CheckAccount();
    }

    /**
     * Create an instance of {@link CheckAccountResponse }
     * 
     */
    public CheckAccountResponse createCheckAccountResponse() {
        return new CheckAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CheckAccount")
    public JAXBElement<CheckAccount> createCheckAccount(CheckAccount value) {
        return new JAXBElement<CheckAccount>(_CheckAccount_QNAME, CheckAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Payment")
    public JAXBElement<Payment> createPayment(Payment value) {
        return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "PaymentResponse")
    public JAXBElement<PaymentResponse> createPaymentResponse(PaymentResponse value) {
        return new JAXBElement<PaymentResponse>(_PaymentResponse_QNAME, PaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CheckAccountResponse")
    public JAXBElement<CheckAccountResponse> createCheckAccountResponse(CheckAccountResponse value) {
        return new JAXBElement<CheckAccountResponse>(_CheckAccountResponse_QNAME, CheckAccountResponse.class, null, value);
    }

}
