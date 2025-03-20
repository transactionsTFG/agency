package ucm.tfg.agency.common.utils;

public class StringUtils {
    private StringUtils() {}
    public static boolean hasText(Object str) {
        if(str == null) 
            return false;
        if(str instanceof String string)
            return org.springframework.util.StringUtils.hasText(string);
        return false;
    }
}
