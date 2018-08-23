
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkUserKh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkUserKh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CodePin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkUserKh", propOrder = {
    "codeUser",
    "codePin"
})
public class CheckUserKh {

    @XmlElement(name = "CodeUser")
    protected int codeUser;
    @XmlElement(name = "CodePin")
    protected int codePin;

    /**
     * Gets the value of the codeUser property.
     * 
     */
    public int getCodeUser() {
        return codeUser;
    }

    /**
     * Sets the value of the codeUser property.
     * 
     */
    public void setCodeUser(int value) {
        this.codeUser = value;
    }

    /**
     * Gets the value of the codePin property.
     * 
     */
    public int getCodePin() {
        return codePin;
    }

    /**
     * Sets the value of the codePin property.
     * 
     */
    public void setCodePin(int value) {
        this.codePin = value;
    }

}
