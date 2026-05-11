package Entity;

import Behaviour.DoctorInterface;

import java.util.List;
import java.util.Scanner;

public class Doctor extends Person implements DoctorInterface {
    private String doctorId;
    private String specialization;
    private String qualification;
    private Integer experienceYears;
    private String departmentId;
    private Double consultationFee;
    private List<String> availableSlots;
    private List<Patient> assignedPatients;

    public static Scanner scanner=new Scanner(System.in);

    public Doctor() {
        super();
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.qualification = qualification;
        this.experienceYears = experienceYears;
        this.departmentId = departmentId;
        this.consultationFee = consultationFee;
        this.availableSlots = availableSlots;
        this.assignedPatients = assignedPatients;
    }

    public void setDoctorId(String doctorId){
        this.doctorId=doctorId;
    }
    public String getDoctorId(){
        return doctorId;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public String getQualification(){
        return qualification;
    }
    public void setExperienceYears(int experienceYears){
        this.experienceYears=experienceYears;
    }
    public int getExperienceYears(){
        return experienceYears;
    }
    public void setDepartmentId(String departmentId){
        this.departmentId=departmentId;
    }
    public String getDepartmentId(){
        return departmentId;
    }
    public void setConsultationFee(double consultationFee){
        this.consultationFee=consultationFee;
    }
    public double getConsultationFee(){
        return consultationFee;
    }
    public void setAvailableSlots(List<String> availableSlots){
        this.availableSlots=availableSlots;
    }
    public List<String> getAvailableSlots(){
        return availableSlots;
    }
    public void setAssignedPatients(List<Patient> assignedPatients){
        this.assignedPatients=assignedPatients;
    }
    public List<Patient> getAssignedPatients(){
        return assignedPatients;
    }
    @Override
    public void displayInfo(){
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Specialization: "+specialization);
        System.out.println("Qualification: "+qualification);
        System.out.println("Experience Year: "+experienceYears);
        System.out.println("Department ID: "+departmentId);
        System.out.println("Consultation Fee: "+consultationFee);
        System.out.println("Available Slots"+availableSlots);
        System.out.println("Assigned Patients: "+assignedPatients);
    }

    @Override
    public void assignPatient(Patient patient) {
        assignedPatients.add(patient);
    }

    @Override
    public void removePatient(Patient patient) {
        assignedPatients.remove(patient);
    }

    @Override
    public void updateAvailability(List<String> avilabiltySlot) {
        setAvailableSlots(avilabiltySlot);
    }
}
