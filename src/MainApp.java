//package ObjectOrientedProgramming.OOPDemo;
import Menu.Menu;
import Services.*;
import Utils.MenuMessage;

import java.util.Scanner;

public class MainApp {


    static Menu menu = new Menu();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PatientService patientService=new PatientService();
        DoctorService doctorService=new DoctorService();
        NurseService nurseService=new NurseService();
        DepartmentService departmentService=new DepartmentService();
        AppointmentService appointmentService=new AppointmentService();
        MedicalRecordService medicalRecordService=new MedicalRecordService();
        MenuMessage menuMessage=new MenuMessage();

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            menu.displayMenu();
            Integer option = input.nextInt();
            switch (option) {
                case 1 -> {
                    Boolean PatientMenuContinue = true;
                    while (PatientMenuContinue) {
                        System.out.println(" *********** Patient Menu ***********");
                        System.out.println(menuMessage.PATIENT_MENU_MESSAGE);
                        Integer patientOption = input.nextInt();
                        PatientMenuContinue = patientService.handelPatientService(patientOption);
                    }
                }
                case 2 -> {Boolean doctorMenuContinue = true;
                    while (doctorMenuContinue) {
                        System.out.println("*********** Doctor Menu ***********");
                        System.out.println(menuMessage.DOCTOR_MENU_MESSAGE);
                        Integer doctorOption=input.nextInt();
                        doctorMenuContinue=doctorService.handelDoctorService(doctorOption);
                    }
                }
                case 3 ->{Boolean nurseMenuContinue = true;
                    while (nurseMenuContinue) {
                        System.out.println("*********** Nurse Menu ***********");
                        System.out.println(MenuMessage.NURSE_MENU_MESSAGE);
                        Integer nurseOption=input.nextInt();
                        nurseMenuContinue=nurseService.handelNurseService(nurseOption);
                    }
                }
                case 4 -> {Boolean medicalRecordMenuContinue = true;
                    while (medicalRecordMenuContinue) {
                        System.out.println("*********** Medical Record Menu ***********");
                        System.out.println(MenuMessage.MEDICAL_SERVICE_MENU_MESSAGE);
                        Integer medicalRecordOption=input.nextInt();
                        medicalRecordMenuContinue=medicalRecordService.handelMedicalRecordService(medicalRecordOption);
                    }
                }
                case 5 -> {Boolean courseMenuContinue = true;
                    while (courseMenuContinue) {
                        System.out.println("*********** Course Menu ***********");
                        System.out.println(MenuMessages.COURSE_MENU_MESSAGE);
                        Integer courseOption=input.nextInt();
                        courseMenuContinue=courseService.handleCourse(courseOption);
                    }
                }
                case 6 ->{

                }
                case 7 -> {
                    System.out.println("Exit");
                    mainMenuContinue = false;
                }
                default -> System.out.println("Select a choice from the list");
            }
        }
    }
}
