package Entity;

import java.time.LocalDate;

public class OutPatient extends Patient{
    private int visitCount;
    private LocalDate lastVisitDate;
    private String preferredDoctorId;

    public OutPatient(int visitCount, LocalDate lastVisitDate, String preferredDoctorId) {
        super();
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
        this.preferredDoctorId = preferredDoctorId;
    }
}
