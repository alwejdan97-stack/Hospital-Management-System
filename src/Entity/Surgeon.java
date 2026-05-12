package Entity;

import Behaviour.Displayable;

import java.util.List;

public class Surgeon extends Doctor implements Displayable {
    private int surgeriesPerformed;
    private List<String> surgeryTypes;
    private Boolean operationTheatreAccess;

    public Surgeon(int surgeriesPerformed, List<String> surgeryTypes, Boolean operationTheatreAccess) {
        super();
        this.surgeriesPerformed = surgeriesPerformed;
        this.surgeryTypes = surgeryTypes;
        this.operationTheatreAccess = operationTheatreAccess;
    }

    public void setSurgeriesPerformed(int surgeriesPerformed) {
        this.surgeriesPerformed = surgeriesPerformed;
    }

    public void setSurgeryTypes(List<String> surgeryTypes) {
        this.surgeryTypes = surgeryTypes;
    }

    public void setOperationTheatreAccess(Boolean operationTheatreAccess) {
        this.operationTheatreAccess = operationTheatreAccess;
    }

    public int getSurgeriesPerformed() {
        return surgeriesPerformed;
    }

    public List<String> getSurgeryTypes() {
        return surgeryTypes;
    }

    public Boolean getOperationTheatreAccess() {
        return operationTheatreAccess;
    }

    public void performSurgery(){}
    public void updateSurgeryCount(String newSurgery){
        updateSurgeryCount(newSurgery);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Surgeries Performed: "+surgeriesPerformed);
        System.out.println("Surgery Type: "+surgeryTypes);
        System.out.println("Operation Theater Access: "+operationTheatreAccess);
    }
    @Override
    public void displaySummary() {
        super.displaySummary();
        System.out.println(surgeryTypes+" "+surgeriesPerformed);
    }
}