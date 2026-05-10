package Entity;

import Behaviour.PatientInterface;

import java.time.LocalDate;
import java.util.List;
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

    public Patient(){
        super();
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
    }

    @Override
    public void addMedicalRecord() {

    }

    @Override
    public Boolean addAppointment() {
        return null;
    }

    @Override
    public Boolean updateInsurance(UUID id, String insurance) {
        return null;
    }
}
