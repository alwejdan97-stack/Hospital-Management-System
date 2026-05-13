package Utils;

public abstract class HelperUtils {
    public static boolean isNull(Object obj);
    boolean isNull(String str);
    boolean isNotNull(Object obj);
    boolean isNotNull(String str);

    public static boolean isValidString(String str);
    public static boolean isValidString(String str, int minLength);
    public static boolean isValidString(String str, int minLength, int maxLength);
    public static boolean isValidString(String str, String regex);

    void generateId();
    void generateId(String prefix);
    void generateId(String prefix, int length);
    void generateId(String prefix, String suffix);
}
