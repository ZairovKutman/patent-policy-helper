
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPolicyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPolicyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanceledPolicies" type="{http://tunduk-sf.x-road.fi/producer}ArrayOfCancelPolicyInfo" minOccurs="0"/>
 *         &lt;element name="RequestOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPolicyRequest", propOrder = {
    "canceledPolicies",
    "requestOrg",
    "requestPerson"
})
public class CancelPolicyRequest {

    @XmlElement(name = "CanceledPolicies")
    protected ArrayOfCancelPolicyInfo canceledPolicies;
    @XmlElement(name = "RequestOrg")
    protected String requestOrg;
    @XmlElement(name = "RequestPerson")
    protected String requestPerson;

    /**
     * Gets the value of the canceledPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelPolicyInfo }
     *     
     */
    public ArrayOfCancelPolicyInfo getCanceledPolicies() {
        return canceledPolicies;
    }

    /**
     * Sets the value of the canceledPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelPolicyInfo }
     *     
     */
    public void setCanceledPolicies(ArrayOfCancelPolicyInfo value) {
        this.canceledPolicies = value;
    }

    /**
     * Gets the value of the requestOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestOrg() {
        return requestOrg;
    }

    /**
     * Sets the value of the requestOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestOrg(String value) {
        this.requestOrg = value;
    }

    /**
     * Gets the value of the requestPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestPerson() {
        return requestPerson;
    }

    /**
     * Sets the value of the requestPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPerson(String value) {
        this.requestPerson = value;
    }

}
