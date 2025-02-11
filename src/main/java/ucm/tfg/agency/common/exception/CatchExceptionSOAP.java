package ucm.tfg.agency.common.exception;

import jakarta.xml.ws.soap.SOAPFaultException;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CatchExceptionSOAP {
    private static final String MESSAGE_DEFAULT_SOAP = "No hemos podido realizar la peticion";
    private CatchExceptionSOAP(){}
    
    public static String getMessageError(final Exception e){
        log.error(e.getMessage());
        if(e instanceof SOAPFaultException soapFaultException)
            return soapFaultException.getFault().getFaultString();
        return MESSAGE_DEFAULT_SOAP;
    }
}
