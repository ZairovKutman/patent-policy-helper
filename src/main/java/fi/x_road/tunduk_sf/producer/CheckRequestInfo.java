
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CheckRequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BaseDocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TaxDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRequestInfo", propOrder = {
    "numPolicy",
    "policyDate",
    "baseDocDate",
    "taxDivision"
})
public class CheckRequestInfo {

    @XmlElement(name = "NumPolicy")
    protected String numPolicy;
    @XmlElement(name = "PolicyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyDate;
    @XmlElement(name = "BaseDocDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar baseDocDate;
    @XmlElement(name = "TaxDivision")
    protected String taxDivision;

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

}
