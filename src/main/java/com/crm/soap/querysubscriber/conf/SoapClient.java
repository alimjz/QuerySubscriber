package com.crm.soap.querysubscriber.conf;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class SoapClient extends WebServiceGatewaySupport {
    public QuerySubscriberResponseType getBank(String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (QuerySubscriberResponseType) res.getValue();
    }
}
