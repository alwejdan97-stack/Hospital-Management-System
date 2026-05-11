package Services;

import Entity.Appointment;
import Entity.MedicalRecord;
import Entity.Patient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    public List<Appointment> appointmentList=new ArrayList<>();
    public static Scanner scanner=new Scanner(System.in);
    Appointment appointment=new Appointment();
    public Patient patient=new Patient();

    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Appointment addAppointment(){
        System.out.println(" ** Adding new Appointment ** ");

        System.out.println("Enter Appointment ID: ");
        appointment.setAppointmentId(scanner.nextLine());
        System.out.println("Enter Appointment Date: ");
        LocalDate visitDate=LocalDate.parse(scanner.nextLine(),formatter);
        appointment.setAppointmentDate(visitDate);
        System.out.println("Enter Appointment Time: ");
        appointment.setAppointmentTime(scanner.nextLine());
        System.out.println("Enter Patient ID: ");
        appointment.setPatientId(scanner.nextLine());
        System.out.println("Enter Doctor ID: ");
        appointment.setDoctorId(scanner.nextLine());
        System.out.println("Enter Reason: ");
        appointment.setReason(scanner.nextLine());
        System.out.println("Enter Notes");
        appointment.setNotes(scanner.nextLine());


        System.out.println("Appointment Add Successfully");
        return appointment;
    }

    public List<Appointment> addAppointments(){
        Boolean continueFlag = true;
        while (continueFlag) {
            appointmentList.add(addAppointment());
            System.out.println("If want ot add more appointments press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=true;
            }
            continueFlag=false;
        }
        return appointmentList;
    }

    public void updateAppointment(){
        displayAllAppointments();
        System.out.println("Enter Appointment ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Appointment a:appointmentList){
            if(a.getAppointmentId().equals(ID)){
                System.out.println("Enter New Appointment ID");
                a.setAppointmentId(scanner.nextLine());
                System.out.println("Appointment Updated Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Appointment NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot update more Appointments press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }

    public void deleteAppointment(){
        displayAllAppointments();
        System.out.println("Enter Appointment ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Appointment a:appointmentList){
            if(a.getAppointmentId().equalsIgnoreCase(ID)){
                appointmentList.remove(ID);
                System.out.println("Appointment Removed Successful");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Appointment NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("If want ot delete more Appointments press C");
            if(scanner.nextLine().equalsIgnoreCase("C")){
                continueFlag=false;
            }
        }
    }

    public void getAppointmentByPatientId(){
        displayAllAppointments();
        System.out.println("Enter Patient ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Appointment a:appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT found");
        }
    }

    public void getAppointmentByDoctorId(){
        displayAllAppointments();
        System.out.println("Enter Doctor ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Appointment a:appointmentList) {
            if (a.getPatientId().equalsIgnoreCase(ID)) {
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT found");
        }
    }

    public void getAppointmentByDate(){
        displayAllAppointments();
        System.out.println("Enter Appointment Date");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Appointment a:appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT found");
        }
    }

    public void rescheduleAppointment(){
        displayAllAppointments();
        System.out.println("Enter Appointment ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Appointment a:appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                System.out.println("Enter New Date");
                LocalDate date=LocalDate.parse(scanner.nextLine(),formatter);
                System.out.println("Enter new Time");
                String newTime=scanner.nextLine();
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT found");
        }
    }

    public void cancelAppointment(){
        displayAllAppointments();
        System.out.println("Enter Appointment ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Appointment a:appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                a.setStatus("Cancel");
                System.out.println("Appointment Successfully canceled");
                found=true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT found");
        }
    }
    public void displayAllAppointments(){
        if(appointmentList.isEmpty()){
            System.out.println("NO Appointments In The List");
        }
        for(Appointment a:appointmentList){
            System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime()+" | Notes: "+a.getNotes());
        }
    }

    public Boolean handelAppointmentService(Integer appointmentOption){
        switch (appointmentOption){
            case 1 -> {
                System.out.println("== Add New Appointment ==");
                addAppointments();
            }
            case 2 -> {
                System.out.println("== Update Appointment ==");
                updateAppointment();
            }

            case 3 -> {
                System.out.println("== Show Appointments ==");
                displayAllAppointments();
            }

            case 4 -> {
                System.out.println("== Show Appointments Using Patient ID ==");
                getAppointmentByPatientId();
            }

            case 5 -> {
                System.out.println("== Show Appointments Using Doctor ID ==");
                getAppointmentByDoctorId();
            }

            case 6 -> {
                System.out.println("== Show Appointments Using Appointment Date ==");
                getAppointmentByDate();
            }

            case 7 -> {
                System.out.println("== Delete Appointments ==");
                deleteAppointment();
            }

            case 8 -> {
                System.out.println("== Reschedule Appointment ==");
                rescheduleAppointment();
            }

            case 9 -> {
                System.out.println("== Cancel Appointment ==");
                cancelAppointment();
            }

            case 10 ->
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
