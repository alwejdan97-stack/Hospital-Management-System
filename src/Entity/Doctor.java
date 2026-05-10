package Entity;

import java.util.List;
import java.util.Locale;

public class Doctor extends Person{
    private String doctorId;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String departmentId;
    private double consultationFee;
    private List<String> availableSlots;
    private List<Patient> assignedPatients;

    public Doctor(){
        super();
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
}
