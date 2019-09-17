
package com.atos.poe.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "iHello", targetNamespace = "http://webservice.poe.atos.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHello {


    /**
     * 
     * @param nom
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservice.poe.atos.com/iHello/sayRequest", output = "http://webservice.poe.atos.com/iHello/sayResponse")
    public String say(
        @WebParam(name = "nom", partName = "nom")
        String nom);

}