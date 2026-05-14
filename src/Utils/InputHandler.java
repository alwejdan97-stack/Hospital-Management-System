package Utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputHandler {
    public static Scanner scanner=new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String getStringInput(String prompt){
        String input="";
        while(input.isEmpty()){
            System.out.println(prompt);
            input=scanner.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Input Can't Be Empty");
            }
        }
        return input;
    }
    public static int getIntInput(String prompt){
        while(true){
            try{
                System.out.println(prompt);
                int input=Integer.parseInt(scanner.nextLine());
                return input;
            }catch(NumberFormatException e){
                System.out.println("Invalid Integer Input");
            }
        }
    }
    public static int getIntInput(String prompt, int min, int max){
        while(true){
            try{
                System.out.println(prompt);
                int input=Integer.parseInt(scanner.nextLine());
                if(HelperUtils.isValidNumber(input,min,max)){
                    return input;
                }else{
                    System.out.println("Input Must Be Between "+min+" And "+max);
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid Integer Input");
            }
        }
    }
    public static double getDoubleInput(String prompt){
        while(true){
            try{
                System.out.println(prompt);
                double input=Double.parseDouble(scanner.nextLine());
                return input;
            }catch(NumberFormatException e){
                System.out.println("Invalid Double Input");
            }
        }
    }
    public static LocalDate getDateInput(String prompt){
        while(true){
            try{
                System.out.println(prompt+formatter);
                LocalDate input=LocalDate.parse(scanner.nextLine(),formatter);
                return input;
            }catch(DateTimeParseException e){
                System.out.println("Invalid Date Input");
            }
        }
    }
    public static Boolean getConfirmation(String prompt){
        while(true){
            try{
                System.out.println(prompt+" YES / NO ");
                String input=scanner.nextLine().trim().toLowerCase();
                if(HelperUtils.isNotNull(input)&&input.equals("yes")||input.equals("y")){
                    return true;
                }else if(HelperUtils.isNotNull(input)&&input.equals("no")||input.equals("n")){}
            }catch(NumberFormatException e){
                System.out.println("Invalid Answer Input");
            }
        }
    }
}
