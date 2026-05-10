package Entity;

import Behaviour.AppointmentInterface;

import java.time.LocalDate;

public class Appointment implements AppointmentInterface {
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
    public void setAppointmentTime(String appointmentTime){
        this.appointmentTime=appointmentTime;
    }
    public String getAppointmentTime(){
        return appointmentTime;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return status;
    }
    public void setReason(String reason){
        this.reason=reason;
    }
    public String getReason(){
        return reason;
    }
    public void setNotes(String notes){
        this.notes=notes;
    }
    public String getNotes(){
        return notes;
    }

    @Override
    public Boolean reschedule(Appointment appointment) {
        return null;
    }

    @Override
    public Boolean cancel(Appointment appointment) {
        return null;
    }

    @Override
    public Boolean complete(Appointment appointmentComplete) {
        return null;
    }
}
