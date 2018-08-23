
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkUserCs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkUserCs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeDG" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="passDG" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkUserCs", propOrder = {
    "codeDG",
    "passDG"
})
public class CheckUserCs {

    protected int codeDG;
    protected int passDG;

    /**
     * Gets the value of the codeDG property.
     * 
     */
    public int getCodeDG() {
        return codeDG;
    }

    /**
     * Sets the value of the codeDG property.
     * 
     */
    public void setCodeDG(int value) {
        this.codeDG = value;
    }

    /**
     * Gets the value of the passDG property.
     * 
     */
    public int getPassDG() {
        return passDG;
    }

    /**
     * Sets the value of the passDG property.
     * 
     */
    public void setPassDG(int value) {
        this.passDG = value;
    }

}
