package Services;

import Entity.MedicalRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordService {
    public List<MedicalRecord> medicalRecordList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    MedicalRecord medicalRecord=new MedicalRecord();

    public MedicalRecord createRecord(){}

    public List<MedicalRecord> addRecords(){}

    public void updateRecord(){}

    public void deleteRecord(){}

    public void getRecordsByPatientId(){}

    public void getRecordsByDoctorId(){}

    public void displayPatientHistory(){}

    public Boolean handelMedicalRecordService(Integer medicalRecordOption){
        switch (medicalRecordOption){
            case 1 -> {
                System.out.println("== Add New Patient ==");
                addPatients();
            }
            case 2 -> {
                System.out.println("== Update Patient ==");
                editPatient();
            }

            case 3 -> {
                System.out.println("== Show Patients ==");
                displayAllPatients();
            }

            case 4 -> {
                System.out.println("== Show SPECIFIC Patient Using ID ==");
                getPatientById();
            }

            case 5 -> {
                System.out.println("== Delete Patient ==");
                removePatient();
            }

            case 6 -> {
                System.out.println("== Search For a Patient ==");
                searchPatientsByName();
            }

            case 7 ->
            {
                return false;
            }

            default ->{
                System.out.println("Invalid Option");
            }
        }
        return true;
    }
}
