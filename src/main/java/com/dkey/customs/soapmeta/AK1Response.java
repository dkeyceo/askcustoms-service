//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.13 at 04:27:49 PM EEST 
//


package com.dkey.customs.soapmeta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AK1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AK1Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageBody" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ErrorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestRegNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AK1Response", propOrder = {
    "messageBody",
    "messageType",
    "signCertificate",
    "signature",
    "errorNumber",
    "errorMessage",
    "requestRegNo"
})
public class AK1Response {

    @XmlElement(name = "MessageBody")
    protected byte[] messageBody;
    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElement(name = "SignCertificate")
    protected byte[] signCertificate;
    @XmlElement(name = "Signature")
    protected byte[] signature;
    @XmlElement(name = "ErrorNumber")
    protected int errorNumber;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequestRegNo")
    protected long requestRegNo;

    /**
     * Gets the value of the messageBody property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of the messageBody property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessageBody(byte[] value) {
        this.messageBody = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the signCertificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignCertificate() {
        return signCertificate;
    }

    /**
     * Sets the value of the signCertificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignCertificate(byte[] value) {
        this.signCertificate = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the errorNumber property.
     * 
     */
    public int getErrorNumber() {
        return errorNumber;
    }

    /**
     * Sets the value of the errorNumber property.
     * 
     */
    public void setErrorNumber(int value) {
        this.errorNumber = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the requestRegNo property.
     * 
     */
    public long getRequestRegNo() {
        return requestRegNo;
    }

    /**
     * Sets the value of the requestRegNo property.
     * 
     */
    public void setRequestRegNo(long value) {
        this.requestRegNo = value;
    }

}
