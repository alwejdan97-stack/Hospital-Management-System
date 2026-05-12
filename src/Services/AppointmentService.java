package Services;

import Behaviour.Appointable;
import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.Appointment;
import Entity.Department;
import Entity.Doctor;
import Entity.Patient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class AppointmentService implements Manageable, Searchable, Appointable {
    public static List<Appointment> appointmentList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static Appointment appointment = new Appointment();
    public static Patient patient = new Patient();

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Appointment addAppointment() {
        System.out.println(" ** Adding new Appointment ** ");

        System.out.println("Enter Appointment ID: ");
        appointment.setAppointmentId(scanner.nextLine());
        System.out.println("Enter Appointment Date: ");
        LocalDate visitDate = LocalDate.parse(scanner.nextLine(), formatter);
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

    public Appointment createAppointment(String patientId, String doctorId, LocalDate date) {
        System.out.println("Enter Patient ID: ");
        patientId = scanner.nextLine();
        appointment.setPatientId(patientId);
        System.out.println("Enter Doctor ID: ");
        doctorId = scanner.nextLine();
        appointment.setDoctorId(doctorId);
        System.out.println("Enter Appointment Date: ");
        date = LocalDate.parse(scanner.nextLine(), formatter);
        appointment.setAppointmentDate(date);

        System.out.println("Appointment Add Successfully");
        return appointment;
    }

    public Appointment createAppointment(String patientId, String doctorId, LocalDate date, String time) {
        System.out.println("Enter Patient ID: ");
        patientId = scanner.nextLine();
        appointment.setPatientId(patientId);
        System.out.println("Enter Doctor ID: ");
        doctorId = scanner.nextLine();
        appointment.setDoctorId(doctorId);
        System.out.println("Enter Appointment Date: ");
        date = LocalDate.parse(scanner.nextLine(), formatter);
        appointment.setAppointmentDate(date);
        System.out.println("Enter Appointment Time: ");
        time = scanner.nextLine();
        appointment.setAppointmentTime(time);

        System.out.println("Appointment Add Successfully");
        return appointment;
    }

    public Appointment createAppointment(Appointment appointment) {
        appointmentList.add(appointment);

        System.out.println("Appointment Add Successfully");
        return appointment;
    }

    public List<Appointment> addAppointments() {
        Boolean continueFlag = true;
        while (continueFlag) {
            appointmentList.add(addAppointment());
            System.out.println("If want ot add more appointments press C");
            if (scanner.nextLine().equalsIgnoreCase("C")) {
                continueFlag = true;
            }
            continueFlag = false;
        }
        return appointmentList;
    }

    @Override
    public void scheduleAppointment(Appointment appointment) {
        if (appointment == null) {
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
            System.out.println("Appointment NOT found");
        }
    }

    public void rescheduleAppointment(String appointmentId, LocalDate newDate) {
        System.out.println("** Reschedule Appointment");
        displayAllAppointments();
        System.out.println("Enter Appointment ID: ");
        appointmentId = scanner.nextLine();
        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                System.out.println("Enter New Date: ");
                newDate = LocalDate.parse(scanner.nextLine(), formatter);
                a.setAppointmentDate(newDate);
                System.out.println("Appointment Reschedule Successfully");
                found = true;
            }
        }
    }

    public void rescheduleAppointment() {
        //displayAllAppointments();
        System.out.println("Enter Appointment ID");
        String ID = scanner.nextLine();
        Boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                System.out.println("Enter New Date");
                LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
                System.out.println("Enter new Time");
                String newTime = scanner.nextLine();
                System.out.println("Appointment ID: " + a.getAppointmentId() + " | Patient ID: " + a.getPatientId() + " | Doctor ID: " + a.getDoctorId() + " | Appointment Date: " + a.getAppointmentDate() + " | Time: " + a.getAppointmentTime());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Appointment NOT found");
        }
    }

    public void rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime) {
        System.out.println("** Reschedule Appointment");
        displayAllAppointments();
        System.out.println("Enter Appointment ID: ");
        appointmentId = scanner.nextLine();
        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                System.out.println("Enter New Date: ");
                newDate = LocalDate.parse(scanner.nextLine(), formatter);
                a.setAppointmentDate(newDate);
                System.out.println("Enter New Time: ");
                newTime = scanner.nextLine();
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
                System.out.println("Enter New Date: ");
                newDate = LocalDate.parse(scanner.nextLine(), formatter);
                a.setAppointmentDate(newDate);
                System.out.println("Enter New Time: ");
                newTime = scanner.nextLine();
                a.setAppointmentTime(newTime);
                System.out.println("Add Reason:");
                reason=scanner.nextLine();
                a.setReason(reason);

                System.out.println("Appointment Reschedule Successfully");
            }
        }

        public void updateAppointment () {
            displayAllAppointments();
            System.out.println("Enter Appointment ID");
            String ID = scanner.nextLine();
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equals(ID)) {
                    System.out.println("Enter New Appointment ID");
                    a.setAppointmentId(scanner.nextLine());
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
                System.out.println("If want ot update more Appointments press C");
                if (scanner.nextLine().equalsIgnoreCase("C")) {
                    continueFlag = false;
                }
            }
        }

        public void deleteAppointment () {
            displayAllAppointments();
            System.out.println("Enter Appointment ID");
            String ID = scanner.nextLine();
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                    appointmentList.remove(ID);
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
                System.out.println("If want ot delete more Appointments press C");
                if (scanner.nextLine().equalsIgnoreCase("C")) {
                    continueFlag = false;
                }
            }
        }

        public void getAppointmentByPatientId () {
            displayAllAppointments();
            System.out.println("Enter Patient ID");
            String ID = scanner.nextLine();
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equalsIgnoreCase(ID)) {
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
            System.out.println("Enter Doctor ID");
            String ID = scanner.nextLine();
            Boolean found = false;

            for (Appointment a : appointmentList) {
                if (a.getPatientId().equalsIgnoreCase(ID)) {
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
            System.out.println("Enter Appointment Date");
            LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
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
            System.out.println("Enter Appointment ID");
            String ID = scanner.nextLine();
            Boolean found = false;
            for (Appointment a : appointmentList) {
                if (a.getAppointmentId().equalsIgnoreCase(ID)) {
                    a.setStatus("Cancel");
                    System.out.println("Appointment Successfully canceled");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Appointment NOT found");
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
        public static void displayAppointments (LocalDate date){
            System.out.println("== Display Appointments By Date ==");
            System.out.println("Enter Appointment Date");
            date = LocalDate.parse(scanner.nextLine(), formatter);
        }
    }

    public void displayAppointments(String doctorId, LocalDate startDate, LocalDate endDate) {
        System.out.println("== Display Appointments By Multiple Fields ==");
        System.out.println("Enter Doctor ID: ");
        doctorId = scanner.nextLine();
        System.out.println("Enter Start Date: ");
        startDate = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.println("Enter End Date: ");
        endDate = LocalDate.parse(scanner.nextLine(), formatter);
        for(Appointment a:appointmentList){
            if(a.getDoctorId().equalsIgnoreCase(doctorId)){

            }
        }
    }

    public Boolean handelAppointmentService(Integer appointmentOption) {
        switch (appointmentOption) {
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
