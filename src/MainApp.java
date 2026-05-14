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
        ReportAndStatisticsService reportAndStatisticsService=new ReportAndStatisticsService();
        MenuMessage menuMessage=new MenuMessage();

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            menu.displayMenu();
            Integer option = input.nextInt();
            switch (option) {
                case 1 -> {
                    Boolean PatientMenuContinue = true;
                    while (PatientMenuContinue) {
                        System.out.println(" *********** Patient Management ***********");
                        System.out.println(menuMessage.PATIENT_MENU_MESSAGE);
                        Integer patientOption = input.nextInt();
                        PatientMenuContinue = patientService.handelPatientService(patientOption);
                    }
                }
                case 2 -> {Boolean doctorMenuContinue = true;
                    while (doctorMenuContinue) {
                        System.out.println("*********** Doctor Management ***********");
                        System.out.println(menuMessage.DOCTOR_MENU_MESSAGE);
                        Integer doctorOption=input.nextInt();
                        doctorMenuContinue=doctorService.handelDoctorService(doctorOption);
                    }
                }
                case 3 ->{Boolean nurseMenuContinue = true;
                    while (nurseMenuContinue) {
                        System.out.println("*********** Nurse Management ***********");
                        System.out.println(MenuMessage.NURSE_MENU_MESSAGE);
                        Integer nurseOption=input.nextInt();
                        nurseMenuContinue=nurseService.handelNurseService(nurseOption);
                    }
                }
                case 6 -> {
                    Boolean departmentMenuContinue = true;
                    while (departmentMenuContinue) {
                        System.out.println("*********** Department Management ***********");
                        System.out.println(MenuMessage.DEPARTMENT_MENU_MESSAGE);
                        Integer departmentOption = input.nextInt();
                        departmentMenuContinue = departmentService.handelDepartmentService(departmentOption);
                    }
                }

                case 5 -> {Boolean medicalRecordMenuContinue = true;
                    while (medicalRecordMenuContinue) {
                        System.out.println("*********** Medical Records Management ***********");
                        System.out.println(MenuMessage.MEDICAL_SERVICE_MENU_MESSAGE);
                        Integer medicalRecordOption=input.nextInt();
                        medicalRecordMenuContinue=medicalRecordService.handelMedicalRecordService(medicalRecordOption);
                    }
                }


                case 4 -> {Boolean appointmentMenuContinue = true;
                    while (appointmentMenuContinue) {
                        System.out.println("*********** Appointment Management ***********");
                        System.out.println(MenuMessage.APPOINTMENT_MENU_MESSAGE);
                        Integer appointmentOption=input.nextInt();
                        appointmentMenuContinue=appointmentService.handelAppointmentService(appointmentOption);
                    }
                }

                case 7 ->{
                    System.out.println("*********** Reports and Statistics ***********");
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
