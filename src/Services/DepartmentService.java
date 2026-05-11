package Services;

import Entity.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService {
    public List<Department> departmentList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    Department department=new Department();
    public Patient patient=new Patient();
    public List<Doctor> doctorList=new ArrayList<>();
    public List<Nurse> nurseList=new ArrayList<>();
    public List<Patient> patientList=new ArrayList<>();

    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Department addDepartment(){
        System.out.println(" ** Adding new Department ** ");

        System.out.println("Enter Department Name:");
        department.setDepartmentName(scanner.nextLine());
        System.out.println("Enter Department ID: ");
        department.setDepartmentId(scanner.nextLine());
        System.out.println("Enter Head Doctor ID:");
        department.setHeadDoctorId(scanner.nextLine());
        System.out.println("Enter Doctors");
        department.setDoctors(doctorList);
        System.out.println("Enter Nurses");
        department.setNurses(nurseList);
        System.out.println("Enter available Bed");
        department.setAvailableBeds(scanner.nextInt());
        System.out.println("Enter Bed Capacity");
        department.setBedCapacity(scanner.nextInt());


        System.out.println("Department Add Successfully");
        return department;
    }

    public List<Department> addDepartments(){
        Boolean continueFlag = true;
        while (continueFlag) {
            departmentList.add(addDepartment());
            System.out.println("If want ot add more Departments press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=true;
            }
            continueFlag=false;
        }
        return departmentList;
    }

    public void updateDepartments(){
        displayAllAppointments();
        System.out.println("Enter Department ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(ID)){
                System.out.println("Enter New Department ID");
                d.setDepartmentId(scanner.nextLine());
                System.out.println("Department Updated Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Department NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot update more Departments press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }

    public void deleteDepartment(){
        displayAllAppointments();
        System.out.println("Enter Department ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(ID)){
                departmentList.remove(ID);
                System.out.println("Department Removed Successful");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Department NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot delete more Departments press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }

    public void getAppointmentById(){
        displayAllAppointments();
        System.out.println("Enter Department ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Department d:departmentList) {
            if (d.getDepartmentId().equalsIgnoreCase(ID)) {
                System.out.println("Department Name: "+d.getDepartmentName()+" | Department ID: " + d.getDepartmentId() + " | Doctors: " + d.getDoctors() + " | Nurses: " + d.getNurses() + " | Bed Capacity: " + d.getBedCapacity() + " | Available Bed: " + d.getAvailableBeds());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Department NOT found");
        }
    }

    public void displayAllDepartments(){
        if(appointmentList.isEmpty()){
            System.out.println("NO Appointments In The List");
        }
        for(Appointment a:appointmentList){
            System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime()+" | Notes: "+a.getNotes());
        }
    }

    public Boolean handelMedicalRecordService(Integer medicalRecordOption){
        switch (medicalRecordOption){
            case 1 -> {
                System.out.println("== Add New Appointment ==");
                addAppointments();
            }
            case 2 -> {
                System.out.println("== Update Appointment ==");
                updateAppointment();
            }

            case 3 -> {
                System.out.println("== Show Appointments ==");
                displayAllAppointments();
            }

            case 4 -> {
                System.out.println("== Show Appointments Using Patient ID ==");
                getAppointmentByPatientId();
            }

            case 5 -> {
                System.out.println("== Show Appointments Using Doctor ID ==");
                getAppointmentByDoctorId();
            }

            case 6 -> {
                System.out.println("== Show Appointments Using Appointment Date ==");
                getAppointmentByDate();
            }

            case 7 -> {
                System.out.println("== Delete Appointments ==");
                deleteAppointment();
            }

            case 8 -> {
                System.out.println("== Reschedule Appointment ==");
                rescheduleAppointment();
            }

            case 9 -> {
                System.out.println("== Cancel Appointment ==");
                cancelAppointment();
            }

            case 10 ->
            {
                return false;
            }

            default ->{
                System.out.println("Invalid Option");
            }
        }
        return true;
    }
}
