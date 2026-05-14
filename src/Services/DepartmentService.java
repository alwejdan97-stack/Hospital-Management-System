package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.*;
import Utils.InputHandler;


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
    public ReportAndStatisticsService reportAndStatisticsService=new ReportAndStatisticsService();

    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Department addDepartment(){
        System.out.println(" ** Adding new Department ** ");

        String departmentName=InputHandler.getStringInput("Enter Department Name:");
        department.setDepartmentName(departmentName);
        String departmentId=InputHandler.getStringInput("Enter Department ID: ");
        department.setDepartmentId(departmentId);
        String headDoctorId=InputHandler.getStringInput("Enter Head Doctor ID:");
        department.setHeadDoctorId(headDoctorId);
        int availableBed=InputHandler.getIntInput("Enter available Bed");
        department.setAvailableBeds(availableBed);
        int bedCapacity=InputHandler.getIntInput("Enter Bed Capacity");
        department.setBedCapacity(bedCapacity);

        System.out.println("Department Add Successfully");
        return department;
    }

    public List<Department> addDepartments(){
        Boolean continueFlag = true;
        while (continueFlag) {
            departmentList.add(addDepartment());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return departmentList;
    }

    public void updateDepartments(){
        displayAllDepartments();
        String id=InputHandler.getStringInput("Enter Department ID");
        Boolean found=false;
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(id)){
                String newName=InputHandler.getStringInput("Enter New Department ID");
                d.setDepartmentId(newName);
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
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }

    public void deleteDepartment(){
        displayAllDepartments();
        String id=InputHandler.getStringInput("Enter Department ID");
        Boolean found=false;
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(id)){
                departmentList.remove(id);
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
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }

    public void getDepartmentById(){
        displayAllDepartments();
        String id=InputHandler.getStringInput("Enter Department ID");
        Boolean found = false;
        for(Department d:departmentList) {
            if (d.getDepartmentId().equalsIgnoreCase(id)) {
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
        String id=InputHandler.getStringInput("Enter Doctor ID");
        Boolean found = false;
        for(Doctor d: doctorList) {
            if (d.getDepartmentId().equalsIgnoreCase(id)) {
                String departmentId=InputHandler.getStringInput("Enter Department ID");
                d.setDepartmentId(departmentId);
                System.out.println("Doctor Successfully Assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Doctor NOT Found");
        }
    }

    public void assignNurseToDepartment(){
        System.out.println(nurseList);
        String id=InputHandler.getStringInput("Enter Nurse ID: ");;
        Boolean found = false;
        for(Nurse n: nurseList) {
            if (n.getDepartmentId().equalsIgnoreCase(id)) {
                String departmentId= InputHandler.getStringInput("Enter Department ID");
                n.setDepartmentId(departmentId);
                System.out.println("Nurse Successfully Assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Nurse NOT Found");
        }
    }

    public Boolean handelDepartmentService(Integer departmentOption){
        switch (departmentOption){
            case 1 -> {
                System.out.println("== Add Department ==");
                addDepartments();
            }

            case 2 -> {
                System.out.println("== View All Departments ==");
                displayAllDepartments();
            }

            case 3 ->{
                System.out.println("== View Department Details ==");
                getDepartmentById();
            }

            case 4 -> {
                System.out.println("== Assign Doctor to Department ==");
                assignDoctorToDepartment();
            }

            case 5 ->{
                System.out.println("== Assign Nurse to Department ==");
                assignNurseToDepartment();
            }

            case 6 -> {
                System.out.println("== Update Department Information ==");
                updateDepartments();
            }

            case 7 -> {
                System.out.println("== View Department Statistics ==");
                reportAndStatisticsService.departmentOccupancyReport();
            }

            case 8 ->
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
        if(entity instanceof Department){
            departmentList.add((Department) entity);
        }
    }

    @Override
    public void remove(String id) {
        boolean found=false;
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(id)){
                departmentList.remove(id);
                System.out.println("Department Removed Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Department NOT Found");
        }
    }

    @Override
    public void getAll() {
        for (Department d: departmentList){
            System.out.println(d+" ");
        }
    }

    @Override
    public void search(String keyword) {
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(keyword)||d.getDepartmentName().equalsIgnoreCase(keyword)||d.getHeadDoctorId().equalsIgnoreCase(keyword)){
                System.out.println("Department Exist");
            }
        }
        System.out.println("Department NOT Exist");
    }

    @Override
    public void searchById(String id) {
        for(Department d:departmentList){
            if(d.getDepartmentId().equalsIgnoreCase(id)){
                System.out.println("Department NOT Exist");
            }
        }
        System.out.println("Department NOT Exist");
    }
}