package Entity;

import Behaviour.Displayable;

import java.time.LocalDate;
import java.util.List;

public class EmergencyPatient extends Patient implements Displayable {
    private String emergencyType;
    private String arrivalMode;
    private int triageLevel;
    private  Boolean admittedViaER;

    public EmergencyPatient() {
        super();
        this.emergencyType = emergencyType;
        this.arrivalMode = arrivalMode;
        this.triageLevel = triageLevel;
        this.admittedViaER = admittedViaER;
    }

    public EmergencyPatient(String patientId, String bloodGroup, String departmentId, String caseType, List<String> allergies, String emergencyContact, String insuranceId, LocalDate registrationDate, List<String> medicalRecords, List<String> appointments, String emergencyType, String arrivalMode, int triageLevel, Boolean admittedViaER) {
        super(patientId, bloodGroup, departmentId, caseType, allergies, emergencyContact, insuranceId, registrationDate, medicalRecords, appointments);
        this.emergencyType = emergencyType;
        this.arrivalMode = arrivalMode;
        this.triageLevel = triageLevel;
        this.admittedViaER = admittedViaER;
    }

    public EmergencyPatient(String emergencyType, String arrivalMode, int triageLevel, Boolean admittedViaER) {
        this.emergencyType = emergencyType;
        this.arrivalMode = arrivalMode;
        this.triageLevel = triageLevel;
        this.admittedViaER = admittedViaER;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public void setArrivalMode(String arrivalMode) {
        this.arrivalMode = arrivalMode;
    }

    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    public void setAdmittedViaER(Boolean admittedViaER) {
        this.admittedViaER = admittedViaER;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public String getArrivalMode() {
        return arrivalMode;
    }

    public int getTriageLevel() {
        return triageLevel;
    }

    public Boolean getAdmittedViaER() {
        return admittedViaER;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Emergency Type: "+emergencyType);
        System.out.println("Arrival Mode: "+arrivalMode);
        System.out.println("Triage Level: "+triageLevel);
        System.out.println("Admitted Via ER: "+admittedViaER);
    }

    @Override
    public void displaySummary(){
        super.displaySummary();
        System.out.println(emergencyType+" | "+arrivalMode);
    }
}
