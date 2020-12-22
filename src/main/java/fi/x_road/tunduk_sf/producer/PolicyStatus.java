
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotFound"/>
 *     &lt;enumeration value="InitialCheckFailed"/>
 *     &lt;enumeration value="SuccessUpload"/>
 *     &lt;enumeration value="SecondaryCheckFailed"/>
 *     &lt;enumeration value="NotPosted"/>
 *     &lt;enumeration value="Posted"/>
 *     &lt;enumeration value="RuntimeError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyStatus")
@XmlEnum
public enum PolicyStatus {

    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("InitialCheckFailed")
    INITIAL_CHECK_FAILED("InitialCheckFailed"),
    @XmlEnumValue("SuccessUpload")
    SUCCESS_UPLOAD("SuccessUpload"),
    @XmlEnumValue("SecondaryCheckFailed")
    SECONDARY_CHECK_FAILED("SecondaryCheckFailed"),
    @XmlEnumValue("NotPosted")
    NOT_POSTED("NotPosted"),
    @XmlEnumValue("Posted")
    POSTED("Posted"),
    @XmlEnumValue("RuntimeError")
    RUNTIME_ERROR("RuntimeError");
    private final String value;

    PolicyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyStatus fromValue(String v) {
        for (PolicyStatus c: PolicyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
