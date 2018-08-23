
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codegd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codepin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codeuser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="moneyuser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="passgd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user1", propOrder = {
    "codegd",
    "codepin",
    "codeuser",
    "moneyuser",
    "passgd"
})
public class User1 {

    protected Integer codegd;
    protected Integer codepin;
    protected Integer codeuser;
    protected Integer moneyuser;
    protected Integer passgd;

    /**
     * Gets the value of the codegd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodegd() {
        return codegd;
    }

    /**
     * Sets the value of the codegd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodegd(Integer value) {
        this.codegd = value;
    }

    /**
     * Gets the value of the codepin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodepin() {
        return codepin;
    }

    /**
     * Sets the value of the codepin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodepin(Integer value) {
        this.codepin = value;
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
     * Gets the value of the moneyuser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneyuser() {
        return moneyuser;
    }

    /**
     * Sets the value of the moneyuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneyuser(Integer value) {
        this.moneyuser = value;
    }

    /**
     * Gets the value of the passgd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassgd() {
        return passgd;
    }

    /**
     * Sets the value of the passgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassgd(Integer value) {
        this.passgd = value;
    }

}
