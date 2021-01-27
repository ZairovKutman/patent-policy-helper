
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CancelPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPolicyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="State" type="{http://tunduk-sf.x-road.fi/producer}UploadState"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Policies" type="{http://tunduk-sf.x-road.fi/producer}ArrayOfPolicyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPolicyResponse", propOrder = {
    "state",
    "error",
    "issuer",
    "policies"
})
public class CancelPolicyResponse {

    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected UploadState state;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Issuer")
    protected String issuer;
    @XmlElement(name = "Policies")
    protected ArrayOfPolicyInfo policies;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link UploadState }
     *     
     */
    public UploadState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadState }
     *     
     */
    public void setState(UploadState value) {
        this.state = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPolicyInfo }
     *     
     */
    public ArrayOfPolicyInfo getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPolicyInfo }
     *     
     */
    public void setPolicies(ArrayOfPolicyInfo value) {
        this.policies = value;
    }

}
