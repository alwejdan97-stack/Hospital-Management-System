package Services;

import Entity.Appointment;
import Entity.Department;
import Entity.Doctor;
import Entity.Patient;
import Utils.InputHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReportAndStatisticsService {
    public List<Doctor> doctorList=new ArrayList<>();
    public List<Department> departmentList=new ArrayList<>();
    public List<Patient> patientList=new ArrayList<>();
    public List<Appointment> appointmentList=new ArrayList<>();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public void dailyAppointmentReport(){
        System.out.println("*** Daily Appointments Report ***");
        LocalDate date= InputHandler.getDateInput("Enter Date");
        int count=0;
        for(Appointment a:appointmentList){
            if(a.getAppointmentDate().equals(date)){
                System.out.println("Appointment ID: "+a.getAppointmentId());
                System.out.println("Patient ID: "+a.getPatientId());
                System.out.println("Doctor ID: "+a.getDoctorId());
                System.out.println("Status: "+a.getStatus());
                System.out.println("Notes: "+a.getNotes());

                count++;
            }
        }
        System.out.println("Total Appointments is: "+count);
    }

    public void doctorPerformanceReport(){
        System.out.println("*** Doctor Performance Report ***");

        for(Doctor d:doctorList){
            int count=0;
            for(Appointment a:appointmentList){
                if(a.getDoctorId().equalsIgnoreCase(d.getDoctorId())){
                    count++;
                }
            }
            System.out.println("Doctor ID: "+d.getDoctorId());
            System.out.println("Doctor Name: "+d.getFirstName()+" "+d.getLastName());
            System.out.println("Doctor Specialization"+d.getSpecialization());
            System.out.println("Total Of Handling Appointment: "+count);
        }
    }

    public void departmentOccupancyReport(){
        System.out.println("*** Department Occupancy Report ***");
        for(Department d:departmentList){
            int count=0;
            for(Patient p:patientList){
                if(p.getDepartmentId.equalsIgnoreCase(d.getDepartmentId())){
                    count++;
                }
            }
            System.out.println("Department ID: "+d.getDepartmentId());
            System.out.println("Department Name: "+d.getDepartmentName());
            System.out.println("Total Patients: "+count);
        }
    }

    public void patientStatistics(){
        System.out.println("*** Patient Statistics ***");
        int malePatientCount=0;
        int femalePatientCount=0;
        for(Patient p:patientList){
            if(p.getGender().equalsIgnoreCase("Male")){
                malePatientCount++;
            }else if(p.getGender().equalsIgnoreCase("Female")){
                femalePatientCount++;
            }
        }
        System.out.println("Total Patients: "+patientList.size());
        System.out.println("Male Patient: "+malePatientCount);
        System.out.println("Female Patients: "+femalePatientCount);
    }

    public void emergencyCaseReport(){
        System.out.println("*** Emergency Cases Report ***");
        int count=0;
        for(Patient p:patientList){
            if(p.getGender().equalsIgnoreCase("Emergency")){
                System.out.println("Patient ID: "+p.getPatientId());
                System.out.println("Patient Name: "+p.getFirstName()+" "+p.getLastName());
                System.out.println("Patient Gender: "+p.getGender());
                System.out.println("Date Of Birth: "+p.getDateOfBirth());
                System.out.println("Phone Number: "+p.getPhoneNumber());

                count++;
            }
        }
        System.out.println("Total Emergency Case: "+count);
    }

    public Boolean handelReportService(Integer reportOption){
        switch (reportOption){
            case 1 ->{
                System.out.println("== Daily Appointments Report ==");
            }

            case 2 ->{
                System.out.println("== Doctor Performance Report ==");
            }

            case 3 ->{
                System.out.println("== Department Occupancy Report ==");
            }

            case 4 ->{
                System.out.println("== Patient Statistics ==");
            }

            case 5 ->{
                System.out.println("== Emergency Cases Report ==");
            }

            case 6 ->{
                return false;
            }

            default -> {
                System.out.println("Invalid Option");
            }
        }
    }
}
