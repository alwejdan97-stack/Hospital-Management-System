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

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public void setAdmittingDoctorId(String admittingDoctorId) {
        this.admittingDoctorId = admittingDoctorId;
    }

    public void setDailyCharges(Double dailyCharges) {
        this.dailyCharges = dailyCharges;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public Double getDailyCharges() {
        return dailyCharges;
    }

    public String getAdmittingDoctorId() {
        return admittingDoctorId;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Admission Date: "+admissionDate);
        System.out.println("Discharge Date: "+dischargeDate);
        System.out.println("Room Number: "+roomNumber);
        System.out.println("Bed Number: "+bedNumber);
        System.out.println("Admitting Doctor ID: "+admittingDoctorId);
        System.out.println("Daily Charges: "+dailyCharges);
    }

    public void calculateStayDuration(){}
    public void calculateTotalCharges(){}

}
