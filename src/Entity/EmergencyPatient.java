package Entity;

public class EmergencyPatient extends Patient {
    private String emergencyType;
    private String arrivalMode;
    private int triageLevel;
    private  Boolean admittedViaER;

    public EmergencyPatient(String emergencyType, String arrivalMode, int triageLevel, Boolean admittedViaER) {
        super();
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
}
