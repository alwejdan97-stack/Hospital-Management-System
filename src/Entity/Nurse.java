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

    public Nurse(String nurseId, String departmentId, String shift, String qualification, List<String> assignedPatients) {
        this.nurseId = nurseId;
        this.departmentId = departmentId;
        this.shift = shift;
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

    public void assignedPatient(){
        System.out.println("Enter patient");
        assignedPatients.add(scanner.nextLine());
    }
    public void removePatient(){
        System.out.println("Enter Patient to Remove");
        assignedPatients.remove(scanner.nextLine());
    }
}
