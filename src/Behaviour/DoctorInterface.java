package Behaviour;

import Entity.Patient;

import java.util.List;
import java.util.UUID;

public interface DoctorInterface {
    void assignPatient(String patient);
    void removePatient(String patient);
    void updateAvailability(List<String> avilability);
}
