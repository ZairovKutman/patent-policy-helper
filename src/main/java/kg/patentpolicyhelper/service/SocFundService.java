package kg.patentpolicyhelper.service;

import eu.x_road.xsd.identifiers.XRoadClientIdentifierType;
import eu.x_road.xsd.identifiers.XRoadObjectType;
import eu.x_road.xsd.identifiers.XRoadServiceIdentifierType;
import fi.x_road.tunduk_sf.producer.*;
import kg.patentpolicyhelper.dto.SecPolicyDto;
import kg.patentpolicyhelper.entity.Policy;
import kg.patentpolicyhelper.repository.PolicyRepository;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.tempuri.IPolicyReportService;
import org.tempuri.PolicyReportService;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Holder;
import java.io.StringWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

@Service("SocFundService")
public class SocFundService {


    @Value("${socfund.policy.wsdl}")
    private String WSDL;
    @Value("${tunduk.member_code}")
    private String MEMBER_CODE;
    @Value("${tunduk.subsystem_code}")
    private String SUBSYSTEM_CODE;
    private PolicyRepository policyRepository;

    public SocFundService(PolicyRepository policyRepository) {
         this.policyRepository=policyRepository;
    }

    public void checkState(List<SecPolicyDto> dtos) throws Exception {
        PolicyReportService service = new PolicyReportService(new URL(WSDL));
        IPolicyReportService portType = service.getBasicHttpBindingIPolicyReportService();
        Client client1 = ClientProxy.getClient(portType);
        client1.getInInterceptors().add(new LoggingInInterceptor());
        LoggingOutInterceptor oi=new LoggingOutInterceptor();
        oi.setLimit(-1);
        client1.getOutInterceptors().add(oi);

        HTTPConduit http = (HTTPConduit) client1.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(500000);
        httpClientPolicy.setReceiveTimeout(500000);
        http.setClient(httpClientPolicy);

        ArrayOfCheckRequestInfo policiesInfo=new ArrayOfCheckRequestInfo();
        List<CheckRequestInfo> list =new ArrayList<>();
        for (SecPolicyDto dto:dtos) {
            CheckRequestInfo req = new CheckRequestInfo();
            GregorianCalendar gcal = GregorianCalendar.from(dto.getDatePolicy().atStartOfDay(ZoneId.systemDefault()));
            XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
            req.setPolicyDate(xcal);
            req.setNumPolicy(dto.getPolicyNum().toString());
            req.setTaxDivision(dto.getUgns());
            list.add(req);
        }
        policiesInfo.setCheckRequestInfo(list);

        Holder<ArrayOfCheckResponseInfo> respHolder = new Holder<>();

        Holder<String> error = new Holder<>();
        Holder<String> userId = new Holder<String>("ASV");
        Holder<String> issue = new Holder<String>("IS");
        Holder<String> issuer = new Holder<>();
        Holder<String> protocolVersion = new Holder<String>("4.0");
        Holder<String> id = new Holder<String>(UUID.randomUUID().toString());
        Holder<XRoadClientIdentifierType> client = new Holder<>();
        Holder<XRoadServiceIdentifierType> service1 = new Holder<>();

        service1.value = new XRoadServiceIdentifierType();
        service1.value.setXRoadInstance("central-server");
        service1.value.setMemberClass("GOV");
        service1.value.setMemberCode("70000003");
        service1.value.setSubsystemCode("settlements-service");
        service1.value.setServiceCode("CheckState");
        service1.value.setObjectType(XRoadObjectType.SERVICE);

        client.value = new XRoadClientIdentifierType();
        client.value.setXRoadInstance("central-server");
        client.value.setMemberClass("GOV");
        client.value.setMemberCode(MEMBER_CODE);
        client.value.setSubsystemCode(SUBSYSTEM_CODE);
        client.value.setObjectType(XRoadObjectType.SUBSYSTEM);
        portType.checkState(policiesInfo,"GNS","AUTO",respHolder,error,issue,client,id,issue,protocolVersion,service1,userId);

        ArrayOfCheckResponseInfo response=respHolder.value;
        List<CheckResponseInfo> respList=response.getCheckResponseInfo();

        for(CheckResponseInfo resp:respList){
            System.out.println("answer---"+resp.getNumPolicy()+"--"+resp.getState()+"--"+resp.getErrorText());
            String series=resp.getNumPolicy().substring(0,2);
            String num=resp.getNumPolicy().substring(2);
            Policy sp=policyRepository.findPolicyByNumber(resp.getNumPolicy());
            sp.setDocStatus(resp.getState().ordinal());
            sp.setSfError(resp.getErrorText());
            policyRepository.save(sp);
        }
    }


