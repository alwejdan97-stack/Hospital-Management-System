package Entity;

import Behaviour.Displayable;

public class GeneralPractitioner extends Doctor implements Displayable {
    private Boolean walkinAvailable;
    private Boolean homeVisitAvailable;
    private Boolean vaccinationCertified;

    public GeneralPractitioner(Boolean walkinAvailable, Boolean homeVisitAvailable, Boolean vaccinationCertified) {
        super();
        this.walkinAvailable = walkinAvailable;
        this.homeVisitAvailable = homeVisitAvailable;
        this.vaccinationCertified = vaccinationCertified;
    }

    public void setWalkinAvailable(Boolean walkinAvailable) {
        this.walkinAvailable = walkinAvailable;
    }

    public void setHomeVisitAvailable(Boolean homeVisitAvailable) {
        this.homeVisitAvailable = homeVisitAvailable;
    }

    public void setVaccinationCertified(Boolean vaccinationCertified) {
        this.vaccinationCertified = vaccinationCertified;
    }

    public Boolean getWalkinAvailable() {
        return walkinAvailable;
    }
    public Boolean getHomeVisitAvailable() {
        return homeVisitAvailable;
    }

    public Boolean getVaccinationCertified() {
        return vaccinationCertified;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Walk-in Available: "+walkinAvailable);
        System.out.println("Home Visit Available: "+homeVisitAvailable);
        System.out.println("Vaccination Certified: "+vaccinationCertified);
    }

    @Override
    public void displaySummary() {
        super.displaySummary();
        System.out.println(walkinAvailable+" | "+homeVisitAvailable);
    }

    public void scheduleHomeVisit(){
        if(homeVisitAvailable){
            System.out.println("Schedule Successful");
        }
    }
    public void administerVaccine(){
        if(vaccinationCertified){
            System.out.println("Vaccine Administrate Successful");
        }
    }
}
