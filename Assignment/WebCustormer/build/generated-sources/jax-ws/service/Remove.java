
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remove complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remove"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="order1" type="{http://service/}order1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remove", propOrder = {
    "order1"
})
public class Remove {

    protected Order1 order1;

    /**
     * Gets the value of the order1 property.
     * 
     * @return
     *     possible object is
     *     {@link Order1 }
     *     
     */
    public Order1 getOrder1() {
        return order1;
    }

    /**
     * Sets the value of the order1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order1 }
     *     
     */
    public void setOrder1(Order1 value) {
        this.order1 = value;
    }

}
