package Services;

import Behaviour.Appointable;
import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.Appointment;
import Entity.Patient;
import Utils.HelperUtils;
import Utils.InputHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService implements Manageable, Searchable, Appointable {
    public static List<Appointment> appointmentList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static Appointment appointment = new Appointment();
    public static Patient person = new Patient();

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Appointment addAppointment() {
        System.out.println(" ** Adding new Appointment ** ");

        String appointmentId= InputHandler.getStringInput("Enter Appointment ID: ");
        appointment.setAppointmentId(appointmentId);
        LocalDate visitDate= InputHandler.getDateInput("Enter Appointment Date: ");
        appointment.setAppointmentDate(visitDate);
        String appointmentTime= InputHandler.getStringInput("Enter Appointment Time: ");
        appointment.setAppointmentTime(appointmentTime);
        String patientId= InputHandler.getStringInput("Enter Patient ID: ");
        appointment.setPatientId(patientId);
        String doctorId= InputHandler.getStringInput("Enter Doctor ID: ");
        appointment.setDoctorId(doctorId);
        String reason= InputHandler.getStringInput("Enter Reason: ");
        appointment.setReason(reason);
        String note= InputHandler.getStringInput("Enter Notes");
        appointment.setNotes(note);


        System.out.println("Appointment Added Successfully");
        return appointment;
    }

    public Appointment addAppointment(String patientId, String doctorId, LocalDate date) {
        patientId= InputHandler.getStringInput("Enter Patient ID: ");
        appointment.setPatientId(patientId);
        doctorId= InputHandler.getStringInput("Enter Doctor ID: ");
        appointment.setDoctorId(doctorId);
        date= InputHandler.getDateInput("Enter Appointment Date: ");
        appointment.setAppointmentDate(date);

        System.out.println("Appointment Added Successfully");
        return appointment;
    }

    public Appointment addAppointment(String patientId, String doctorId, LocalDate date, String time) {
        patientId= InputHandler.getStringInput("Enter Patient ID: ");
        appointment.setPatientId(patientId);
        doctorId= InputHandler.getStringInput("Enter Doctor ID: ");
        appointment.setDoctorId(doctorId);
        date= InputHandler.getDateInput("Enter Appointment Date: ");
        appointment.setAppointmentDate(date);
        time= InputHandler.getStringInput("Enter Appointment Time: ");
        appointment.setAppointmentTime(time);

        System.out.println("Appointment Added Successfully");
        return appointment;
    }

    public Appointment addAppointment(Appointment appointment) {
        appointmentList.add(appointment);

        System.out.println("Appointment Added Successfully");
        return appointment;
    }

    public List<Appointment> addAppointments() {
        Boolean continueFlag = true;
        while (continueFlag) {
            appointmentList.add(addAppointment());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return appointmentList;
    }

    @Override
    public void scheduleAppointment(Appointment appointment) {
        if (HelperUtils.isNotNull(appointment)) {
            System.out.println("Invalid Appointment");
        }
        appointmentList.add(appointment);
    }

    @Override
    public void cancelAppointment(String appointmentId) {
        Boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                a.setStatus("Cancel");
                System.out.println("Appointment Successfully canceled");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT Found");
        }
    }

    public void rescheduleAppointment(String appointmentId, LocalDate newDate) {
        System.out.println("** Reschedule Appointment");
        displayAllAppointments();
        appointmentId=InputHandler.getStringInput("Enter Appointment ID: ");
        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                newDate=InputHandler.getDateInput("Enter New Date: ");
                a.setAppointmentDate(newDate);
                System.out.println("Appointment Reschedule Successfully");
                found = true;
            }
        }
    }

    public void rescheduleAppointment() {
        displayAllAppointments();
        String id=InputHandler.getStringInput("Enter Appointment ID: ");
        Boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(id)) {
                LocalDate newDate=InputHandler.getDateInput("Enter New Date: ");
                a.setAppointmentDate(newDate);
                String time= InputHandler.getStringInput("Enter Appointment Time: ");
                a.setAppointmentTime(time);
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT Found");
        }
    }

    public void rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime) {
        System.out.println("** Reschedule Appointment");
        displayAllAppointments();
        appointmentId=InputHandler.getStringInput("Enter Appointment ID: ");
        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                newDate=InputHandler.getDateInput("Enter New Date: ");
                a.setAppointmentDate(newDate);
                newTime= InputHandler.getStringInput("Enter Appointment Time: ");
                a.setAppointmentTime(newTime);
                System.out.println("Appointment Reschedule Successfully");
                found = true;
            }
        }
    }

    public void rescheduleAppointment(Appointment appointment, LocalDate newDate, String newTime, String reason){
            System.out.println("** Reschedule Appointment");
            appointmentList.add(appointment);
            for (Appointment a : appointmentList) {
                newDate=InputHandler.getDateInput("Enter New Date: ");
                a.setAppointmentDate(newDate);
                newTime= InputHandler.getStringInput("Enter Appointment Time: ");
                a.setAppointmentTime(newTime);
                reason= InputHandler.getStringInput("Enter Reason: ");
                a.setReason(reason);

                System.out.println("Appointment Reschedule Successfully");
            }
        }

        public void updateAppointment () {
            displayAllAppointments();
            String id=InputHandler.getStringInput("Enter Appointment ID");
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equals(id)) {
                    String newId=InputHandler.getStringInput("Enter New Appointment ID");
                    a.setAppointmentId(newId);
                    System.out.println("Appointment Updated Successfully");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT Found");
            }
            Boolean continueFlag = true;
            while (continueFlag) {
                System.out.println("Press E to exit OR press ENTER for more ");
                if(scanner.nextLine().equalsIgnoreCase("E")){
                    continueFlag=false;
                }
            }
        }

        public void deleteAppointment () {
            displayAllAppointments();
            String id=InputHandler.getStringInput("Enter Appointment ID");
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equalsIgnoreCase(id)) {
                    appointmentList.remove(id);
                    System.out.println("Appointment Removed Successful");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT Found");
            }
            Boolean continueFlag = true;
            while (continueFlag) {
                System.out.println("Press E to exit OR press ENTER for more ");
                if(scanner.nextLine().equalsIgnoreCase("E")){
                    continueFlag=false;
                }
            }
        }

        public void getAppointmentByPatientId () {
            displayAllAppointments();
            String id=InputHandler.getStringInput("Enter Patient ID");
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equalsIgnoreCase(id)) {
                    System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT found");
            }
        }

        public void getAppointmentByDoctorId () {
            displayAllAppointments();
            String id=InputHandler.getStringInput("Enter Doctor ID");
            Boolean found = false;

            for (Appointment a : appointmentList) {
                if (a.getPatientId().equalsIgnoreCase(id)) {
                    System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT found");
            }
        }

        public void getAppointmentByDate () {
            displayAllAppointments();
            LocalDate date=InputHandler.getDateInput("Enter Appointment Date");
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentDate().equals(date)) {
                    System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT found");
            }
        }


        public void cancelAppointment () {
            displayAllAppointments();
            String id=InputHandler.getStringInput("Enter Appointment ID");
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equalsIgnoreCase(id)) {
                    a.setStatus("Cancel");
                    System.out.println("Appointment Successfully canceled");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT found");
            }
        }

    public void completeAppointment () {
        displayAllAppointments();
        String id=InputHandler.getStringInput("Enter Appointment ID");
        Boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(id)) {
                a.setStatus("Complete");
                System.out.println("Appointment Completed");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT Found");
        }
    }

        public void displayAllAppointments () {
            if (appointmentList.isEmpty()) {
                System.out.println("NO Appointments In The List");
            }
            for (Appointment a : appointmentList) {
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime() + " | Notes: " + a.getNotes());
            }
        }
        public static void displayAppointments(LocalDate date){
            System.out.println("== Display Appointments By Date ==");
            date=InputHandler.getDateInput("Enter Appointment Date");
            for(Appointment a:appointmentList){
                if(a.getAppointmentDate().equals(date)){
                    System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime() + " | Notes: " + a.getNotes());
                }
            }
        }

        public void upcomingAppointment(){
        LocalDate today=LocalDate.now();
        boolean found=false;
        for(Appointment a:appointmentList){
            if(a.getAppointmentDate().isAfter(today) || a.getAppointmentDate().equals(today)){
                System.out.println(""+a.getAppointmentId());
                System.out.println(a.getPatientId());
                System.out.println(a.getDoctorId());
                System.out.println(a.getAppointmentDate());
                System.out.println(a.getAppointmentTime());
                System.out.println(a.getStatus());
            }
        }
        }

    public void displayAppointments(String doctorId, LocalDate startDate, LocalDate endDate) {
        System.out.println("== Display Appointments By Multiple Fields ==");
        doctorId=InputHandler.getStringInput("Enter Doctor ID: ");
        startDate=InputHandler.getDateInput("Enter Start Date: ");
        endDate=InputHandler.getDateInput("Enter End Date: ");
        for(Appointment a:appointmentList){
            if(a.getDoctorId().equalsIgnoreCase(doctorId)){
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime() + " | Notes: " + a.getNotes());
            }
        }
    }

    public Boolean handelAppointmentService(Integer appointmentOption) {
        switch (appointmentOption) {
            case 1 -> {
                System.out.println("== Schedule New Appointment ==");
                addAppointments();
            }

            case 2 -> {
                System.out.println("== View All Appointments ==");
                displayAllAppointments();
            }

            case 3 -> {
                System.out.println("== View Appointments by Patient ==");
                getAppointmentByPatientId();
            }

            case 4 -> {
                System.out.println("== View Appointments by Doctor ==");
                getAppointmentByDoctorId();
            }

            case 5 -> {
                System.out.println("== View Appointments by Date ==");
                getAppointmentByDate();
            }

            case 6 -> {
                System.out.println("== Reschedule Appointment ==");
                rescheduleAppointment();
            }

            case 7 -> {
                System.out.println("== Cancel Appointment ==");
                cancelAppointment();
            }
            case 8 -> {
                System.out.println("== Complete Appointment ==");
                completeAppointment();
            }

            case 9 ->{
                System.out.println("== View Upcoming Appointments ==");

            }

            case 10 -> {
                return false;
            }

            default -> {
                System.out.println("Invalid Option");
            }
        }
        return true;
    }

    @Override
    public void add(Object entity) {
        for (Appointment a : appointmentList) {
            appointmentList.add((Appointment) entity);
        }
    }

    @Override
    public void remove(String id) {
        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(id)) {
                appointmentList.remove(id);
                System.out.println("Appointment Removed Successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT Found");
        }
    }

    @Override
    public void getAll() {
        for (Appointment a : appointmentList) {
            System.out.println(a + " ");
        }
    }

    @Override
    public void search(String keyword) {
        for (Appointment a : appointmentList) {
            if (a.getDoctorId().equalsIgnoreCase(keyword) || a.getAppointmentId().equalsIgnoreCase(keyword) || a.getPatientId().equalsIgnoreCase(keyword)) {
                System.out.println("Appointment Exist");
            }
        }
        System.out.println("Appointment NOT Exist");
    }

    @Override
    public void searchById(String id) {
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(id)) {
                System.out.println("Appointment NOT Exist");
            }
        }
        System.out.println("Appointment NOT Exist");
    }
}
