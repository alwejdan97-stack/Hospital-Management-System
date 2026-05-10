package Behaviour;

import Entity.Patient;

import java.util.UUID;

public interface DoctorInterface {
    void assignPatient();
    void removePatient();
    void updateAvailability();
}
