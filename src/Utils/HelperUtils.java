package Utils;

public abstract class HelperUtils {
    public static boolean isNull(Object obj);
    boolean isNull(String str);
    boolean isNotNull(Object obj);
    boolean isNotNull(String str);

    public static boolean isValidString(String str){}
    public static boolean isValidString(String str, int minLength){}
    public static boolean isValidString(String str, int minLength, int maxLength){}
    public static boolean isValidString(String str, String regex){}

    public void generateId(){}
    public void generateId(String prefix){}
    public void generateId(String prefix, int length){}
    public void generateId(String prefix, String suffix){}
}
