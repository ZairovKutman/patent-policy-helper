
package org.tempuri;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PolicyReportService", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/home/aomorov/wsdl/central-server_GOV_70000003_settlements-service_MakePolicy_.wsdl")
public class PolicyReportService
    extends Service
{

    private final static URL POLICYREPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException POLICYREPORTSERVICE_EXCEPTION;
    private final static QName POLICYREPORTSERVICE_QNAME = new QName("http://tempuri.org/", "PolicyReportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/aomorov/wsdl/central-server_GOV_70000003_settlements-service_MakePolicy_.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        POLICYREPORTSERVICE_WSDL_LOCATION = url;
        POLICYREPORTSERVICE_EXCEPTION = e;
    }

    public PolicyReportService() {
        super(__getWsdlLocation(), POLICYREPORTSERVICE_QNAME);
    }

    public PolicyReportService(WebServiceFeature... features) {
        super(__getWsdlLocation(), POLICYREPORTSERVICE_QNAME, features);
    }

    public PolicyReportService(URL wsdlLocation) {
        super(wsdlLocation, POLICYREPORTSERVICE_QNAME);
    }

    public PolicyReportService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, POLICYREPORTSERVICE_QNAME, features);
    }

    public PolicyReportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PolicyReportService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IPolicyReportService
     */
    @WebEndpoint(name = "BasicHttpBinding_IPolicyReportService")
    public IPolicyReportService getBasicHttpBindingIPolicyReportService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPolicyReportService"), IPolicyReportService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPolicyReportService
     */
    @WebEndpoint(name = "BasicHttpBinding_IPolicyReportService")
    public IPolicyReportService getBasicHttpBindingIPolicyReportService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPolicyReportService"), IPolicyReportService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (POLICYREPORTSERVICE_EXCEPTION!= null) {
            throw POLICYREPORTSERVICE_EXCEPTION;
        }
        return POLICYREPORTSERVICE_WSDL_LOCATION;
    }

}
