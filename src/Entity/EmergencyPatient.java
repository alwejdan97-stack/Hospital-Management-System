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
}
