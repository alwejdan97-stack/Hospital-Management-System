package Utils;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public abstract class HelperUtils {
    //Null Check Methods (Overloaded)
    public static boolean isNull(Object obj){
        if(obj==null){
            return true;
        }
        return false;
    }
    public static boolean isNull(String str){
        if(str==null&&str.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean isNotNull(Object obj){
        if(obj!=null){
            return true;
        }
        return false;
    }
    public static boolean isNotNull(String str){
        if(str!=null & !str.isEmpty()){
            return true;
        }
        return false;
    }

    //String Validation Methods (Overloaded)
    public static boolean isValidString(String str){
        if(str!=null && !str.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean isValidString(String str, int minLength){
        if(str.length()>=minLength){
            return true;
        }
        return false;
    }
    public static boolean isValidString(String str, int minLength, int maxLength){
        if(str.length()>=maxLength && str.length()<=maxLength){
            return true;
        }
        return false;
    }
    public static boolean isValidString(String str, String regex){
        if(str.matches(regex)){
            return true;
        }
        return false;
    }

    //ID Generation Methods (Overloaded)
    public static String generateId(){
        UUID uuid=UUID.randomUUID();
        String id=uuid.toString();
        return id;
    }
    public static String generateId(String prefix){
        //UUID uuid=UUID.randomUUID();
        String id=prefix+" | "+(int)Math.random()*100000;
        return id;
    }
    public static String generateId(String prefix, int length){
        StringBuilder id=new StringBuilder(prefix+" | ");
        for(int i=0; i<length;i++){
           id.append((int)Math.random()*10);
        }
        return id.toString();
    }
    public static String generateId(String prefix, String suffix){
        String id=prefix+" | "+(int)Math.random()*100000+" | "+suffix;
        return id;
    }

    //Date Validation Methods (Overloaded)
    public static boolean isValidDate(Date date){}
    public static boolean isValidDate(String dateStr) {}
    public static boolean isValidDate(Date date, Date minDate, Date maxDate){}
    public static boolean isFutureDate(Date date){}
    public static boolean isPastDate(Date date){}
    public static boolean isToday(Date date){}

    //Numeric Validation Methods (Overloaded)
    public static boolean isValidNumber(int num, int min, int max){}
    public static boolean isValidNumber(double num, double min, double max){}
    public static boolean isPositive(int num){}
    public static boolean isPositive(double num){}
    public static boolean isNegative(int num){}
    public static boolean isNegative(double num){}

    //Input Validation Methods (Overloaded)
    public static boolean isValidAge(int age){}
    public static boolean isValidAge(LocalDate dateOfBirth){}
}
