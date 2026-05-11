package Services;

import Entity.MedicalRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordService {
    public List<MedicalRecord> medicalRecordList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    MedicalRecord medicalRecord=new MedicalRecord();

    public MedicalRecord addRecord(){
        System.out.println(" ** Adding new Record ** ");

        System.out.println("Enter Medical Record ID: ");
        medicalRecord.setRecordId(scanner.nextLine());
        System.out.println("Enter Doctor ID: ");
        medicalRecord.setDoctorId(scanner.nextLine());
        System.out.println("Enter Patient ID: ");
        medicalRecord.setPatientId(scanner.nextLine());
        System.out.println("Enter Diagnosis: ");
        medicalRecord.setDiagnosis(scanner.nextLine());
        System.out.println("Enter Prescription: ");
        medicalRecord.setPrescription(scanner.nextLine());
        System.out.println("Enter Visit Date: ");
        medicalRecord.setVisitDate();
        System.out.println("Enter Test Result:");
        medicalRecord.setTestResults(scanner.nextLine());
        System.out.println("Enter Notes: ");
        medicalRecord.setNotes(scanner.nextLine());

        System.out.println("Record Add Successfully");
        return medicalRecord;
    }

    public List<MedicalRecord> addRecords(){

    }

    public void updateRecord(){}

    public void deleteRecord(){}

    public void getRecordsByPatientId(){}

    public void getRecordsByDoctorId(){}

    public void displayPatientHistory(){}

    public void displayAllRecords(){}

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
