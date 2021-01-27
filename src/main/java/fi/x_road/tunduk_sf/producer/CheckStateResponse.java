
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckStateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PoliciesInfo" type="{http://tunduk-sf.x-road.fi/producer}ArrayOfCheckResponseInfo" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStateResponse", propOrder = {
    "policiesInfo",
    "error",
    "issuer"
})
public class CheckStateResponse {

    @XmlElement(name = "PoliciesInfo")
    protected ArrayOfCheckResponseInfo policiesInfo;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Issuer")
    protected String issuer;

    /**
     * Gets the value of the policiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckResponseInfo }
     *     
     */
    public ArrayOfCheckResponseInfo getPoliciesInfo() {
        return policiesInfo;
    }

    /**
     * Sets the value of the policiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckResponseInfo }
     *     
     */
    public void setPoliciesInfo(ArrayOfCheckResponseInfo value) {
        this.policiesInfo = value;
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

}
