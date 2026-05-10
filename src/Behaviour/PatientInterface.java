package Behaviour;

import java.util.UUID;

public interface PatientInterface {
    void addMedicalRecord(String record);
    void addAppointment(String appointment);
    void updateInsurance(String newInsurance);
}
