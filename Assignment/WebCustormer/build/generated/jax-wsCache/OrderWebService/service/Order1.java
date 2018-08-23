
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for order1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codecustomer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codeorder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codeuser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dateorder" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="feeorder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="moneyorder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nameorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order1", propOrder = {
    "codecustomer",
    "codeorder",
    "codeuser",
    "dateorder",
    "feeorder",
    "moneyorder",
    "nameorder"
})
public class Order1 {

    protected Integer codecustomer;
    protected Integer codeorder;
    protected Integer codeuser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateorder;
    protected Integer feeorder;
    protected Integer moneyorder;
    protected String nameorder;

    /**
     * Gets the value of the codecustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodecustomer() {
        return codecustomer;
    }

    /**
     * Sets the value of the codecustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodecustomer(Integer value) {
        this.codecustomer = value;
    }

    /**
     * Gets the value of the codeorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodeorder() {
        return codeorder;
    }

    /**
     * Sets the value of the codeorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeorder(Integer value) {
        this.codeorder = value;
    }

    /**
     * Gets the value of the codeuser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodeuser() {
        return codeuser;
    }

    /**
     * Sets the value of the codeuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeuser(Integer value) {
        this.codeuser = value;
    }

    /**
     * Gets the value of the dateorder property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateorder() {
        return dateorder;
    }

    /**
     * Sets the value of the dateorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateorder(XMLGregorianCalendar value) {
        this.dateorder = value;
    }

    /**
     * Gets the value of the feeorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeorder() {
        return feeorder;
    }

    /**
     * Sets the value of the feeorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeorder(Integer value) {
        this.feeorder = value;
    }

    /**
     * Gets the value of the moneyorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneyorder() {
        return moneyorder;
    }

    /**
     * Sets the value of the moneyorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneyorder(Integer value) {
        this.moneyorder = value;
    }

    /**
     * Gets the value of the nameorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameorder() {
        return nameorder;
    }

    /**
     * Sets the value of the nameorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameorder(String value) {
        this.nameorder = value;
    }

}
