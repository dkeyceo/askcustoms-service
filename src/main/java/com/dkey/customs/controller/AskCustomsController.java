package com.dkey.customs.controller;

import com.dkey.customs.service.SoapClient;
import com.dkey.customs.soapmeta.GetCurRates;
import com.dkey.customs.soapmeta.GetCurRatesResponse;
import com.dkey.customs.soapmeta.GetRateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/")
public class AskCustomsController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping(value = "/currates", produces = { MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE})
    public ResponseEntity getCurRates(@RequestParam String stringDate) throws Exception {
        GetCurRates type = new GetCurRates();
        GetRateRequest req = new GetRateRequest();
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date date = format.parse(stringDate);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        req.setDate(xmlGregCal);
        type.setReq(req);
        GetCurRatesResponse response = new GetCurRatesResponse();
        try {
            response = soapClient.getCurRates(type);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return new ResponseEntity(response.getGetCurRatesResult(), HttpStatus.OK);
    }
}
