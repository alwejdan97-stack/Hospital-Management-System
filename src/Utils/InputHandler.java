package Utils;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class InputHandler {
    public static Scanner scanner=new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String getStringInput(String prompt){
        String input=" ";
        while(HelperUtils.isNotNull(input)){
            System.out.println(prompt);
            input=scanner.nextLine();
        }
        return input;
    }
    public static int getIntInput(String prompt){
        String input=" ";
        while(input.isEmpty()){
            System.out.println(prompt);
            input=scanner.nextLine();
        }
        return input;
    }
    public static int getIntInput(String prompt, int min, int max){}
    public static double getDoubleInput(String prompt){}
    public static Date getDateInput(String prompt){}
    public static Boolean getConfirmation(String prompt){}
}
