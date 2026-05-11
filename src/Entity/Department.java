package Entity;

import Behaviour.DepartmentInterface;

import java.util.List;

public class Department implements DepartmentInterface {
    private java.lang.String departmentId;
    private java.lang.String departmentName;
    private java.lang.String headStringId;
    private List<String> strings;
    private List<Nurse> nurses;
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
        this.headStringId = headStringId;
    }
    public java.lang.String getHeadDoctorId(){
        return headStringId;
    }
    public void setDoctors(List<String> strings) {
        this.strings = strings;
    }
    public List<String> getDoctors() {
        return strings;
    }
    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }
    public List<Nurse> getNurses() {
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

    @Override
    public void assignDoctor(java.lang.String stringName) {

    }

    @Override
    public void assignNurse(java.lang.String nursName) {

    }

    @Override
    public Boolean updateBedAvailability(int updatedBed) {
        return null;
    }
}
