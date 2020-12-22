
package fi.x_road.tunduk_sf.producer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fi.x_road.tunduk_sf.producer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MakePolicyResponse_QNAME = new QName("http://tunduk-sf.x-road.fi/producer", "MakePolicyResponse");
    private final static QName _CheckStateResponse_QNAME = new QName("http://tunduk-sf.x-road.fi/producer", "CheckStateResponse");
    private final static QName _CancelPolicy_QNAME = new QName("http://tunduk-sf.x-road.fi/producer", "CancelPolicy");
    private final static QName _MakePolicy_QNAME = new QName("http://tunduk-sf.x-road.fi/producer", "MakePolicy");
    private final static QName _CheckState_QNAME = new QName("http://tunduk-sf.x-road.fi/producer", "CheckState");
    private final static QName _CancelPolicyResponse_QNAME = new QName("http://tunduk-sf.x-road.fi/producer", "CancelPolicyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fi.x_road.tunduk_sf.producer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakePolicyResponse }
     * 
     */
    public MakePolicyResponse createMakePolicyResponse() {
        return new MakePolicyResponse();
    }

    /**
     * Create an instance of {@link CancelPolicyRequest }
     * 
     */
    public CancelPolicyRequest createCancelPolicyRequest() {
        return new CancelPolicyRequest();
    }

    /**
     * Create an instance of {@link MakePolicyRequest }
     * 
     */
    public MakePolicyRequest createMakePolicyRequest() {
        return new MakePolicyRequest();
    }

    /**
     * Create an instance of {@link CheckStateRequest }
     * 
     */
    public CheckStateRequest createCheckStateRequest() {
        return new CheckStateRequest();
    }

    /**
     * Create an instance of {@link CancelPolicyResponse }
     * 
     */
    public CancelPolicyResponse createCancelPolicyResponse() {
        return new CancelPolicyResponse();
    }

    /**
     * Create an instance of {@link CheckStateResponse }
     * 
     */
    public CheckStateResponse createCheckStateResponse() {
        return new CheckStateResponse();
    }

    /**
     * Create an instance of {@link PolicyInfo }
     * 
     */
    public PolicyInfo createPolicyInfo() {
        return new PolicyInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPolicyInfo }
     * 
     */
    public ArrayOfPolicyInfo createArrayOfPolicyInfo() {
        return new ArrayOfPolicyInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCheckResponseInfo }
     * 
     */
    public ArrayOfCheckResponseInfo createArrayOfCheckResponseInfo() {
        return new ArrayOfCheckResponseInfo();
    }

    /**
     * Create an instance of {@link CheckResponseInfo }
     * 
     */
    public CheckResponseInfo createCheckResponseInfo() {
        return new CheckResponseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCancelPolicyInfo }
     * 
     */
    public ArrayOfCancelPolicyInfo createArrayOfCancelPolicyInfo() {
        return new ArrayOfCancelPolicyInfo();
    }

    /**
     * Create an instance of {@link CancelPolicyInfo }
     * 
     */
    public CancelPolicyInfo createCancelPolicyInfo() {
        return new CancelPolicyInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCheckRequestInfo }
     * 
     */
    public ArrayOfCheckRequestInfo createArrayOfCheckRequestInfo() {
        return new ArrayOfCheckRequestInfo();
    }

    /**
     * Create an instance of {@link CheckRequestInfo }
     * 
     */
    public CheckRequestInfo createCheckRequestInfo() {
        return new CheckRequestInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tunduk-sf.x-road.fi/producer", name = "MakePolicyResponse")
    public JAXBElement<MakePolicyResponse> createMakePolicyResponse(MakePolicyResponse value) {
        return new JAXBElement<MakePolicyResponse>(_MakePolicyResponse_QNAME, MakePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tunduk-sf.x-road.fi/producer", name = "CheckStateResponse")
    public JAXBElement<CheckStateResponse> createCheckStateResponse(CheckStateResponse value) {
        return new JAXBElement<CheckStateResponse>(_CheckStateResponse_QNAME, CheckStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tunduk-sf.x-road.fi/producer", name = "CancelPolicy")
    public JAXBElement<CancelPolicyRequest> createCancelPolicy(CancelPolicyRequest value) {
        return new JAXBElement<CancelPolicyRequest>(_CancelPolicy_QNAME, CancelPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tunduk-sf.x-road.fi/producer", name = "MakePolicy")
    public JAXBElement<MakePolicyRequest> createMakePolicy(MakePolicyRequest value) {
        return new JAXBElement<MakePolicyRequest>(_MakePolicy_QNAME, MakePolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tunduk-sf.x-road.fi/producer", name = "CheckState")
    public JAXBElement<CheckStateRequest> createCheckState(CheckStateRequest value) {
        return new JAXBElement<CheckStateRequest>(_CheckState_QNAME, CheckStateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tunduk-sf.x-road.fi/producer", name = "CancelPolicyResponse")
    public JAXBElement<CancelPolicyResponse> createCancelPolicyResponse(CancelPolicyResponse value) {
        return new JAXBElement<CancelPolicyResponse>(_CancelPolicyResponse_QNAME, CancelPolicyResponse.class, null, value);
    }

}
