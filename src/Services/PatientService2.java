package Services;

import Entity.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService2 {
    public Patient patient=new Patient();
    public List<Patient> patientList=new ArrayList<>();

    public Patient addPatient(String firstName, String lastName, String phone){
        System.out.println("== Add patient with minimal information ==");
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setPhoneNumber(phone);

        System.out.println("Patient Added Successfully");
        return patient;
    }
    public Patient addPatient(String firstName, String lastName, String phone, String bloodGroup, String email){
        System.out.println("== Add patient with with blood group and email ==");
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setPhoneNumber(phone);
        patient.setBloodGroup(bloodGroup);
        patient.setEmail(email);

        System.out.println("Patient Added Successfully");
        return patient;
    }

    public void addPatient(Patient patient){
        System.out.println("== Add patient With Full Object ==");
        patientList.add(patient);

        System.out.println("Patient Added Successfully");
    }

    public void searchPatients(String keyword){
        System.out.println("== Search for patient by any field ==");
        for(Patient p: patientList){
            if(p.getLastName().equalsIgnoreCase(keyword) ||p.getFirstName().equalsIgnoreCase(keyword) ||p.getPatientId().equalsIgnoreCase(keyword) ||p.getPhoneNumber().equalsIgnoreCase(keyword) ||p.getBloodGroup().equalsIgnoreCase(keyword) ||p.getInsuranceId().equalsIgnoreCase(keyword) ||p.getDateOfBirth().equalsIgnoreCase(keyword) ||p.getGender().equalsIgnoreCase(keyword) ||p.getEmail().equalsIgnoreCase(keyword) ||p.getMedicalRecords().equals(keyword)) {
                System.out.println("Patient exist");
            }
        }
        System.out.println("Patient NOT exist");
    }

    public void searchPatients(String firstName, String lastName){
        for(Patient p:patientList){
            if(p.getFirstName().equalsIgnoreCase(firstName)&&p.getLastName().equalsIgnoreCase(lastName)){
                System.out.println("Patient exist");
            }
        }
        System.out.println("Patient NOT exist");
    }

    public void displayPatients(){
        for(Patient p:patientList){
            System.out.println(p+" ");
        }
    }

    public void displayPatients(String filter){

    }

    public void displayPatients(int limit){}
}
