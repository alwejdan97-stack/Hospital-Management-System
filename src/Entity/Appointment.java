package Entity;

import Behaviour.AppointmentInterface;

import java.time.LocalDate;
import java.util.Scanner;

public class Appointment implements AppointmentInterface {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String status;
    private String reason;
    private String notes;

    public Scanner scanner=new Scanner(System.in);
    public Appointment(String appointmentId, String patientId, String doctorId, LocalDate appointmentDate, String appointmentTime, String status, String notes, String reason) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.notes = notes;
        this.reason = reason;
    }

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

    public void displayInfo(){
        System.out.println("Appointment ID: "+appointmentId);
        System.out.println("Patient ID: "+patientId);
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Appointment Date: "+appointmentDate);
        System.out.println("Appointment Time: "+appointmentTime);
        System.out.println("Status: "+status);
        System.out.println("Reason:"+reason);
        System.out.println("Notes: "+notes);
    }

    @Override
    public void reschedule(LocalDate newDate, String newTime) {
        setAppointmentDate(newDate);
        setAppointmentTime(newTime);
    }

    @Override
    public void cancel(String status) {
        setStatus(status);
    }

    @Override
    public void complete(String status) {
        setStatus(status);
    }
}
