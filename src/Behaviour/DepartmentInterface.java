package Behaviour;

public interface DepartmentInterface {
    void assignDoctor(String doctorName);
    void assignNurse(String nursName);
    Boolean updateBedAvailability(int updatedBed);
}
