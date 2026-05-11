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
}
