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


}
