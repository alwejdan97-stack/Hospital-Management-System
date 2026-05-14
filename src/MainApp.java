//package ObjectOrientedProgramming.OOPDemo;
import Menu.Menu;
import Services.*;
import Utils.InputHandler;
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
        ReportAndStatisticsService reportAndStatisticsService=new ReportAndStatisticsService();
        MenuMessage menuMessage=new MenuMessage();

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            menu.displayMenu();
            Integer option = InputHandler.getIntInput("Enter Option Number");
            switch (option) {
                case 1 -> {
                    Boolean PatientMenuContinue = true;
                    while (PatientMenuContinue) {
                        System.out.println(" *********** Patient Management ***********");
                        System.out.println(menuMessage.PATIENT_MENU_MESSAGE);
                        Integer patientOption = InputHandler.getIntInput("Enter Option Number");
                        PatientMenuContinue = patientService.handelPatientService(patientOption);
                    }
                }
                case 2 -> {Boolean doctorMenuContinue = true;
                    while (doctorMenuContinue) {
                        System.out.println("*********** Doctor Management ***********");
                        System.out.println(menuMessage.DOCTOR_MENU_MESSAGE);
                        Integer doctorOption=InputHandler.getIntInput("Enter Option Number");
                        doctorMenuContinue=doctorService.handelDoctorService(doctorOption);
                    }
                }
                case 3 ->{Boolean nurseMenuContinue = true;
                    while (nurseMenuContinue) {
                        System.out.println("*********** Nurse Management ***********");
                        System.out.println(MenuMessage.NURSE_MENU_MESSAGE);
                        Integer nurseOption=InputHandler.getIntInput("Enter Option Number");
                        nurseMenuContinue=nurseService.handelNurseService(nurseOption);
                    }
                }
                case 4 -> {Boolean appointmentMenuContinue = true;
                    while (appointmentMenuContinue) {
                        System.out.println("*********** Appointment Management ***********");
                        System.out.println(MenuMessage.APPOINTMENT_MENU_MESSAGE);
                        Integer appointmentOption=InputHandler.getIntInput("Enter Option Number");
                        appointmentMenuContinue=appointmentService.handelAppointmentService(appointmentOption);
                    }
                }
                case 5 -> {Boolean medicalRecordMenuContinue = true;
                    while (medicalRecordMenuContinue) {
                        System.out.println("*********** Medical Records Management ***********");
                        System.out.println(MenuMessage.MEDICAL_SERVICE_MENU_MESSAGE);
                        Integer medicalRecordOption=InputHandler.getIntInput("Enter Option Number");
                        medicalRecordMenuContinue=medicalRecordService.handelMedicalRecordService(medicalRecordOption);
                    }
                }
                case 6 -> {
                    Boolean departmentMenuContinue = true;
                    while (departmentMenuContinue) {
                        System.out.println("*********** Department Management ***********");
                        System.out.println(MenuMessage.DEPARTMENT_MENU_MESSAGE);
                        Integer departmentOption = InputHandler.getIntInput("Enter Option Number");
                        departmentMenuContinue = departmentService.handelDepartmentService(departmentOption);
                    }
                }
                case 7 ->{
                    Boolean reportMenuContinue = true;
                    while (reportMenuContinue) {
                        System.out.println("*********** Reports and Statistics ***********");
                        System.out.println(MenuMessage.REPORT_AND_STATISTICS_MENU_MESSAGE);
                        Integer reportOption = InputHandler.getIntInput("Enter Option Number");
                        reportMenuContinue = reportAndStatisticsService.handelReportService(reportOption);
                    }
                }

                case 8 -> {
                    System.out.println("Exit");
                    mainMenuContinue = false;
                }
                default -> System.out.println("Select a choice from the list");
            }
        }
    }
}
