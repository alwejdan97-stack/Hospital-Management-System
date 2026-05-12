package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.Doctor;
import Entity.MedicalRecord;
import Entity.Patient;

//import static DoctorService.doctorList;
//import static DoctorService.doctorList;
import java.util.*;

public class DoctorService implements Manageable, Searchable {
    public static List<Doctor> doctorList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    public Doctor doctor =new Doctor();
    public List<Doctor> avilableSlots=new ArrayList<>();
    public List<Patient> patientList=new ArrayList<>();

    public Doctor addDoctor(){
        System.out.println(" ** Adding new Doctor ** ");

        System.out.println("Enter First Name: ");
        doctor.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name: ");
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

    public Doctor addDoctor(String name, String specialization, String phone){
        System.out.println("Enter First Name: ");
        String first=scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String last=scanner.nextLine();
        name=first+last;
        doctor.setFirstName(name);
        System.out.println("Enter Specialization: ");
        specialization=scanner.nextLine();
        doctor.setSpecialization(specialization);
        System.out.println("Enter Phone Number:");
        phone=scanner.nextLine();
        doctor.setPhoneNumber(phone);

        System.out.println("Doctor Added Successfully");
        return doctor;
    }

    public Doctor addDoctor(String name, String specialization, String phone, double consultationFee){
        System.out.println("Enter First Name: ");
        String first=scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String last=scanner.nextLine();
        name=first+last;
        doctor.setFirstName(name);
        System.out.println("Enter Specialization: ");
        specialization=scanner.nextLine();
        doctor.setSpecialization(specialization);
        System.out.println("Enter Phone Number:");
        phone=scanner.nextLine();
        doctor.setPhoneNumber(phone);
        System.out.println("Enter Consultation Fee: ");
        consultationFee=scanner.nextInt();
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
            System.out.println("If want ot add more doctors press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=true;
            }
            continueFlag=false;
        }
        return doctorList;
    }

    public void assignPatient(String doctorId, String patientId){
        System.out.println(doctorList+" ");
        System.out.println("Enter Doctor ID");
        doctorId=scanner.nextLine();
        Boolean found=false;
        for(Doctor d: doctorList) {
            if (d.getDoctorId().equalsIgnoreCase(doctorId)) {
                System.out.println("Enter Patient ID");
                patientId=scanner.nextLine();
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
        System.out.println("Enter doctor ID");
        doctorId=scanner.nextLine();
        Boolean found=false;
        for(Doctor d: doctorList) {
            if (d.getDoctorId().equalsIgnoreCase(doctorId)) {
                System.out.println("Enter Patient ID");
                patientIds.add(scanner.nextLine());
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
        System.out.println("Enter Doctor ID");
        java.lang.String ID=scanner.nextLine();
        Boolean found=false;
        for(Doctor d: doctorList){
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
        java.lang.String ID=scanner.nextLine();
        Boolean found=false;
        for(Doctor d: doctorList){
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
        java.lang.String ID=scanner.nextLine();
        Boolean found = false;
        for(Doctor d: doctorList){
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
        System.out.println("Enter doctor specialization");
        specialization=scanner.nextLine();
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
        System.out.println("Enter Department ID");
        departmentId=scanner.nextLine();
        for (Doctor d:doctorList){
            if(d.getDepartmentId().equalsIgnoreCase(departmentId)&&d.getAvailableSlots().equals(showAvailableOnly)){
                System.out.println(d+" ");
            }
        }
    }

    public void getDoctorsBySpecialization(){
        displayAllDoctors();
        System.out.println("Enter Doctor Specialization");
        java.lang.String specialization=scanner.nextLine();
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
    System.out.println("Enter Doctor Name");
    java.lang.String name=scanner.nextLine();
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

    }

    @Override
    public void searchById(String id) {

    }
}
