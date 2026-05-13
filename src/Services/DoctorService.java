package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.*;
import Utils.InputHandler;

//import static DoctorService.doctorList;
//import static DoctorService.doctorList;
import java.util.*;

public class DoctorService implements Manageable, Searchable {
    public static List<Doctor> doctorList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    public Doctor doctor =new Doctor();
    public List<Doctor> avilableSlots=new ArrayList<>();
    public List<Patient> patientList=new ArrayList<>();
    public Surgeon surgeon=new Surgeon();
    public Consultant consultant=new Consultant();
    public GeneralPractitioner generalPractitioner=new GeneralPractitioner();
    public List<Surgeon> surgeonList=new ArrayList<>();
    public List<Consultant> consultantList=new ArrayList<>();
    public List<GeneralPractitioner> generalPractitionerList=new ArrayList<>();

    public Doctor addDoctor(){
        System.out.println(" ** Adding new Doctor ** ");

        String first= InputHandler.getStringInput("Enter First Name: ");
        doctor.setFirstName(first);
        String last= InputHandler.getStringInput("Enter Last Name");
        doctor.setLastName(last);
        String id= InputHandler.getStringInput("Enter ID: ");
        doctor.setDoctorId(id);
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        doctor.setDateOfBirth(dateOfBirth);
        String gender= InputHandler.getStringInput("Enter Gender: ");
        doctor.setGender(gender);
        String address= InputHandler.getStringInput("Enter Address: ");
        doctor.setAddress(address);
        String email= InputHandler.getStringInput("Enter Email: ");
        doctor.setEmail(email);
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        doctor.setPhoneNumber(phoneNumber);
        int experienceYear= InputHandler.getIntInput("Enter Experience Year:");
        doctor.setExperienceYears(experienceYear);
        String qualification= InputHandler.getStringInput("Enter Qualification: ");
        doctor.setQualification(qualification);
        String specialization= InputHandler.getStringInput("Enter Specialization: ");
        doctor.setSpecialization(specialization);

        System.out.println("Doctor Add Successfully");
        return doctor;
    }

    public Doctor addDoctor(String name, String specialization, String phone){
        String first= InputHandler.getStringInput("Enter First Name: ");
        String last= InputHandler.getStringInput("Enter Last Name");
        name=first+last;
        doctor.setFirstName(name);
        specialization=InputHandler.getStringInput("Enter Specialization: ");
        doctor.setSpecialization(specialization);
        phone=InputHandler.getStringInput("Enter Phone Number:");
        doctor.setPhoneNumber(phone);

        System.out.println("Doctor Added Successfully");
        return doctor;
    }

    public Doctor addDoctor(String name, String specialization, String phone, double consultationFee){
        String first= InputHandler.getStringInput("Enter First Name: ");
        String last= InputHandler.getStringInput("Enter Last Name");
        name=first+last;
        doctor.setFirstName(name);
        specialization=InputHandler.getStringInput("Enter Specialization: ");
        doctor.setSpecialization(specialization);
        phone=InputHandler.getStringInput("Enter Phone Number:");
        doctor.setPhoneNumber(phone);
        consultationFee=InputHandler.getDoubleInput("Enter Consultation Fee: ");
        doctor.setConsultationFee(consultationFee);

        System.out.println("Doctor Added Successfully");
        return doctor;
    }

    public Doctor addDoctor(Doctor doctor){
        doctorList.add(doctor);

        System.out.println("Doctor Added successfully");
        return doctor;
    }

