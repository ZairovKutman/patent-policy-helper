
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CancelPolicyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseDocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPolicyInfo", propOrder = {
    "taxDivision",
    "policyDate",
    "numPolicy",
    "pin",
    "baseDocDate"
})
public class CancelPolicyInfo {

    @XmlElement(name = "TaxDivision")
    protected String taxDivision;
    @XmlElement(name = "PolicyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyDate;
    @XmlElement(name = "NumPolicy")
    protected String numPolicy;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "BaseDocDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar baseDocDate;

    /**
     * Gets the value of the taxDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDivision() {
        return taxDivision;
    }

    /**
     * Sets the value of the taxDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDivision(String value) {
        this.taxDivision = value;
    }

    /**
     * Gets the value of the policyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyDate() {
        return policyDate;
    }

    /**
     * Sets the value of the policyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyDate(XMLGregorianCalendar value) {
        this.policyDate = value;
    }

    /**
     * Gets the value of the numPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPolicy() {
        return numPolicy;
    }

    /**
     * Sets the value of the numPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPolicy(String value) {
        this.numPolicy = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the baseDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBaseDocDate() {
        return baseDocDate;
    }

    /**
     * Sets the value of the baseDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBaseDocDate(XMLGregorianCalendar value) {
        this.baseDocDate = value;
    }

}
