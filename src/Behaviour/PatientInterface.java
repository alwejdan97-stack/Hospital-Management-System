package Behaviour;

import Entity.String;

public interface PatientInterface {
    void addMedicalRecord(java.lang.String record);
    void addAppointment(java.lang.String appointment);
    void updateInsurance(java.lang.String newInsurance);

    void addMedicalRecord(String record);

    void addAppointment(String appointment);

    void updateInsurance(String insuranceId);
}
