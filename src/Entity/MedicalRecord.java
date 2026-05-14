package Entity;

import Behaviour.Displayable;

import java.time.LocalDate;

public class MedicalRecord implements Displayable{
    private String recordId;
    private String patientId;
    private String doctorId;
    private LocalDate visitDate;
    private String diagnosis;
    private String prescription;
    private String testResults;
    private String notes;

    public MedicalRecord() {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.recordId = recordId;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.testResults = testResults;
        this.notes = notes;
    }

    public MedicalRecord(String recordId, String patientId, LocalDate visitDate, String diagnosis, String doctorId, String testResults, String prescription, String notes) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.doctorId = doctorId;
        this.testResults = testResults;
        this.prescription = prescription;
        this.notes = notes;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setDoctorId(String stringId) {
        this.doctorId = doctorId;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public String getTestResults() {
        return testResults;
    }

    @Override
    public void displayInfo(){
        System.out.println("Record ID: "+recordId);
        System.out.println("Doctor ID: "+ doctorId);
        System.out.println("Patient ID: "+patientId);
        System.out.println("Prescription: "+prescription);
        System.out.println("Visit Date: "+visitDate);
        System.out.println("Diagnosis: "+diagnosis);
        System.out.println("Notes: "+notes);
        System.out.println("Test Result: "+testResults);

    }

    @Override
    public void displaySummary() {
        System.out.println(recordId+" | "+patientId);
    }
}
