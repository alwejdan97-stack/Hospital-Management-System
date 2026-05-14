//package ObjectOrientedProgramming.OOPDemo;
import Entity.*;
import Menu.Menu;
import Services.*;
import Utils.InputHandler;
import Utils.MenuMessage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class MainApp {
    static Menu menu = new Menu();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MainApp mainApp=new MainApp();
        mainApp.dataAndTesting();

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

    public void dataAndTesting(){
        List<Patient> patientList=new ArrayList<>();
        List<Doctor> doctorList=new ArrayList<>();
        List<Nurse> nurseList=new ArrayList<>();
        List<Department> departmentList=new ArrayList<>();
        List<MedicalRecord> medicalRecordList=new ArrayList<>();
        List<Appointment> appointmentList=new ArrayList<>();

        //patient testing
        for(int i=1;i<=12;i++){
            Patient patient=new Patient();
            patient.setPatientId("D00 "+i);
            patient.setFirstName("Name "+i);

            if(i%2==0){
                patient.setGender("Female");
            }else{
                patient.setGender("Male");
            }

            if(i<=3){
                patient.setCaseType("Regular");
            }else if(i<=6){
                patient.setCaseType("InPatient");
            }else if(i<=8){
                patient.setCaseType("OutPatient");
            }else{
                patient.setCaseType("Emergency");
            }
            patientList.add(patient);
        }

        //doctor
        for(int i=1;i<=12;i++){
            Doctor doctor=new Doctor();
            doctor.setDoctorId("D00 "+i);
            doctor.setFirstName("Name "+i);
            if(i<=3){
                doctor.setSpecialization("Surgeon");
            }else if(i<=5){
                doctor.setSpecialization("Consultant");
            }else{
                doctor.setSpecialization("General Practitioner");
            }
            doctorList.add(doctor);
        }

        //nurse
        for(int i=1;i<=12;i++){
            Nurse nurse=new Nurse();
            nurse.setNurseId("N00 "+i);
            nurse.setFirstName("Name "+i);
            nurseList.add(nurse);
        }

        //department
        for(int i=1;i<=12;i++){
            Department department=new Department();
            department.setDepartmentId("DEPT00 "+i);
            department.setDepartmentName("Department ");
            departmentList.add(department);
        }

        //medical record
        for(int i=1;i<=12;i++){
            MedicalRecord medicalRecord=new MedicalRecord();
            medicalRecord.setRecordId("M00 "+i);
            medicalRecord.setPatientId(patientList.get(i%10).getPatientId());
            medicalRecord.setDiagnosis("Diagnosis "+i);
            medicalRecordList.add(medicalRecord);
        }


        //appointment
        for(int i=1;i<=15;i++){
            Appointment appointment=new Appointment();
            appointment.setAppointmentId("A00 "+i);
            appointment.setPatientId(patientList.get(i%10).getPatientId());
            appointment.setDoctorId(doctorList.get(i%8).getDoctorId());
            appointment.setAppointmentDate(LocalDate.now().plusDays(i));
            appointment.setStatus("Schedule");
            appointmentList.add(appointment);
        }

        System.out.println("Data Added Successfully");
    }
}
