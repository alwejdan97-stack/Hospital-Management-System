package Utils;

public abstract class HelperUtils {
    public static boolean isNull(Object obj){}
    public static boolean isNull(String str){}
    public static boolean isNotNull(Object obj){}
    public static boolean isNotNull(String str){}

    public static boolean isValidString(String str){}
    public static boolean isValidString(String str, int minLength){}
    public static boolean isValidString(String str, int minLength, int maxLength){}
    public static boolean isValidString(String str, String regex){}

    public static void generateId(){}
    public static void generateId(String prefix){}
    public static void generateId(String prefix, int length){}
    public static void generateId(String prefix, String suffix){}

    public static boolean isValidDate(Date date){}
    public static boolean isValidDate(String dateStr) {}
    public static boolean isValidDate(Date date, Date minDate, Date maxDate){}
    public static boolean isFutureDate(Date date){}
    public static boolean isPastDate(Date date){}
    public static boolean isToday(Date date){}

    public static boolean isValidNumber(int num, int min, int max){}
    public static boolean isValidNumber(double num, double min, double max){}
    public static boolean isPositive(int num){}
    public static boolean isPositive(double num){}
    public static boolean isNegative(int num){}
    public static boolean isNegative(double num){}
}
