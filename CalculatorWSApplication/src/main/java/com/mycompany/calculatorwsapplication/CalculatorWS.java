/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorwsapplication;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author jijonasrun
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {

    /**
     * Web service operation
     * @param i
     * @param j
     * @return 
     */
    @WebMethod(operationName = "operation")
    public int operation(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        int k = i+j;
        return k;
    }

    /**
     * This is a sample web service operation
     */
    /**
     * Web service operation
     */
    
}
