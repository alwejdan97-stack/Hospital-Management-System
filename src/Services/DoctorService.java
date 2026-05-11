package Services;

import Entity.Doctor;
import Entity.Patient;

import javax.print.Doc;

//import static DoctorService.doctorList;
//import static DoctorService.doctorList;
import java.util.*;
import static Entity.Patient.scanner;

public class DoctorService {
    public static List<Doctor> doctorList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    public Doctor doctor=new Doctor();
    public List<Doctor> avilableSlots=new ArrayList<>();

    public Doctor addDoctor(){
        System.out.println(" ** Adding new Doctor ** ");

        System.out.println("Enter First Name: ");
        doctor.setFirstName(scanner.nextLine());
        System.out.println("Enter Second Name: ");
        doctor.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        doctor.setDoctorId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        doctor.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Address: ");
        doctor.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        doctor.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        doctor.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Experience Year:");
        doctor.setExperienceYears(scanner.nextInt());
        System.out.println("Enter Qualification: ");
        doctor.setQualification(scanner.nextLine());
        System.out.println("Enter Specialization: ");
        doctor.setSpecialization(scanner.nextLine());

        System.out.println("Doctor Add Successfully");
        return doctor;
    }
    public List<Doctor> addDoctors(){
        Boolean continueFlag = true;
        while (continueFlag) {
            doctorList.add(addDoctor());
            System.out.println("If want ot add more doctors press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=true;
            }
            continueFlag=false;
        }
        return doctorList;
    }
    public void editDoctor(){
        displayAllDoctors();
        System.out.println("Enter Doctor ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Doctor d:doctorList){
            if(d.getDoctorId().equalsIgnoreCase(ID)){
                System.out.println("Enter New Name");
                d.setFirstName(scanner.nextLine());
                System.out.println("Doctor Updated Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Doctor NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot update more Doctors press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }
    public void removeDoctor(){
        displayAllDoctors();
        System.out.println("Enter Doctor ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Doctor d:doctorList){
            if(d.getDoctorId().equalsIgnoreCase(ID)){
                doctorList.remove(ID);
                System.out.println("Doctor Removed Successful");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Doctor NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot delete more doctors press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }
    public void getDoctorById(){
        displayAllDoctors();
        System.out.println("Enter Doctor ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Doctor d:doctorList){
            if(d.getDoctorId().equalsIgnoreCase(ID)){
                System.out.println("Doctor Name: "+d.getFirstName()+" "+d.getLastName());
                System.out.println("Doctor ID: "+d.getDoctorId());
                System.out.println("Doctor Birthday: "+d.getDateOfBirth());
                System.out.println("Doctor Phone Number: "+d.getPhoneNumber());
                System.out.println("Doctor Address: "+d.getAddress());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Doctor NOT found");
        }
    }

public static void displayAllDoctors(){
    if(doctorList.isEmpty()){
        System.out.println("NO Doctor in the List");
    }
    for(Doctor d: doctorList) {
        System.out.println("Doctor Name: " + d.getFirstName() + " " + d.getLastName()+" | Doctor ID: "+d.getDoctorId());
    }
}

    public void getDoctorsBySpecialization(){
        displayAllDoctors();
        System.out.println("Enter Doctor Specialization");
        String specialization=scanner.nextLine();
        Boolean found = false;
        for(Doctor d: doctorList){
            if(d.getSpecialization().equalsIgnoreCase(specialization)){
                System.out.println("Doctor Name: "+d.getFirstName()+" "+d.getLastName()+" is found");
                System.out.println("Doctor ID: "+d.getDoctorId());
                System.out.println("Doctor Birthday: "+d.getDateOfBirth());
                System.out.println("Doctor Phone Number: "+d.getPhoneNumber());
                System.out.println("Doctor Address: "+d.getAddress());
                System.out.println("Doctor Specialization: "+d.getSpecialization());
                System.out.println("Doctor Qualification: "+d.getQualification());
                System.out.println("Doctor Experience Years: "+d.getExperienceYears());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Doctor NOT found");
        }
    }
public Doctor searchDoctorByName(){
    displayAllDoctors();
    System.out.println("Enter Doctor Name");
    String name=scanner.nextLine();
    Boolean found = false;
    for(Doctor p: doctorList){
        if(p.getFirstName().equalsIgnoreCase(name)){
            System.out.println("Doctor Name: "+p.getFirstName()+" "+p.getLastName()+" is found");
            found=true;
        }
    }
    if (!found) {
        System.out.println("Doctor NOT found");
    }
    return doctor;
}

public void getAvailableDoctors(){
        if(avilableSlots.isEmpty()){
            System.out.println("No Available Doctor");
        }else{
    System.out.println(avilableSlots);
        }
}
public Boolean handelDoctorService(Integer doctorOption){
    switch (doctorOption){
        case 1 -> {
            System.out.println("== Add New Doctor ==");
            addDoctors();
        }
        case 2 -> {
            System.out.println("== Update Doctor ==");
            editDoctor();
        }

        case 3 -> {
            System.out.println("== Show Doctors ==");
            displayAllDoctors();
        }

        case 4 -> {
            System.out.println("== Show SPECIFIC Doctor Using ID ==");
            getDoctorById();
        }

        case 5 -> {
            System.out.println("== Delete Doctor ==");
            removeDoctor();
        }

        case 6 -> {
            System.out.println("== Search For Doctor Using Specialization ==");
            getDoctorsBySpecialization();
        }

        case 7 -> {
            System.out.println("== Display Available Doctor ==");
            getAvailableDoctors();
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
}
