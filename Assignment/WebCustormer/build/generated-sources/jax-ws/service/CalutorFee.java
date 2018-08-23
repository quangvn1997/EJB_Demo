
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calutorFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calutorFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moneyOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calutorFee", propOrder = {
    "moneyOrder"
})
public class CalutorFee {

    protected int moneyOrder;

    /**
     * Gets the value of the moneyOrder property.
     * 
     */
    public int getMoneyOrder() {
        return moneyOrder;
    }

    /**
     * Sets the value of the moneyOrder property.
     * 
     */
    public void setMoneyOrder(int value) {
        this.moneyOrder = value;
    }

}
