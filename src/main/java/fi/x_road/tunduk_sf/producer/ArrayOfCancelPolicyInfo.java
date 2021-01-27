
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCancelPolicyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancelPolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelPolicyInfo" type="{http://tunduk-sf.x-road.fi/producer}CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancelPolicyInfo", propOrder = {
    "cancelPolicyInfo"
})
public class ArrayOfCancelPolicyInfo {

    @XmlElement(name = "CancelPolicyInfo", nillable = true)
    protected List<CancelPolicyInfo> cancelPolicyInfo;

    /**
     * Gets the value of the cancelPolicyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPolicyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPolicyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPolicyInfo }
     * 
     * 
     */
    public List<CancelPolicyInfo> getCancelPolicyInfo() {
        if (cancelPolicyInfo == null) {
            cancelPolicyInfo = new ArrayList<CancelPolicyInfo>();
        }
        return this.cancelPolicyInfo;
    }

}
