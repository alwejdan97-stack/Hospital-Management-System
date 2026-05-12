package Entity;

import java.util.List;

public class Consultant extends Doctor{
    private List<String> consultationTypes;
    private Boolean onlineConsultationAvailable;
    private int consultationDuration;

    public Consultant(List<String> consultationTypes, Boolean onlineConsultationAvailable, int consultationDuration) {
        super();
        this.consultationTypes = consultationTypes;
        this.onlineConsultationAvailable = onlineConsultationAvailable;
        this.consultationDuration = consultationDuration;
    }

    public void setConsultationTypes(List<String> consultationTypes) {
        this.consultationTypes = consultationTypes;
    }

    public void setOnlineConsultationAvailable(Boolean onlineConsultationAvailable) {
        this.onlineConsultationAvailable = onlineConsultationAvailable;
    }

    public void setConsultationDuration(int consultationDuration) {
        this.consultationDuration = consultationDuration;
    }

    public List<String> getConsultationTypes() {
        return consultationTypes;
    }

    public Boolean getOnlineConsultationAvailable() {
        return onlineConsultationAvailable;
    }

    public int getConsultationDuration() {
        return consultationDuration;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Consultation Type: "+consultationTypes);
        System.out.println("Online Consultation Available: "+onlineConsultationAvailable);
        System.out.println("Consultation Duration: "+consultationDuration);

    }
    public void scheduleConsultation(){}
    public void provideSecondOpinion(){}
}
