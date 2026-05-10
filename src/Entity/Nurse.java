package Entity;

import java.util.List;

public class Nurse extends Person{
    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<Patient> assignedPatients;

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
    public void setAssignedPatients(List<Patient> assignedPatients){
        this.assignedPatients=assignedPatients;
    }
    public List<Patient> getAssignedPatients(){
        return assignedPatients;
    }
}