    public List<Doctor> addDoctors(){
        Boolean continueFlag = true;
        while (continueFlag) {
            doctorList.add(addDoctor());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return doctorList;
    }

    public Surgeon addSurgeon(){
        String first= InputHandler.getStringInput("Enter First Name: ");
        surgeon.setFirstName(first);
        String last= InputHandler.getStringInput("Enter Last Name");
        surgeon.setLastName(last);
        String id= InputHandler.getStringInput("Enter ID: ");
        surgeon.setDoctorId(id);
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        surgeon.setDateOfBirth(dateOfBirth);
        String gender= InputHandler.getStringInput("Enter Gender: ");
        surgeon.setGender(gender);
        String address= InputHandler.getStringInput("Enter Address: ");
        surgeon.setAddress(address);
        String email= InputHandler.getStringInput("Enter Email: ");
        surgeon.setEmail(email);
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        surgeon.setPhoneNumber(phoneNumber);
        int experienceYear= InputHandler.getIntInput("Enter Experience Year:");
        surgeon.setExperienceYears(experienceYear);
        String qualification= InputHandler.getStringInput("Enter Qualification: ");
        surgeon.setQualification(qualification);
        String specialization= InputHandler.getStringInput("Enter Specialization: ");
        surgeon.setSpecialization(specialization);
        int surgeonPreferred=InputHandler.getIntInput("Enter Surgeon ");
        surgeon.setSurgeriesPerformed(surgeonPreferred);
        Boolean operationThreatAccess=InputHandler.getConfirmation("Enter Operation");
        surgeon.setOperationTheatreAccess(operationThreatAccess);

        System.out.println("Surgeon Add Successfully");
        return surgeon;
    }

    public List<Surgeon> addSurgeons(){
        Boolean continueFlag = true;
        while (continueFlag) {
            surgeonList.add(addSurgeon());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return surgeonList;
    }

    public Consultant addConsultant(){
        String first= InputHandler.getStringInput("Enter First Name: ");
        consultant.setFirstName(first);
        String last= InputHandler.getStringInput("Enter Last Name");
        consultant.setLastName(last);
        String id= InputHandler.getStringInput("Enter ID: ");
        consultant.setDoctorId(id);
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        consultant.setDateOfBirth(dateOfBirth);
        String gender= InputHandler.getStringInput("Enter Gender: ");
        consultant.setGender(gender);
        String address= InputHandler.getStringInput("Enter Address: ");
        consultant.setAddress(address);
        String email= InputHandler.getStringInput("Enter Email: ");
        consultant.setEmail(email);
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        consultant.setPhoneNumber(phoneNumber);
        int experienceYear= InputHandler.getIntInput("Enter Experience Year:");
        consultant.setExperienceYears(experienceYear);
        String qualification= InputHandler.getStringInput("Enter Qualification: ");
        consultant.setQualification(qualification);
        String specialization= InputHandler.getStringInput("Enter Specialization: ");
        consultant.setSpecialization(specialization);
        int consultationDuration=InputHandler.getIntInput("Enter Consultation Duration ");
        consultant.setConsultationDuration(consultationDuration);
        int consultantFee=InputHandler.getIntInput("Enter Consultant Fee");
        consultant.setConsultationFee(consultantFee);
        Boolean onlineConsultationAvailable=InputHandler.getConfirmation("Enter Online Consultation Available");
        consultant.setOnlineConsultationAvailable(onlineConsultationAvailable);

        System.out.println("Consultant Add Successfully");
        return consultant;
    }

    public List<Consultant> addConsultants(){
        Boolean continueFlag = true;
        while (continueFlag) {
            surgeonList.add(addSurgeon());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return surgeonList;
    }

    public void assignPatient(String doctorId, String patientId){
        System.out.println(doctorList+" ");
        doctorId=InputHandler.getStringInput("Enter Doctor ID");
        Boolean found=false;
        for(Doctor d: doctorList) {
            if (d.getDoctorId().equalsIgnoreCase(doctorId)) {
                patientId=InputHandler.getStringInput("Enter Patient ID");
                doctor.assignPatient(patientId);
                System.out.println("Patient Successfully Assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Doctor ID NOT Found");
        }
    }

    public void assignPatient(Doctor doctor, Patient patient){
        doctorList.add(doctor);
        patientList.add(patient);

        System.out.println("Patient Successfully Assign");
    }

    public void  assignPatient(String doctorId, List<String> patientIds) {
        System.out.println(doctorList+" ");
        doctorId=InputHandler.getStringInput("Enter doctor ID");
        Boolean found=false;
        for(Doctor d: doctorList) {
            if (d.getDoctorId().equalsIgnoreCase(doctorId)) {
                String patientId=InputHandler.getStringInput("Enter Patient ID");
                patientIds.add(patientId);
                d.setAssignedPatients(patientIds);
                System.out.println("Patient Successfully Assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Doctor ID NOT Found");
        }
    }

    public void editDoctor(){
        displayAllDoctors();
        String id=InputHandler.getStringInput("Enter Doctor ID");
        Boolean found=false;
        for(Doctor d: doctorList){
            if(d.getDoctorId().equalsIgnoreCase(id)){
                String newName=InputHandler.getStringInput("Enter New Name");
                d.setFirstName(newName);
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
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }

    public void removeDoctor(){
        displayAllDoctors();
        String id=InputHandler.getStringInput("Enter Doctor ID");
        Boolean found=false;
        for(Doctor d: doctorList){
            if(d.getDoctorId().equalsIgnoreCase(id)){
                doctorList.remove(id);
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
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }

    public void getDoctorById(){
        displayAllDoctors();
        String id=InputHandler.getStringInput("Enter Doctor ID");
        Boolean found = false;
        for(Doctor d: doctorList){
            if(d.getDoctorId().equalsIgnoreCase(id)){
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

    public void displayDoctors(){
        if(doctorList.isEmpty()){
            System.out.println("NO doctors in the list");
        }
        for (Doctor d:doctorList){
            System.out.println(d+" ");
        }
    }
    public void displayDoctors(String specialization){
        if(doctorList.isEmpty()){
            System.out.println("NO Doctor In The List");
        }
        specialization=InputHandler.getStringInput("Enter doctor specialization");
        for (Doctor d:doctorList){
            if(d.getSpecialization().equalsIgnoreCase(specialization)){
                System.out.println(d+" ");
            }
        }
    }
    public void displayDoctors(String departmentId, boolean showAvailableOnly){
        if(doctorList.isEmpty()){
            System.out.println("NO Doctor InThe List");
        }
        departmentId=InputHandler.getStringInput("Enter Department ID");
        for (Doctor d:doctorList){
            if(d.getDepartmentId().equalsIgnoreCase(departmentId)&&d.getAvailableSlots().equals(showAvailableOnly)){
                System.out.println(d+" ");
            }
        }
    }

    public void getDoctorsBySpecialization(){
        displayAllDoctors();
        String specialization=InputHandler.getStringInput("Enter doctor specialization");
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
public void searchDoctorByName(){
    displayAllDoctors();
    String name=InputHandler.getStringInput("Enter Doctor Name");
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

    @Override
    public void add(Object entity) {
        if(entity instanceof Doctor){
            doctorList.add((Doctor) entity);
        }
    }

    @Override
    public void remove(String id) {
        boolean found=false;
        for(Doctor d:doctorList){
            if(d.getDoctorId().equalsIgnoreCase(id)){
                doctorList.remove(id);
                System.out.println("Doctor Removed Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Doctor NOT Found");
        }
    }

    @Override
    public void getAll() {
        for (Doctor d: doctorList){
            System.out.println(d+" ");
        }
    }

    @Override
    public void search(String keyword) {
        for(Doctor d:doctorList){
            if(d.getDoctorId().equalsIgnoreCase(keyword)||d.getFirstName().equalsIgnoreCase(keyword)||d.getLastName().equalsIgnoreCase(keyword)||d.getDepartmentId().equals(keyword)||d.getPhoneNumber().equalsIgnoreCase(keyword)){
                System.out.println("Doctor Exist");
            }
        }
        System.out.println("Doctor NOT Exist");
    }

    @Override
    public void searchById(String id) {
        for(Doctor d:doctorList){
            if(d.getDoctorId().equalsIgnoreCase(id)){
                System.out.println("Doctor NOT Exist");
            }
        }
        System.out.println("Doctor NOT Exist");
    }
}
