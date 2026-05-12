package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.*;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService implements Manageable, Searchable {
    public List<Department> departmentList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    Department department=new Department();
    public Patient patient=new Patient();
    public List<Doctor> doctorList =new ArrayList<>();
    public List<Nurse> nurseList=new ArrayList<>();
    public List<Patient> patientList=new ArrayList<>();
    public DoctorService doctorService=new DoctorService();
    public NurseService nurseService=new NurseService();

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
        //epartment.setDoctors(doctorService.addDoctors());
        System.out.println("Enter Nurses");
        //department.setNurses(nurseService.addNurses());
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
        displayAllDepartments();
        System.out.println("Enter Department ID");
        java.lang.String ID=scanner.nextLine();
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
        displayAllDepartments();
        System.out.println("Enter Department ID");
        java.lang.String ID=scanner.nextLine();
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
        displayAllDepartments();
        System.out.println("Enter Department ID");
        java.lang.String ID=scanner.nextLine();
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
        if(departmentList.isEmpty()){
            System.out.println("NO Department In The List");
        }
        for(Department d:departmentList){
            System.out.println("Department Name: "+d.getDepartmentName()+" | Department ID: " + d.getDepartmentId() + " | Doctors: " + d.getDoctors() + " | Nurses: " + d.getNurses() + " | Bed Capacity: " + d.getBedCapacity() + " | Available Bed: " + d.getAvailableBeds());
        }
    }

    public void assignDoctorToDepartment(){
        System.out.println(doctorList);
        System.out.println("Enter Doctor ID");
        java.lang.String ID=scanner.nextLine();
        Boolean found = false;
        for(Doctor d: doctorList) {
            if (d.getDepartmentId().equalsIgnoreCase(ID)) {
                System.out.println("Enter Department ID");
                d.setDepartmentId(scanner.nextLine());
                System.out.println("Doctor Successfully assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Doctor NOT found");
        }
    }

    public Boolean handelDepartmentService(Integer departmentOption){
        switch (departmentOption){
            case 1 -> {
                System.out.println("== Add New Department ==");
                addDepartments();
            }
            case 2 -> {
                System.out.println("== Update Department ==");
                updateDepartments();
            }

            case 3 -> {
                System.out.println("== Show Departments ==");
                displayAllDepartments();
            }

            case 4 -> {
                System.out.println("== Show Departments Using Department ID ==");
                getAppointmentById();
            }

            case 5 -> {
                System.out.println("== Delete Department ==");
                deleteDepartment();
            }

            case 6 -> {
                System.out.println("== Assign Doctors To Departments ==");
                assignDoctorToDepartment();
            }

            case 7 ->
            {
                return false;
            }

            default ->{
                System.out.println("Invalid Option");
            }
        }
        return true;
    }

    @Override
    public void add(Object entity) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void getAll() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public void searchById(String id) {

    }
}
