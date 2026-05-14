package Entity;

import Behaviour.Displayable;

import java.time.LocalDate;

public class OutPatient extends Patient implements Displayable {
    private int visitCount;
    private LocalDate lastVisitDate;
    private String preferredDoctorId;

    public OutPatient(int visitCount, LocalDate lastVisitDate, String preferredDoctorId) {
        super();
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
        this.preferredDoctorId = preferredDoctorId;
    }

    public OutPatient() {
        super();
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
        this.preferredDoctorId = preferredDoctorId;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public void setPreferredDoctorId(String preferredDoctorId) {
        this.preferredDoctorId = preferredDoctorId;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public String getPreferredDoctorId() {
        return preferredDoctorId;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Visit Count: "+visitCount);
        System.out.println("Last Visit Date: "+lastVisitDate);
        System.out.println("Preferred Doctor ID: "+preferredDoctorId);

    }
    @Override
    public void displaySummary(){
        super.displaySummary();
        System.out.println(visitCount+" | "+lastVisitDate+" | "+preferredDoctorId);

    }
    public void scheduleFollowUp(){}
    public void updateVisitCount(){
        visitCount++;
        lastVisitDate=LocalDate.now();
    }


}
