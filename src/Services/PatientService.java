package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Entity.Patient.scanner;

public class PatientService implements Manageable, Searchable {
    public static List<Patient> patientList=new ArrayList<>();
    public static Scanner scanner=new Scanner(System.in);
    public Patient patient=new Patient();
    public InPatient inPatient=new InPatient();
    public OutPatient outPatient=new OutPatient();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Patient addPatient(){
        System.out.println(" ** Register New Patient ** ");

        System.out.println("Enter First Name: ");
        patient.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name");
        patient.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        patient.setPatientId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        patient.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Gender: ");
        patient.setGender(scanner.nextLine());
        System.out.println("Enter Address: ");
        patient.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        patient.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        patient.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Emergency Contact Number:");
        patient.setEmergencyContact(scanner.nextLine());

        System.out.println("Patient Added Successfully");
        return patient;
    }
    public Patient addPatient(String firstName, String lastName, String phone){
        System.out.println("== Add patient with minimal information ==");
        System.out.println("Enter First Name: ");
        firstName=scanner.nextLine();
        patient.setFirstName(firstName);
        System.out.println("Enter Second Name");
        lastName=scanner.nextLine();
        patient.setLastName(lastName);
        System.out.println("Enter Phone Number:");
        phone=scanner.nextLine();
        patient.setPhoneNumber(phone);

        System.out.println("Patient Added Successfully");
        return patient;
    }

    public Patient addPatient(String firstName, String lastName, String phone, String bloodGroup, String email){
        System.out.println("== Add patient with with blood group and email ==");
        System.out.println("Enter First Name: ");
        firstName=scanner.nextLine();
        patient.setFirstName(firstName);
        System.out.println("Enter Second Name");
        lastName=scanner.nextLine();
        patient.setLastName(lastName);
        System.out.println("Enter Phone Number:");
        phone=scanner.nextLine();
        patient.setPhoneNumber(phone);
        System.out.println("Enter Blood Group:");
        bloodGroup=scanner.nextLine();
        patient.setBloodGroup(bloodGroup);
        System.out.println("Enter Email: ");
        email=scanner.nextLine();
        patient.setEmail(email);

        System.out.println("Patient Added Successfully");
        return patient;
    }

    public Patient addPatient(Patient patient){
        System.out.println("== Add patient With Full Object ==");
        patientList.add(patient);

        System.out.println("Patient Added Successfully");
        return patient;
    }

