package Entity;

import Behaviour.AppointmentInterface;
import Behaviour.Displayable;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appointment implements Displayable {
    private String appointmentId;
    private String patientId;
    private String stringId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String status;
    private String reason;
    private String notes;
    private String addedBy;
    private LocalDateTime timestamp;

    public Appointment() {
        super();
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.stringId = stringId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.reason = reason;
        this.addedBy = addedBy;
        this.notes = notes;
        this.timestamp = timestamp;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setDoctorId(String stringId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return stringId;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public void displayInfo() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor ID: " + stringId);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println("Status: " + status);
        System.out.println("Reason:" + reason);
        System.out.println("Notes: " + notes);
    }

    @Override
    public void displaySummary() {
        System.out.println(appointmentId + " | " + patientId + " | " + appointmentDate);
    }

    public void reschedule(LocalDate newDate, String newTime) {
        setAppointmentDate(newDate);
        setAppointmentTime(newTime);
    }

    public void cancel(String status) {
        setStatus(status);
    }

    public void complete(String status) {
        setStatus(status);
    }

    public void addNotes(String notes) {
        this.notes = notes;
    }

    public void addNotes(String notes, String addedBy) {
        this.notes = notes;
        this.addedBy = addedBy;
    }

    public void addNotes(String notes, String addedBy, LocalDateTime timestamp) {
        this.notes = notes;
        this.addedBy = addedBy;
        this.timestamp = timestamp;
    }
}
