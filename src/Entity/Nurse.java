package Entity;

import java.util.List;
import java.util.Scanner;

public class Nurse extends Person{
    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<String> assignedPatients;

    public static Scanner scanner=new Scanner(System.in);

    public Nurse(String id, String lastName, String firstName, String gender, String dateOfBirth, String phoneNumber, String email, String address, String nurseId, String shift, String departmentId, String qualification, List<String> assignedPatients) {
        super(id, lastName, firstName, gender, dateOfBirth, phoneNumber, email, address);
        this.nurseId = nurseId;
        this.shift = shift;
        this.departmentId = departmentId;
        this.qualification = qualification;
        this.assignedPatients = assignedPatients;
    }

    public void setNurseId(String nurseId){
        this.nurseId=nurseId;
    }
    public String getNurseId(){
        return nurseId;
    }
    public void setDepartmentId(String departmentId){
        this.departmentId=departmentId;
    }
    public String getDepartmentId(){
        return departmentId;
    }
    public void setShift(String shift){
        this.shift=shift;
    }
    public String getShift(){
        return shift;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public void setAssignedPatients(List<String> assignedPatients){
        this.assignedPatients=assignedPatients;
    }
    public List<String> getAssignedPatients(){
        return assignedPatients;
    }

    @Override
    public void displayInfo(){
        System.out.println("Nurs ID: "+nurseId);
        System.out.println("Department ID: "+departmentId);
        System.out.println("Shift: "+shift);
        System.out.println("Qualification: "+qualification);
        System.out.println("Assigned Patient: "+assignedPatients);
    }

    public void assignedPatient(String patient){
        assignedPatients.add(patient);
    }
    public void removePatient(String patient){
        assignedPatients.remove(patient);
    }
}
