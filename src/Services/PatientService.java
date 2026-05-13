package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.*;
import Utils.HelperUtils;
import Utils.InputHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Entity.Patient.scanner;

public class PatientService implements Manageable, Searchable {
    public static List<Patient> patientList=new ArrayList<>();
    public static List<InPatient> inPatientList=new ArrayList<>();
    public static List<OutPatient> outPatientList=new ArrayList<>();
    public static List<EmergencyPatient> emergencyPatientList=new ArrayList<>();
    public static Scanner scanner=new Scanner(System.in);
    public Patient patient=new Patient();
    public InPatient inPatient=new InPatient();
    public OutPatient outPatient=new OutPatient();
    public EmergencyPatient emergencyPatient=new EmergencyPatient();
    public MedicalRecordService medicalRecordService=new MedicalRecordService();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Patient addPatient(){
        System.out.println(" ** Register New Patient ** ");

        String first= InputHandler.getStringInput("Enter First Name: ");
        patient.setFirstName(first);
        String last= InputHandler.getStringInput("Enter Last Name");
        patient.setLastName(last);
        String id= InputHandler.getStringInput("Enter ID: ");
        patient.setPatientId(id);
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        patient.setDateOfBirth(dateOfBirth);
        String gender= InputHandler.getStringInput("Enter Gender: ");
        patient.setGender(gender);
        String address= InputHandler.getStringInput("Enter Address: ");
        patient.setAddress(address);
        String email= InputHandler.getStringInput("Enter Email: ");
        patient.setEmail(email);
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        patient.setPhoneNumber(phoneNumber);
        String emergencyContactNumber= InputHandler.getStringInput("Enter Emergency Contact Number:");
        patient.setEmergencyContact(emergencyContactNumber);

        System.out.println("Patient Added Successfully");
        return patient;
    }
    public Patient addPatient(String firstName, String lastName, String phone){
        System.out.println("== Add patient with minimal information ==");
        firstName= InputHandler.getStringInput("Enter First Name: ");
        patient.setFirstName(firstName);
        lastName= InputHandler.getStringInput("Enter Last Name");
        patient.setLastName(lastName);
        phone= InputHandler.getStringInput("Enter Phone Number:");
        patient.setPhoneNumber(phone);

        System.out.println("Patient Added Successfully");
        return patient;
    }

