
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UploadState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RuntimeError"/>
 *     &lt;enumeration value="XmlValidationError"/>
 *     &lt;enumeration value="Success"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UploadState")
@XmlEnum
public enum UploadState {

    @XmlEnumValue("RuntimeError")
    RUNTIME_ERROR("RuntimeError"),
    @XmlEnumValue("XmlValidationError")
    XML_VALIDATION_ERROR("XmlValidationError"),
    @XmlEnumValue("Success")
    SUCCESS("Success");
    private final String value;

    UploadState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UploadState fromValue(String v) {
        for (UploadState c: UploadState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
