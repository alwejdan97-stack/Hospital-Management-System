package Entity;

public class GeneralPractitioner extends Doctor {
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

}
