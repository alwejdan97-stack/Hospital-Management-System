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
        System.out.println(" ** Adding new Patient **");
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
}
