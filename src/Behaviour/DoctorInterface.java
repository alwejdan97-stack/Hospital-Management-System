package Behaviour;

import Entity.Patient;

import java.util.List;
import java.util.UUID;

public interface DoctorInterface {
    void assignPatient(Patient patient);
    void removePatient(Patient patient);
    void updateAvailability(List<String> avilability);
}
