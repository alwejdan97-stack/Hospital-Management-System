package Entity;

import Behaviour.Displayable;

import java.util.List;
import java.util.Scanner;

public class Nurse extends Person implements Displayable {
    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<String> assignedPatients;

    public static Scanner scanner=new Scanner(System.in);

    public Nurse() {
        super();
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
        super.displayInfo();
        System.out.println("Nurs ID: "+nurseId);
        System.out.println("Department ID: "+departmentId);
        System.out.println("Shift: "+shift);
        System.out.println("Qualification: "+qualification);
        System.out.println("Assigned Patient: "+assignedPatients);
    }

    @Override
    public void displaySummary() {
        super.displaySummary();
        System.out.println(nurseId+" | "+departmentId);
    }

    public void assignedPatient(String patient){
        assignedPatients.add(patient);
    }
    public void removePatient(String patient){
        assignedPatients.remove(patient);
    }
}
