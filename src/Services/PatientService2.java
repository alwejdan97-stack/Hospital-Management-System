package Services;

import Entity.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService2 {
    public Patient patient=new Patient();
    public List<Patient> patientList=new ArrayList<>();

    public Patient addPatient(String firstName, String lastName, String phone){
        System.out.println("== with minimal information ==");
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setPhoneNumber(phone);

        System.out.println("Patient Added Successfully");
        return patient;
    }
    public Patient addPatient(String firstName, String lastName, String phone, String bloodGroup, String email){
        System.out.println("== with with blood group and email ==");
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setPhoneNumber(phone);
        patient.setBloodGroup(bloodGroup);
        patient.setEmail(email);

        System.out.println("Patient Added Successfully");
        return patient;
    }

    public void addPatient(Patient patient){
        System.out.println("== With Full Object ==");
        patientList.add(patient);

        System.out.println("Patient Added Successfully");
    }

    public void searchPatients(String keyword){
        displayPatients();
        for(Patient p: patientList){

        }
    }

    public void searchPatients(String firstName, String lastName){}

    public void displayPatients(){
        for(Patient p:patientList){
            System.out.println(p+" ");
        }
    }

    public void displayPatients(String filter){

    }

    public void displayPatients(int limit){}
}
