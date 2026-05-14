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

    public void dataAndTesting(){
        List<Patient> patientList=new ArrayList<>();
        List<Doctor> doctorList=new ArrayList<>();
        List<Nurse> nurseList=new ArrayList<>();
        List<Department> departmentList=new ArrayList<>();
        List<MedicalRecord> medicalRecordList=new ArrayList<>();
        List<Appointment> appointmentList=new ArrayList<>();

        //patient testing
        patientList.add(new Patient("P-01","Wejdan Salim","Female","Room-01"));
        patientList.add(new InPatient("P-02","Hoor Omar","Female","Room-02"));
        patientList.add(new OutPatient("P-03","Noor Ali","Female","Room-03"));
        patientList.add(new EmergencyPatient("P-04","Ali Nasser","Male","Room-04"));

        //doctor
        doctorList.add(new Doctor("D-01","Wejdan Salim","Consultant","Cardiology"));
        doctorList.add(new Doctor("D-02","Hoor Omar","Surgeon","Neurology"));
        doctorList.add(new Consultant("D-03","Ali Ahmed","Consultant","General"));
        doctorList.add(new Consultant("D-04","Sara Said","Consultant","Emergency"));
        doctorList.add(new GeneralPractitioner("D-05","Fatema Ali","General Practitioner","Cardiology"));
        doctorList.add(new GeneralPractitioner("D-06","Fatema Saif","General Practitioner","General"));
        doctorList.add(new Surgeon("D-07","Tom Tomas","Surgeon","Emergency"));
        doctorList.add(new Surgeon("D-08","Nasser Ali","Surgeon","Neurlogy"));

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
        /*nurseList.add(new Nurse("N-01","Wejdan Salim"));
        nurseList.add(new Nurse("N-02","Hoor Said"));
        nurseList.add(new Nurse("N-03","Omar Salim"));
        nurseList.add(new Nurse("N-04","Sara Ali"));
        nurseList.add(new Nurse("N-05","Sara Said"));*/

        for(int i=1;i<=12;i++){
            Nurse nurse=new Nurse();
            nurse.setNurseId("N00 "+i);
            nurse.setFirstName("Name "+i);
            nurseList.add(nurse);
        }

        //department
        departmentList.add(new Department("DEPT-1","Neurology"));
        departmentList.add(new Department("DEPT-2","Cardiology"));
        departmentList.add(new Department("DEPT-3","Emergency"));

        for(int i=1;i<=12;i++){
            Department department=new Department();
            department.setDepartmentId("DEPT00 "+i);
            department.setDepartmentName("Department ");
            departmentList.add(department);
        }

        //medical record
        medicalRecordList.add(new MedicalRecord("MR-1","P001","Diabetes"));
        medicalRecordList.add(new MedicalRecord("MR-2","P002","Diabetes"));
        medicalRecordList.add(new MedicalRecord("MR-3","P003","Diabetes"));

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
