package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.MedicalRecord;
import Entity.Nurse;
import Entity.Patient;
import Utils.InputHandler;

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

        String recordId= InputHandler.getStringInput("Enter Record ID: ");
        medicalRecord.setRecordId(recordId);
        String doctorId= InputHandler.getStringInput("Enter Doctor ID: ");
        medicalRecord.setDoctorId(doctorId);
        String patientId= InputHandler.getStringInput("Enter Patient ID: ");
        medicalRecord.setPatientId(patientId);
        String diagnosis= InputHandler.getStringInput("Enter Diagnosis: ");
        medicalRecord.setDiagnosis(diagnosis);
        String prescription= InputHandler.getStringInput("Enter Prescription: ");
        medicalRecord.setPrescription(prescription);
        LocalDate visitDate= InputHandler.getDateInput("Enter Visit Date: ");
        medicalRecord.setVisitDate(visitDate);
        String testResults= InputHandler.getStringInput("Enter Test Result:");
        medicalRecord.setTestResults(testResults);
        String notes= InputHandler.getStringInput("Enter Notes: ");
        medicalRecord.setNotes(notes);

        System.out.println("Record Add Successfully");
        return medicalRecord;
    }

    public List<MedicalRecord> addRecords(){
        Boolean continueFlag = true;
        while (continueFlag) {
            medicalRecordList.add(addRecord());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return medicalRecordList;
    }

    public void updateRecord(){
        displayAllRecords();
        String id= InputHandler.getStringInput("Enter Record ID: ");
        Boolean found=false;
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equals(id)){
                String newRecordId= InputHandler.getStringInput("Enter New Record ID");
                m.setRecordId(newRecordId);
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
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }

    public void deleteRecord(){
        displayAllRecords();
        String id= InputHandler.getStringInput("Enter Record ID: ");
        Boolean found=false;
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equals(id)){
                medicalRecordList.remove(id);
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
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }

    public void getRecordsByPatientId(){
        displayAllRecords();
        String id= InputHandler.getStringInput("Enter Patient ID");
        Boolean found = false;
        for(MedicalRecord m: medicalRecordList) {
            if (m.getPatientId().equals(id)) {
                System.out.println("Record ID: " + m.getRecordId() + " | Patient ID: " + m.getPatientId() + " | Doctor ID: " + m.getDoctorId() + " | Diagnosis: " + m.getDiagnosis() + " | Prescription: " + m.getPrescription() + " | Visit Date: " + m.getVisitDate());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Record NOT Found");
        }
    }

    public void getRecordsByDoctorId(){
        String id= InputHandler.getStringInput("Enter Doctor ID");
        Boolean found = false;
        for(MedicalRecord m: medicalRecordList) {
            if (m.getPatientId().equals(id)) {
                System.out.println("Record ID: " + m.getRecordId() + " | Patient ID: " + m.getPatientId() + " | Doctor ID: " + m.getDoctorId() + " | Diagnosis: " + m.getDiagnosis() + " | Prescription: " + m.getPrescription() + " | Visit Date: " + m.getVisitDate());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Record NOT Found");
        }
    }

    public void displayPatientHistory(){
        //displayAllRecords();
        String id= InputHandler.getStringInput("Enter Patient ID");

        Boolean found = false;
        for(MedicalRecord m: medicalRecordList) {
            if (m.getPatientId().equals(id)) {
                System.out.println("Record ID: " +m.getRecordId() + patient.getFirstName()+" " +patient.getLastName()+ " | Patient ID: " + m.getPatientId() + " | Date of Birth: " + patient.getDateOfBirth() + " | Diagnosis: " + m.getDiagnosis() + " | Prescription: " + m.getPrescription() + " | Visit Date: " + m.getVisitDate());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Record NOT Found");
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
                System.out.println("== Create Medical Record ==");
                addRecords();
            }

            case 2 -> {
                System.out.println("== View All Records ==");
                displayAllRecords();
            }

            case 3 -> {
                System.out.println("== View Records by Patient ==");
                getRecordsByPatientId();
            }

            case 4 -> {
                System.out.println("== View Records by Doctor ==");
                getRecordsByDoctorId();
            }

            case 5 -> {
                System.out.println("== Update Medical Record ==");
                updateRecord();
            }

            case 6 -> {
                System.out.println("== Delete Medical Record ==");
                deleteRecord();
            }

            case 7 -> {
                System.out.println("== Generate Patient History Report ==");
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
        if(entity instanceof MedicalRecordService){
            medicalRecordList.add((MedicalRecord) entity);
        }
    }

    @Override
    public void remove(String id) {
        boolean found=false;
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equalsIgnoreCase(id)){
                medicalRecordList.remove(id);
                System.out.println("Medical Record Removed Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Medical Record NOT Found");
        }
    }

    @Override
    public void getAll() {
        for (MedicalRecord m: medicalRecordList){
            System.out.println(m+" ");
        }
    }

    @Override
    public void search(String keyword) {
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equalsIgnoreCase(keyword)||m.getPatientId().equalsIgnoreCase(keyword)||m.getDoctorId().equalsIgnoreCase(keyword)||m.getVisitDate().equals(keyword)){
                System.out.println("Medical Record Exist");
            }
        }
        System.out.println("Medical Record NOT Exist");
    }

    @Override
    public void searchById(String id) {
        for(MedicalRecord m:medicalRecordList){
            if(m.getRecordId().equalsIgnoreCase(id)){
                System.out.println("Medical Record NOT Exist");
            }
        }
        System.out.println("Medical Record NOT Exist");
    }
}
