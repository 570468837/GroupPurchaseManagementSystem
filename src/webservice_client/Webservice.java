
package webservice_client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Webservice", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Webservice {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "sendMessage", targetNamespace = "http://webservice/", className = "webservice_client.SendMessage")
    @ResponseWrapper(localName = "sendMessageResponse", targetNamespace = "http://webservice/", className = "webservice_client.SendMessageResponse")
    @Action(input = "http://webservice/Webservice/sendMessageRequest", output = "http://webservice/Webservice/sendMessageResponse")
    public void sendMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