    public void makePolicy(List<SecPolicyDto> dtos) throws Exception {
        PolicyReportService service = new PolicyReportService(new URL(WSDL));
        IPolicyReportService portType = service.getBasicHttpBindingIPolicyReportService();
        Client client1 = ClientProxy.getClient(portType);
        client1.getInInterceptors().add(new LoggingInInterceptor());
        LoggingOutInterceptor oi=new LoggingOutInterceptor();
        oi.setLimit(-1);
        client1.getOutInterceptors().add(oi);

        HTTPConduit http = (HTTPConduit) client1.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(500000);
        httpClientPolicy.setReceiveTimeout(500000);
        http.setClient(httpClientPolicy);


        Holder<UploadState> respHolder = new Holder<>();

        Holder<ArrayOfPolicyInfo> resp2Holder = new Holder<>();
        Holder<String> error = new Holder<>();
        Holder<String> userId = new Holder<String>("ASV");
        Holder<String> issue = new Holder<String>("IS");
        Holder<String> issuer = new Holder<>();
        Holder<String> protocolVersion = new Holder<String>("4.0");
        Holder<String> id = new Holder<String>(UUID.randomUUID().toString());
        Holder<XRoadClientIdentifierType> client = new Holder<>();
        Holder<XRoadServiceIdentifierType> service1 = new Holder<>();

        service1.value = new XRoadServiceIdentifierType();
        service1.value.setXRoadInstance("central-server");
        service1.value.setMemberClass("GOV");
        service1.value.setMemberCode("70000003");
        service1.value.setSubsystemCode("settlements-service");
        service1.value.setServiceCode("MakePolicy");
        service1.value.setObjectType(XRoadObjectType.SERVICE);

        client.value = new XRoadClientIdentifierType();
        client.value.setXRoadInstance("central-server");
        client.value.setMemberClass("GOV");
        client.value.setMemberCode(MEMBER_CODE);
        client.value.setSubsystemCode(SUBSYSTEM_CODE);
        client.value.setObjectType(XRoadObjectType.SUBSYSTEM);

        portType.makePolicy(makeXml(dtos).getBytes(StandardCharsets.UTF_8),
                "GNS","AUTO",
                respHolder,error,issuer,resp2Holder,
                client,id,issue,protocolVersion,service1,userId);

        ArrayOfPolicyInfo response=resp2Holder.value;
        List<PolicyInfo> respList=response.getPolicyInfo();
        for(PolicyInfo resp:respList){
            System.out.println("answer---"+resp.getNumPolicy()+"--"+resp.getState()+"--"+resp.getErrorText());
            Policy sp=policyRepository.findPolicyByNumber(resp.getNumPolicy());
            sp.setDocStatus(resp.getState().ordinal());
            sp.setSfError(resp.getErrorText());
            policyRepository.save(sp);
        }

    }

    public String makeXml(List<SecPolicyDto> dtos) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Policies");
        doc.appendChild(rootElement);
        for (SecPolicyDto dto:dtos) {
            Element element = doc.createElement("Policy");
            Element field = doc.createElement("TaxDivision");
            field.appendChild(doc.createTextNode(dto.getUgns()));
            element.appendChild(field);

            field = doc.createElement("PolicyDate");
            field.appendChild(doc.createTextNode(dto.getDatePolicy().toString()));
            element.appendChild(field);

            field = doc.createElement("NumPolicy");
            field.appendChild(doc.createTextNode(dto.getPolicyNum()));
            element.appendChild(field);

            field = doc.createElement("PIN");
            field.appendChild(doc.createTextNode(dto.getPin()));
            element.appendChild(field);

            field = doc.createElement("Name");
            field.appendChild(doc.createTextNode(dto.getFio()));
            element.appendChild(field);

            field = doc.createElement("TariffType");
            field.appendChild(doc.createTextNode(dto.getTarriffCode()));
            element.appendChild(field);

            field = doc.createElement("Voluntary");
            field.appendChild(doc.createTextNode(dto.getSeven().toString()));
            element.appendChild(field);

            field = doc.createElement("Category");
            field.appendChild(doc.createTextNode(dto.getEight()));
            element.appendChild(field);


            field = doc.createElement("HighlandRate");
            if(dto.getHighlandCode()!=null) field.appendChild(doc.createTextNode(dto.getHighlandCode()));
            element.appendChild(field);


            field = doc.createElement("DateBegin");
            field.appendChild(doc.createTextNode(dto.getDateBegin().toString()));
            element.appendChild(field);

            field = doc.createElement("DateEnd");
            field.appendChild(doc.createTextNode(dto.getDateEnd().toString()));
            element.appendChild(field);

            field = doc.createElement("Salary");
            field.appendChild(doc.createTextNode(dto.getFot().toString()));
            element.appendChild(field);

            field = doc.createElement("Sum");
            field.appendChild(doc.createTextNode(dto.getSum().toString()));
            element.appendChild(field);

            field = doc.createElement("ActivityID");
            if(dto.getActivityType()!=null) field.appendChild(doc.createTextNode(dto.getActivityType()));
            element.appendChild(field);

            field = doc.createElement("Agent");
            if(dto.getTaxOfficesPin()!=null) field.appendChild(doc.createTextNode(dto.getTaxOfficesPin()));
            element.appendChild(field);

            field = doc.createElement("AvgMonWage");
            field.appendChild(doc.createTextNode(dto.getAverageSalary().toString()));
            element.appendChild(field);

            field = doc.createElement("Comment");
            if(dto.getComment()!=null) field.appendChild(doc.createTextNode(dto.getComment()));
            element.appendChild(field);

            rootElement.appendChild(element);
        }
        StringWriter sw = new StringWriter();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

        transformer.transform(new DOMSource(doc), new StreamResult(sw));
        System.out.println(sw.toString());
        return  sw.toString();
    }

}