    public Patient addPatient(String firstName, String lastName, String phone, String bloodGroup, String email){
        System.out.println("== Add patient with with blood group and email ==");
        firstName= InputHandler.getStringInput("Enter First Name: ");
        patient.setFirstName(firstName);
        lastName= InputHandler.getStringInput("Enter Last Name");
        patient.setLastName(lastName);
        phone= InputHandler.getStringInput("Enter Phone Number:");
        patient.setPhoneNumber(phone);
        bloodGroup= InputHandler.getStringInput("Enter Blood Group:");
        patient.setBloodGroup(bloodGroup);
        email= InputHandler.getStringInput("Enter Email: ");
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
            if(InputHandler.getStringInput("If want ot add more patient press C").equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
        return patientList;
    }

    public InPatient addInPatient(){
        System.out.println(" ** Register In Patient ** ");

        String first= InputHandler.getStringInput("Enter First Name: ");
        inPatient.setFirstName(first);
        String last= InputHandler.getStringInput("Enter Last Name");
        inPatient.setLastName(last);
        String id= InputHandler.getStringInput("Enter ID: ");
        inPatient.setPatientId(id);
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        inPatient.setDateOfBirth(dateOfBirth);
        String gender= InputHandler.getStringInput("Enter Gender: ");
        inPatient.setGender(gender);
        String address= InputHandler.getStringInput("Enter Address: ");
        inPatient.setAddress(address);
        String email= InputHandler.getStringInput("Enter Email: ");
        inPatient.setEmail(email);
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        inPatient.setPhoneNumber(phoneNumber);
        String emergencyContactNumber= InputHandler.getStringInput("Enter Emergency Contact Number:");
        inPatient.setEmergencyContact(emergencyContactNumber);
        LocalDate admissionDate=InputHandler.getDateInput("Enter Admission Date");
        inPatient.setAdmissionDate(admissionDate);
        String roomNumber=InputHandler.getStringInput("Enter Room Number");
        inPatient.setRoomNumber(roomNumber);
        String bedNumber=InputHandler.getStringInput("Enter BedNumber");
        inPatient.setBedNumber(bedNumber);
        double dailyCharge=InputHandler.getDoubleInput("Enter Daily Charges: ");
        inPatient.setDailyCharges(dailyCharge);

        System.out.println("In Patient Added Successfully");
        return inPatient;
    }

    public List<InPatient> addInPatients(){
        Boolean continueFlag = true;
        while (continueFlag) {
            inPatientList.add(addInPatient());
            if(InputHandler.getStringInput("If want ot add more patient press C").equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
        return inPatientList;
    }

    public OutPatient addOutPatient(){
        System.out.println(" ** Register Out Patient ** ");

        String first= InputHandler.getStringInput("Enter First Name: ");
        String last= InputHandler.getStringInput("Enter Last Name");
        String id= InputHandler.getStringInput("Enter ID: ");
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        String gender= InputHandler.getStringInput("Enter Gender: ");
        String address= InputHandler.getStringInput("Enter Address: ");
        String email= InputHandler.getStringInput("Enter Email: ");
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        String emergencyContactNumber= InputHandler.getStringInput("Enter Emergency Contact Number:");
        LocalDate registrationDate=InputHandler.getDateInput("Enter Registration Date:");
        LocalDate visitDate=InputHandler.getDateInput("Enter Last Visit Date:");
        String preferredDoctor=InputHandler.getStringInput("Enter Preferred Doctor ID:");

        System.out.println("Out Patient Added Successfully");
        return outPatient;
    }

    public List<OutPatient> addOutPatients(){
        Boolean continueFlag = true;
        while (continueFlag) {
            outPatientList.add(addOutPatient());
            System.out.println();
            if(InputHandler.getStringInput("If want ot add more patient press C").equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
        return outPatientList;
    }

    public EmergencyPatient addEmergencyPatient(){
        System.out.println(" ** Register Emergency Patient ** ");

        String first= InputHandler.getStringInput("Enter First Name: ");
        String last= InputHandler.getStringInput("Enter Last Name");
        String id= InputHandler.getStringInput("Enter ID: ");
        String dateOfBirth= InputHandler.getStringInput("Enter Date Of Birth: ");
        String gender= InputHandler.getStringInput("Enter Gender: ");
        String address= InputHandler.getStringInput("Enter Address: ");
        String email= InputHandler.getStringInput("Enter Email: ");
        String phoneNumber= InputHandler.getStringInput("Enter Phone Number:");
        String emergencyContactNumber= InputHandler.getStringInput("Enter Emergency Contact Number:");
        LocalDate registrationDate=InputHandler.getDateInput("Enter Registration Date:");
        String emergencyType=InputHandler.getStringInput("Enter Emergency Type:");
        String arrivalMode=InputHandler.getStringInput("Enter Arrival Mode:");
        Boolean administrative=InputHandler.getConfirmation("Enter If Administrative ER:");

        System.out.println("Emergency Patient Added Successfully");
        return emergencyPatient;
    }

    public List<EmergencyPatient> addEmergencyPatients(){
        Boolean continueFlag = true;
        while (continueFlag) {
            emergencyPatientList.add(addEmergencyPatient());
            if(InputHandler.getStringInput("If want ot add more patient press C").equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
        return emergencyPatientList;
    }

    public void editPatient(){
        System.out.println(" ** Update Patient ** ");
        displayAllPatients();
        String id=InputHandler.getStringInput("Enter Patient ID");
        Boolean found=false;
        for(Patient p:patientList){
            if(p.getPatientId().equals(id)){
                p.setFirstName(InputHandler.getStringInput("Enter New Name"));
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
            if(InputHandler.getStringInput("If want ot update more patient press C").equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }
    public void removePatient(){
        System.out.println(" ** Remove Patient ** ");
        displayAllPatients();
        String id=InputHandler.getStringInput("Enter Patient ID");
        Boolean found=false;
        for(Patient p:patientList){
            if(p.getPatientId().equals(id)){
            patientList.remove(id);
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
            if(InputHandler.getStringInput("If want ot delete more patient press C").equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }
    public void getPatientById(){
        displayAllPatients();
            System.out.println();
            String id=InputHandler.getStringInput("Enter Patient ID");
            Boolean found = false;
            for(Patient p:patientList){
                if(p.getPatientId().equalsIgnoreCase(id)){
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
        System.out.println(" ** Search For Patient ** ");
        displayAllPatients();
        String name=InputHandler.getStringInput("Enter Patient Name");
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
        keyword=InputHandler.getStringInput("Enter Patient Field: ");
        for(Patient p: patientList){
            if(p.getLastName().equalsIgnoreCase(keyword) ||p.getFirstName().equalsIgnoreCase(keyword) ||p.getPatientId().equalsIgnoreCase(keyword) ||p.getPhoneNumber().equalsIgnoreCase(keyword) ||p.getBloodGroup().equalsIgnoreCase(keyword) ||p.getInsuranceId().equalsIgnoreCase(keyword) ||p.getDateOfBirth().equalsIgnoreCase(keyword) ||p.getGender().equalsIgnoreCase(keyword) ||p.getEmail().equalsIgnoreCase(keyword) ||p.getMedicalRecords().equals(keyword)) {
                System.out.println("Patient exist");
            }
        }
        System.out.println("Patient NOT exist");
    }

    public void searchPatients(String firstName, String lastName){
        System.out.println("== Search for patient by name ==");
        firstName=InputHandler.getStringInput("Enter First Name: ");
        lastName=InputHandler.getStringInput("Enter Last Name: ");
        for(Patient p:patientList){
            if(p.getFirstName().equalsIgnoreCase(firstName)&&p.getLastName().equalsIgnoreCase(lastName)){
                System.out.println("Patient exist");
            }
        }
        System.out.println("Patient NOT exist");
    }

    public void displayPatients(){
        System.out.println(" ** Display All Patients ** ");
        if(patientList.isEmpty()){
            System.out.println("No Patient In The List");
        }
        for(Patient p:patientList){
            System.out.println(p+" ");
        }
    }

    public void displayPatients(String filter){
        System.out.println("== Display all patients ==");
        filter=InputHandler.getStringInput("Enter Filter To Display Patient");
        for(Patient p: patientList){
            if(p.getLastName().equalsIgnoreCase(filter) ||p.getFirstName().equalsIgnoreCase(filter) ||p.getPatientId().equalsIgnoreCase(filter) ||p.getPhoneNumber().equalsIgnoreCase(filter) ||p.getBloodGroup().equalsIgnoreCase(filter) ||p.getInsuranceId().equalsIgnoreCase(filter) ||p.getDateOfBirth().equalsIgnoreCase(filter) ||p.getGender().equalsIgnoreCase(filter) ||p.getEmail().equalsIgnoreCase(filter) ||p.getMedicalRecords().equals(filter)){
                System.out.println("Patient Name: "+p.getFirstName()+" "+p.getLastName());
                System.out.println("Patient ID: "+p.getPatientId());
                System.out.println("Patient Birthday: "+p.getDateOfBirth());
                System.out.println("Patient Phone Number: "+p.getPhoneNumber());
                System.out.println("Patient Address: "+p.getAddress());
            }
        }
    }

    public void displayPatients(int limit){
        System.out.println("== Display limited number of patients ==");
        displayPatients();
        if(limit<=0){
            System.out.println("Not Valid Limit");
        }
        int count=0;
        for(Patient p: patientList){
            if(count<limit){
                System.out.println("Patient Name: "+p.getFirstName()+" "+p.getLastName()+" | "+p.getPatientId());
                count++;
            }
            break;
        }
    }

    public Boolean handelPatientService(Integer patientOption){
        switch (patientOption){
            case 1 -> {
                System.out.println("== Register New Patient ==");
                addPatients();
            }

            case 2-> {
                System.out.println("== Register In Patient ==");
                addInPatients();
            }

            case 3-> {
                System.out.println("== Register Out Patient ==");
                addOutPatients();
            }

            case 4-> {
                System.out.println("==Register Emergency Patient ==");
                addEmergencyPatients();
            }

            case 5 -> {
                System.out.println("== View All Patients ==");
                displayAllPatients();
            }

            case 6 -> {
                System.out.println("== Search For a Patient ==");
                searchPatientsByName();
            }

            case 7 -> {
                System.out.println("== Update Patient Information ==");
                editPatient();
            }

            case 8 -> {
                System.out.println("== Remove Patient ==");
                removePatient();
            }

            case 9-> {
                System.out.println("== View Patient Medical History ==");
                medicalRecordService.displayPatientHistory();
            }

            case 10 -> {
                System.out.println("== Show SPECIFIC Patient Using ID ==");
                getPatientById();
            }

            case 11 ->
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