    public List<Patient> addPatients(){
        Boolean continueFlag = true;
        while (continueFlag) {
            patientList.add(addPatient());
            System.out.println("If want ot add more patient press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
        return patientList;
    }

    public InPatient addInPatient(){
        System.out.println(" ** Register In Patient ** ");

        System.out.println("Enter First Name: ");
        inPatient.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name");
        inPatient.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        inPatient.setPatientId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        inPatient.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Gender: ");
        inPatient.setGender(scanner.nextLine());
        System.out.println("Enter Address: ");
        inPatient.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        inPatient.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        inPatient.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Emergency Contact Number:");
        inPatient.setEmergencyContact(scanner.nextLine());
        System.out.println("Enter Admission Date");
        LocalDate admissionDate = LocalDate.parse(scanner.nextLine(), formatter);
        inPatient.setAdmissionDate(admissionDate);
        System.out.println("Enter Room Number");
        inPatient.setRoomNumber(scanner.nextLine());
        System.out.println("Enter Bed Number");
        inPatient.setBedNumber(scanner.nextLine());
        System.out.println("Enter Daily Charges: ");
        inPatient.setDailyCharges(scanner.nextDouble());

        System.out.println("In Patient Added Successfully");
        return inPatient;
    }

    public OutPatient addOutPatient(){
        System.out.println(" ** Register Out Patient ** ");

        System.out.println("Enter First Name: ");
        outPatient.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name");
        outPatient.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        outPatient.setPatientId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        outPatient.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Gender: ");
        outPatient.setGender(scanner.nextLine());
        System.out.println("Enter Address: ");
        outPatient.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        outPatient.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        outPatient.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Emergency Contact Number:");
        outPatient.setEmergencyContact(scanner.nextLine());
        System.out.println("Enter Registration Date:");
        LocalDate registrationDate = LocalDate.parse(scanner.nextLine(), formatter);
        outPatient.setRegistrationDate(registrationDate);
        System.out.println("Enter Last Visit Date:");
        LocalDate lastVisitDate = LocalDate.parse(scanner.nextLine(), formatter);
        outPatient.setLastVisitDate(lastVisitDate);
        System.out.println("Enter Preferrd Doctor ID");
        outPatient.setPreferredDoctorId(scanner.nextLine());

        System.out.println("Out Patient Added Successfully");
        return outPatient;
    }

    public EmergencyPatient addEmergencyPatient(){
        System.out.println(" ** Register Emergency Patient ** ");

        System.out.println("Enter First Name: ");
        outPatient.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name");
        outPatient.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        outPatient.setPatientId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        outPatient.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Gender: ");
        outPatient.setGender(scanner.nextLine());
        System.out.println("Enter Address: ");
        outPatient.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        outPatient.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        outPatient.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Emergency Contact Number:");
        outPatient.setEmergencyContact(scanner.nextLine());
        System.out.println("Enter Registration Date:");
        LocalDate registrationDate = LocalDate.parse(scanner.nextLine(), formatter);
        outPatient.setRegistrationDate(registrationDate);
        System.out.println("Enter Last Visit Date:");
        LocalDate lastVisitDate = LocalDate.parse(scanner.nextLine(), formatter);
        outPatient.setLastVisitDate(lastVisitDate);
        System.out.println("Enter Preferrd Doctor ID");
        outPatient.setPreferredDoctorId(scanner.nextLine());

        System.out.println("OutPatient Added Successfully");
        return outPatient;
    }

    public void editPatient(){
        displayAllPatients();
        System.out.println("Enter Patient ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Patient p:patientList){
            if(p.getPatientId().equals(ID)){
                System.out.println("Enter New Name");
                p.setFirstName(scanner.nextLine());
                System.out.println("Patient Updated Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Patient NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot update more patient press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }
    public void removePatient(){
        displayAllPatients();
        System.out.println("Enter Patient ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Patient p:patientList){
            if(p.getPatientId().equals(ID)){
            patientList.remove(ID);
                System.out.println("Patient Removed Successful");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Patient NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot delete more patient press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }
    public void getPatientById(){
        displayAllPatients();
            System.out.println("Enter Patient ID");
            String ID=scanner.nextLine();
            Boolean found = false;
            for(Patient p:patientList){
                if(p.getPatientId().equalsIgnoreCase(ID)){
                    System.out.println("Patient Name: "+p.getFirstName()+" "+p.getLastName());
                    System.out.println("Patient ID: "+p.getPatientId());
                    System.out.println("Patient Birthday: "+p.getDateOfBirth());
                    System.out.println("Patient Phone Number: "+p.getPhoneNumber());
                    System.out.println("Patient Address: "+p.getAddress());
                    found=true;
                }
            }
            if (!found) {
                System.out.println("Patient NOT found");
            }
        }
    public static void displayAllPatients(){
        if(PatientService.patientList.isEmpty()){
            System.out.println("NO Patient in the List");
        }
        for(Patient p: PatientService.patientList) {
                System.out.println("Patient Name: " + p.getFirstName() + " " + p.getLastName()+" | Patient ID: "+p.getPatientId());
        }
    }
    public static void searchPatientsByName(){
        //displayAllPatients();
        System.out.println("Enter Patient Name");
        String name=scanner.nextLine();
        Boolean found = false;
        for(Patient p: PatientService.patientList){
            if(p.getFirstName().equalsIgnoreCase(name)){
                System.out.println("Patient Name: "+p.getFirstName()+" "+p.getLastName()+" is found");
                found=true;
            }
        }
        if (!found) {
            System.out.println("Patient NOT found");
        }
    }

    public void searchPatients(String keyword){
        System.out.println("== Search for patient by any field ==");
        System.out.println("Enter Patient Field: ");
        keyword=scanner.nextLine();
        for(Patient p: patientList){
            if(p.getLastName().equalsIgnoreCase(keyword) ||p.getFirstName().equalsIgnoreCase(keyword) ||p.getPatientId().equalsIgnoreCase(keyword) ||p.getPhoneNumber().equalsIgnoreCase(keyword) ||p.getBloodGroup().equalsIgnoreCase(keyword) ||p.getInsuranceId().equalsIgnoreCase(keyword) ||p.getDateOfBirth().equalsIgnoreCase(keyword) ||p.getGender().equalsIgnoreCase(keyword) ||p.getEmail().equalsIgnoreCase(keyword) ||p.getMedicalRecords().equals(keyword)) {
                System.out.println("Patient exist");
            }
        }
        System.out.println("Patient NOT exist");
    }

    public void searchPatients(String firstName, String lastName){
        System.out.println("== Search for patient by name ==");
        System.out.println("Enter First Name: ");
        firstName=scanner.nextLine();
        System.out.println("Enter Last Name: ");
        lastName=scanner.nextLine();
        for(Patient p:patientList){
            if(p.getFirstName().equalsIgnoreCase(firstName)&&p.getLastName().equalsIgnoreCase(lastName)){
                System.out.println("Patient exist");
            }
        }
        System.out.println("Patient NOT exist");
    }

    public void displayPatients(){
        System.out.println("== Display all patients ==");
        if(patientList.isEmpty()){
            System.out.println("No Patient In The List");
        }
        for(Patient p:patientList){
            System.out.println(p+" ");
        }
    }

    public void displayPatients(String filter){
        System.out.println("== Display all patients ==");
        for(Patient p: patientList){}
    }

    public void displayPatients(int limit){
        System.out.println("== Display limited number of patients ==");
        for(Patient p: patientList){

        }
    }

    public Boolean handelPatientService(Integer patientOption){
        switch (patientOption){
            case 1 -> {
                System.out.println("== Add New Patient ==");
                addPatients();
            }
            case 2 -> {
                System.out.println("== Update Patient ==");
                editPatient();
            }

            case 3 -> {
                System.out.println("== Show Patients ==");
                displayAllPatients();
            }

            case 4 -> {
                System.out.println("== Show SPECIFIC Patient Using ID ==");
                getPatientById();
            }

            case 5 -> {
                System.out.println("== Delete Patient ==");
                removePatient();
            }

            case 6 -> {
                System.out.println("== Search For a Patient ==");
                searchPatientsByName();
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
        if(entity instanceof Patient){
            patientList.add((Patient) entity);
        }
    }

    @Override
    public void remove(String id) {
        boolean found=false;
        for(Patient p:patientList){
            if(p.getPatientId().equalsIgnoreCase(id)){
                patientList.remove(id);
                System.out.println("Patient Removed Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Patient NOT Found");
        }
    }

    @Override
    public void getAll() {
        for (Patient p: patientList){
            System.out.println(p+" ");
        }
    }

    @Override
    public void search(String keyword) {
        for(Patient p:patientList){
            if(p.getPatientId().equalsIgnoreCase(keyword)||p.getFirstName().equalsIgnoreCase(keyword)||p.getLastName().equalsIgnoreCase(keyword)||p.getPhoneNumber().equalsIgnoreCase(keyword)){
                System.out.println("Patient Exist");
            }
        }
        System.out.println("Patient NOT Exist");
    }

    @Override
    public void searchById(String id) {
        for(Patient p:patientList){
            if(p.getPatientId().equalsIgnoreCase(id)){
                System.out.println("Patient Exist");
            }
        }
        System.out.println("Patient NOT Exist");
    }
}
