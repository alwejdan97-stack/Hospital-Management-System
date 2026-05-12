package Entity;

import Behaviour.Displayable;
import Behaviour.DoctorInterface;

import java.util.List;
import java.util.Scanner;

public class Doctor extends Person implements Displayable {
    private String doctorId;
    private String specialization;
    private String qualification;
    private Integer experienceYears;
    private String departmentId;
    private Double consultationFee;
    private List<String> availableSlots;
    private List<String> assignedPatients;
    private double fee;
    private String reason;
    private String slot;
    private List<String> slots;

    public static Scanner scanner=new Scanner(System.in);

    public Doctor() {
        super();
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.qualification = qualification;
        this.departmentId = departmentId;
        this.experienceYears = experienceYears;
        this.consultationFee = consultationFee;
        this.availableSlots = availableSlots;
        this.fee = fee;
        this.assignedPatients = assignedPatients;
        this.reason = reason;
        this.slot = slot;
        this.slots = slots;
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
    public void setAssignedPatients(List<String> assignedPatients){
        this.assignedPatients=assignedPatients;
    }
    public List<String> getAssignedPatients(){
        return assignedPatients;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
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
    public void displaySummary() {
        super.displaySummary();
        System.out.println(doctorId+" | "+specialization+" | "+departmentId);
    }

    public void assignPatient(String patient) {
        assignedPatients.add(patient);
    }

    public void removePatient(String patient) {
        assignedPatients.remove(patient);
    }

    public void updateAvailability(List<String> avilabiltySlot) {
        setAvailableSlots(avilabiltySlot);
    }

    public void updateFee(double fee){
        this.fee=fee;
    }

    public void updateFee(double fee, String reason){
        this.fee=fee;
        this.reason=reason;
    }

    public void addAvailability(String slot){
        this.reason=reason;
    }

    public void addAvailability(List<String> slots){
        this.slots=slots;
    }
}
