package Behaviour;

import java.util.UUID;

public interface PatientInterface {
    void addMedicalRecord();
    void  addAppointment();
    void updateInsurance(UUID id, String insurance);
}
