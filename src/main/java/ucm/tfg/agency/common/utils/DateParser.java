package ucm.tfg.agency.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.w3c.dom.Element;

public class DateParser {
    private DateParser() {
    }

    private static final DateTimeFormatter ENTRADA_FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter SALIDA_FORMATO = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDateTime elementToLocalDateTime(Object date) {
        if (date instanceof Element d) {
            String dateText = d.getTextContent();
            return LocalDateTime.parse(dateText);
        } else {
            return null;
        }
    }

    public static LocalDate elementToLocalDate(Object date) {
        if (date instanceof Element d) {
            String dateText = d.getTextContent();
            return LocalDate.parse(dateText);
        } else {
            return null;
        }
    }

    public static String elementToString(Object date) {
        if (date instanceof Element d) {
            return d.getTextContent();
        } else {
            return null;
        }
    }

    public static String parserLocalDateClientToBackendFormat(String dateClientJS) {
        LocalDate date = LocalDate.parse(dateClientJS);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    public static String parserLocalDateClientToFrontEnd(String dateClientJS) {
        LocalDate fecha = LocalDate.parse(dateClientJS, ENTRADA_FORMATO);
        return fecha.format(SALIDA_FORMATO);
    }

}
