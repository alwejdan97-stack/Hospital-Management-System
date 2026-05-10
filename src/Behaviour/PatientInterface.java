package Behaviour;

import java.util.UUID;

public interface PatientInterface {
    void addMedicalRecord();
    Boolean addAppointment();
    Boolean updateInsurance(UUID id, String insurance);
}
