package ucm.tfg.agency.common.utils;

import java.time.LocalDateTime;

import org.w3c.dom.Element;

public class DateParser {
    private DateParser(){}
    public static LocalDateTime elementToLocalDateTime(Object date){
       if(date instanceof Element d){
            String dateText = d.getTextContent();
            return LocalDateTime.parse(dateText);
        } else {
            return null;
        }
    }

    public static String elementToString(Object date){
        if(date instanceof Element d){
            return d.getTextContent();
        } else {
            return null;
        }
    }

}
