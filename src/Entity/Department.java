package Entity;

import Behaviour.DepartmentInterface;
import Behaviour.Displayable;

import java.util.List;

public class Department implements Displayable {
    private String departmentId;
    private String departmentName;
    private String headDoctorId;
    private List<String> doctors;
    private List<String> nurses;
    private int bedCapacity;
    private int availableBeds;

    public void setDepartmentId(java.lang.String departmentId){
        this.departmentId=departmentId;
    }
    public java.lang.String getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentName(java.lang.String departmentName){
        this.departmentName=departmentName;
    }
    public java.lang.String getDepartmentName(){
        return departmentName;
    }
    public void setHeadDoctorId(java.lang.String headStringId){
        this.headDoctorId = headStringId;
    }
    public java.lang.String getHeadDoctorId(){
        return headDoctorId;
    }
    public void setDoctors(List<String> doctors) {
        this.doctors = doctors;
    }
    public List<String> getDoctors() {
        return doctors;
    }
    public void setNurses(List<String> nurses) {
        this.nurses = nurses;
    }
    public List<String> getNurses() {
        return nurses;
    }
    public void setBedCapacity(int bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
    public int getBedCapacity() {
        return bedCapacity;
    }
    public void setAvailableBeds(int availableBeds) {
        this.availableBeds = availableBeds;
    }
    public int getAvailableBeds() {
        return availableBeds;
    }


    public void assignDoctor(String stringName) {
        assignDoctor(stringName);
    }

    public void assignNurse(String nursName) {
        assignNurse(nursName);
    }

    public void updateBedAvailability(int updatedBed) {
        updateBedAvailability(updatedBed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Department Name: "+departmentName);
        System.out.println("Department ID: "+departmentId);
        System.out.println("Head Doctor ID: "+headDoctorId);
        System.out.println("Doctors: "+doctors);
        System.out.println("Nurses: "+nurses);
        System.out.println("Bed Capacity: "+bedCapacity);
        System.out.println("Available Bed: "+availableBeds);
    }

    @Override
    public void displaySummary() {
        System.out.println(departmentName+" | "+departmentId+" | "+headDoctorId);
    }
}
