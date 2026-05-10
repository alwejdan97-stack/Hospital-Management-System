package Behaviour;

import Entity.Patient;

import java.util.UUID;

public interface DoctorInterface {
    Boolean assignPatient(String patient);
    Boolean removePatient(String patient);
    Boolean updateAvailability(UUID uuid,Patient updatedPatient);
}
