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
