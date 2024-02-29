package com.joaquin.client;

import com.joaquin.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    /**
     * Metodo que se encarga de sumar dos numeros
     * @param numberA
     * @param numberB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numberA, int numberB){

        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

        return addResponse;

    }

    /**
     * metodo de restar dos numers
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */
    public SubtractResponse getSubtractResponse(int numberA, int numberB){
        Subtract subtract = new Subtract();
        subtract.setIntA(numberA);
        subtract.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtract, soapActionCallback);

        return subtractResponse;
    }

    public MultiplyResponse getMultiplyResponse(int numberA, int numberB){
        Multiply multiply = new Multiply();
        multiply.setIntA(numberA);
        multiply.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiply, soapActionCallback);

        return multiplyResponse;
    }

    public DivideResponse getDivideResponse(int numberA, int numberB){
        Divide divide = new Divide();
        divide.setIntA(numberA);
        divide.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divide, soapActionCallback);

        return divideResponse;
    }





}
