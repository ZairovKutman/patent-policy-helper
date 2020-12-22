
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CheckResponseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckResponseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TaxDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimePosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="State" type="{http://tunduk-sf.x-road.fi/producer}PolicyStatus"/>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckResponseInfo", propOrder = {
    "numPolicy",
    "policyDate",
    "taxDivision",
    "timePosition",
    "state",
    "errorText"
})
public class CheckResponseInfo {

    @XmlElement(name = "NumPolicy")
    protected String numPolicy;
    @XmlElement(name = "PolicyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyDate;
    @XmlElement(name = "TaxDivision")
    protected String taxDivision;
    @XmlElement(name = "TimePosition", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePosition;
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected PolicyStatus state;
    @XmlElement(name = "ErrorText")
    protected String errorText;

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
     * Gets the value of the timePosition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimePosition() {
        return timePosition;
    }

    /**
     * Sets the value of the timePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimePosition(XMLGregorianCalendar value) {
        this.timePosition = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyStatus }
     *     
     */
    public PolicyStatus getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyStatus }
     *     
     */
    public void setState(PolicyStatus value) {
        this.state = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

}
