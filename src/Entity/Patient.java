package Entity;

import Behaviour.PatientInterface;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Patient extends Person implements PatientInterface {
    private String patientId;
    private String bloodGroup;
    private List<String> allergies;
    private String emergencyContact;
    private LocalDate registrationDate;
    private String insuranceId;
    private List<String> medicalRecords;
    private List<String> appointments;

    public static Scanner scanner=new Scanner(System.in);


    public Patient(List<String> medicalRecords, List<String> appointments, LocalDate registrationDate, String insuranceId, List<String> allergies, String emergencyContact, String patientId, String bloodGroup) {
        super(medicalRecords,appointments,registrationDate,insuranceId,allergies,emergencyContact,patientId,bloodGroup);
        this.medicalRecords = medicalRecords;
        this.appointments = appointments;
        this.registrationDate = registrationDate;
        this.insuranceId = insuranceId;
        this.allergies = allergies;
        this.emergencyContact = emergencyContact;
        this.patientId = patientId;
        this.bloodGroup = bloodGroup;
    }

    public void setPatientId(String patientId){
        this.patientId=patientId;
    }
    public String getPatientId(){
        return patientId;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setAllergies(List<String> allergies){
        this.allergies=allergies;
    }
    public List<String> getAllergies(){
        return allergies;
    }
    public void setEmergencyContact(String emergencyContact){
        this.emergencyContact=emergencyContact;
    }
    public String getEmergencyContact(){
        return emergencyContact;
    }
    public void setRegistrationDate(LocalDate registrationDate){
        this.registrationDate=registrationDate;
    }
    public LocalDate getRegistrationDate(){
        return registrationDate;
    }
    public void setInsuranceId(String insuranceId){
        this.insuranceId=insuranceId;
    }
    public String getInsuranceId(){
        return insuranceId;
    }
    public void setMedicalRecords(List<String> medicalRecords){
        this.medicalRecords=medicalRecords;
    }
    public List<String> getMedicalRecords(){
        return medicalRecords;
    }
    public void setAppointments(List<String> appointments){
        this.appointments=appointments;
    }
    public List<String> getAppointments(){
        return appointments;
    }

    @Override
    public void displayInfo(){
        System.out.println("Patient Id: "+patientId);
        System.out.println("Blood Group: "+bloodGroup);
        System.out.println("Allergies: "+allergies);
        System.out.println("Appointments: "+appointments);
        System.out.println("Emergency Contact: "+emergencyContact);
        System.out.println("Registration Date: "+registrationDate);
        System.out.println("Medical Records: "+medicalRecords);
        System.out.println("Insurance ID: "+insuranceId);
    }

    @Override
    public void addMedicalRecord() {
        System.out.println("Enter Medical Record");
        medicalRecords.add(scanner.nextLine());
    }



    @Override
    public void addAppointment() {
        System.out.println("Enter new appointment");
        appointments.add(scanner.nextLine());
    }

    @Override
    public void updateInsurance(UUID id, String insurance) {
        return;
    }
}
