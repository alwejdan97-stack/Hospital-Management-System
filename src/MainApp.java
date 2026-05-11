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
                        System.out.println(" *********** Doctor Menu ***********");
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
                /*case 3 ->{Boolean teacherMenuContinue = true;
                    while (teacherMenuContinue) {
                        System.out.println("*********** Teacher Menu ***********");
                        System.out.println(MenuMessages.TEACHER_MENU_MESSAGE);
                        Integer teacherOption=input.nextInt();
                        teacherMenuContinue=teacherService.handleTeacherMenu(teacherOption);
                    }
                }
                case 4 -> {Boolean studentMenuContinue = true;
                    while (studentMenuContinue) {
                        System.out.println("*********** Student Menu ***********");
                        System.out.println(MenuMessages.STUDENT_MENU_MESSAGE);
                        Integer studentOption=input.nextInt();
                        studentMenuContinue=studentService.handleStudentMenu(studentOption);
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

                }*/
                case 7 -> {
                    System.out.println("Exit");
                    mainMenuContinue = false;
                }
                default -> System.out.println("Select a choice from the list");
            }
        }
    }
}
