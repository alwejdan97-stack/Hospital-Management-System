package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.MedicalRecord;
import Entity.Patient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordService implements Manageable, Searchable {
    public List<MedicalRecord> medicalRecordList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    MedicalRecord medicalRecord=new MedicalRecord();
    public Patient patient=new Patient();

    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");

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
        LocalDate visitDate=LocalDate.parse(scanner.nextLine(),formatter);
        medicalRecord.setVisitDate(visitDate);
        System.out.println("Enter Test Result:");
        medicalRecord.setTestResults(scanner.nextLine());
        System.out.println("Enter Notes: ");
        medicalRecord.setNotes(scanner.nextLine());

        System.out.println("Record Add Successfully");
        return medicalRecord;
    }

    public List<MedicalRecord> addRecords(){
        Boolean continueFlag = true;
        while (continueFlag) {
            medicalRecordList.add(addRecord());
            System.out.println("If want ot add more records press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=true;
            }
            continueFlag=false;
        }
        return medicalRecordList;
    }

    public void updateRecord(){
        displayAllRecords();
        System.out.println("Enter Record ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equals(ID)){
                System.out.println("Enter New Record ID");
                m.setRecordId(scanner.nextLine());
                System.out.println("Record Updated Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Record NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot update more Records press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }

    public void deleteRecord(){
        displayAllRecords();
        System.out.println("Enter Record ID");
        java.lang.String ID=scanner.nextLine();
        Boolean found=false;
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equals(ID)){
                medicalRecordList.remove(ID);
                System.out.println("Record Removed Successful");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Record NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot delete more Records press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }

    public void getRecordsByPatientId(){
        displayAllRecords();
        System.out.println("Enter Patient ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(MedicalRecord m: medicalRecordList) {
            if (m.getPatientId().equals(ID)) {
                System.out.println("Record ID: " + m.getRecordId() + " | Patient ID: " + m.getPatientId() + " | Doctor ID: " + m.getDoctorId() + " | Diagnosis: " + m.getDiagnosis() + " | Prescription: " + m.getPrescription() + " | Visit Date: " + m.getVisitDate());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Record NOT found");
        }
    }

    public void getRecordsByDoctorId(){
        System.out.println("Enter Doctor ID");
        java.lang.String ID=scanner.nextLine();
        Boolean found = false;
        for(MedicalRecord m: medicalRecordList) {
            if (m.getPatientId().equals(ID)) {
                System.out.println("Record ID: " + m.getRecordId() + " | Patient ID: " + m.getPatientId() + " | Doctor ID: " + m.getDoctorId() + " | Diagnosis: " + m.getDiagnosis() + " | Prescription: " + m.getPrescription() + " | Visit Date: " + m.getVisitDate());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Record NOT found");
        }
    }

    public void displayPatientHistory(){
        displayAllRecords();
        System.out.println("Enter Patient ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(MedicalRecord m: medicalRecordList) {
            if (m.getPatientId().equals(ID)) {
                System.out.println("Record ID: " +m.getRecordId() + patient.getFirstName()+" " +patient.getLastName()+ " | Patient ID: " + m.getPatientId() + " | Date of Birth: " + patient.getDateOfBirth() + " | Diagnosis: " + m.getDiagnosis() + " | Prescription: " + m.getPrescription() + " | Visit Date: " + m.getVisitDate());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Record NOT found");
        }
    }

    public void displayAllRecords(){
        if(medicalRecordList.isEmpty()){
            System.out.println("NO Record in the List");
        }
        for(MedicalRecord m: medicalRecordList) {
            System.out.println("Record ID: "+m.getRecordId()+" | Patient ID: "+m.getPatientId()+" | Doctor ID: "+m.getDoctorId()+" | Diagnosis: "+m.getDiagnosis()+" | Prescription: "+m.getPrescription()+" | Visit Date: "+m.getVisitDate());
        }
    }

    public Boolean handelMedicalRecordService(Integer medicalRecordOption){
        switch (medicalRecordOption){
            case 1 -> {
                System.out.println("== Add New Medical Record ==");
                addRecords();
            }
            case 2 -> {
                System.out.println("== Update Medical Record ==");
                updateRecord();
            }

            case 3 -> {
                System.out.println("== Show Medical Records ==");
                displayAllRecords();
            }

            case 4 -> {
                System.out.println("== Show Medical Records Using Patient ID ==");
                getRecordsByPatientId();
            }

            case 5 -> {
                System.out.println("== Show Medical Records Using Doctor ID ==");
                getRecordsByDoctorId();
            }

            case 6 -> {
                System.out.println("== Delete Medical Record ==");
                deleteRecord();
            }

            case 7 -> {
                System.out.println("== Display Patient History ==");
                displayPatientHistory();
            }

            case 8 ->
            {
                return false;
            }

            default ->{
                System.out.println("Invalid Option");
            }
        }
        return true;
    }

    @Override
    public void add(Object entity) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void getAll() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public void searchById(String id) {

    }
}
