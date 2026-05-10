package Entity;

import Behaviour.DepartmentInterface;

import java.util.List;

public class Department implements DepartmentInterface {
    private String departmentId;
    private String departmentName;
    private String headDoctorId;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private int bedCapacity;
    private int availableBeds;

    public void setDepartmentId(String departmentId){
        this.departmentId=departmentId;
    }
    public String getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void setHeadDoctorId(String headDoctorId){
        this.headDoctorId=headDoctorId;
    }
    public String getHeadDoctorId(){
        return headDoctorId;
    }
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    public List<Doctor> getDoctors() {
        return doctors;
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
    public void assignDoctor(String doctorName) {

    }

    @Override
    public void assignNurse(String nursName) {

    }

    @Override
    public Boolean updateBedAvailability(int updatedBed) {
        return null;
    }
}
