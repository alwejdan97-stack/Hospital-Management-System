package Behaviour;

import Entity.Patient;

import java.util.UUID;

public interface DoctorInterface {
    Boolean assignPatient(Patient patient);
    Boolean removePatient(Patient patient);
    Boolean updateAvailability(UUID uuid,Patient updatedPatient);
}
