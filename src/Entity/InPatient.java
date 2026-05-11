package Entity;

import java.time.LocalDate;

public class InPatient extends Patient {
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String roomNumber;
    private String bedNumber;
    private String admittingDoctorId;
    private Double dailyCharges;

    public InPatient(LocalDate admissionDate, LocalDate dischargeDate, String roomNumber, String bedNumber, String admittingDoctorId, Double dailyCharges) {
        super();
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.admittingDoctorId = admittingDoctorId;
        this.dailyCharges = dailyCharges;
    }
}
