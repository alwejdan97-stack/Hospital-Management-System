package Services;

import Entity.Patient;
import Entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientService {
    List<Patient> patientList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    Patient patient=new Patient();

    public Patient addPatient(){
        System.out.println(" ** Adding new Patient ** ");
        System.out.println("Enter Name: ");
        patient.setFirstName(scanner.nextLine()); patient.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        patient.setPatientId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        patient.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Address: ");
        patient.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        patient.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        patient.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Emergency Contact Number:");
        patient.setEmergencyContact(scanner.nextLine());
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
    public void editPatient(){

        System.out.println("Enter Patient ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Patient p:patientList){
            if(p.getPatientId().equalsIgnoreCase(ID)){
                System.out.println("Enter New Name");
                p.setFirstName(scanner.nextLine());
                System.out.println("Updated Successful");
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
            if(p.getPatientId().equalsIgnoreCase(ID)){
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
        if(patientList.isEmpty()){
            System.out.println("NO Patient in the List");
        }
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
    }
    public void displayAllPatients(){
        if(patientList.isEmpty()){
            System.out.println("NO Patient in the List");
        }
        for(Patient p:patientList) {
                System.out.println("Patient Name: " + p.getFirstName() + " " + p.getLastName()+" | Patient ID: "+p.getPatientId());
        }
    }
}
