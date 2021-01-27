
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MakePolicyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakePolicyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
@XmlType(name = "MakePolicyRequest", propOrder = {
    "xml",
    "requestOrg",
    "requestPerson"
})
public class MakePolicyRequest {

    @XmlElement(name = "XML")
    protected byte[] xml;
    @XmlElement(name = "RequestOrg")
    protected String requestOrg;
    @XmlElement(name = "RequestPerson")
    protected String requestPerson;

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXML() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXML(byte[] value) {
        this.xml = value;
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
