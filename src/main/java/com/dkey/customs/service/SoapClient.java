package com.dkey.customs.service;

import com.dkey.customs.soapmeta.GetCurRates;
import com.dkey.customs.soapmeta.GetCurRatesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.soap.SOAPException;

@Configuration
public class SoapClient {

    @Bean
    public Jaxb2Marshaller getMarshaller()  {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.dkey.customs.soapmeta");
        return marshaller;
    }

    private WebServiceTemplate template;

    public GetCurRatesResponse getCurRates(GetCurRates getCurRates) throws SOAPException {
        template = new WebServiceTemplate(getMarshaller());
        GetCurRatesResponse response = (GetCurRatesResponse) template.marshalSendAndReceive("https://sw2.customs.gov.ua/AskCustoms.asmx",
                getCurRates, new SoapActionCallback("http://tempuri.org/GetCurRates"));
        return response;
    }
}
