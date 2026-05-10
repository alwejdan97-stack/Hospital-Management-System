package Entity;

import java.time.LocalDate;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String status;
    private String reason;
    private String notes;

    public void setAppointmentId(String appointmentId){
        this.appointmentId=appointmentId;
    }
    public String getAppointmentId(){
        return appointmentId;
    }
    public void setPatientId(String patientId){
        this.patientId=patientId;
    }
    public String getPatientId(){
        return patientId;
    }
    public void setDoctorId(String doctorId){
        this.patientId=patientId;
    }
    public String getDoctorId(){
        return doctorId;
    }
    public void setAppointmentDate(LocalDate appointmentDate){
        this.appointmentDate=appointmentDate;
    }
    public LocalDate getAppointmentDate(){
        return appointmentDate;
    }

}
