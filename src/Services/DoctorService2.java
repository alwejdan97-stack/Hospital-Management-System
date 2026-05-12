package Services;

import Entity.Doctor;
import Entity.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorService2 {
    public Doctor doctor=new Doctor();
    public List<Doctor> doctorList=new ArrayList<>();
    public Patient patient=new Patient();
    public Scanner scanner=new Scanner(System.in);
    public List<Patient>  patientList=new ArrayList<>();

    public Doctor addDoctor(String name, String specialization, String phone){
        doctor.setFirstName(name);
        doctor.setLastName(name);
        doctor.setSpecialization(specialization);
        doctor.setPhoneNumber(phone);

        System.out.println("Doctor added successfully");
        return doctor;
    }
    public Doctor addDoctor(String name, String specialization, String phone, double consultationFee){
        doctor.setFirstName(name);
        doctor.setLastName(name);
        doctor.setSpecialization(specialization);
        doctor.setPhoneNumber(phone);
        doctor.setConsultationFee(consultationFee);

        System.out.println("Doctor added successfully");
        return doctor;
    }
    public List<Doctor> addDoctor(Doctor doctor){
        doctorList.add(doctor);

        System.out.println("Doctor added successfully");
        return doctorList;
    }
    public void PaassignPatient(String doctorId, String patientId){
        System.out.println(doctorList+" ");
        System.out.println("Enter doctor ID");
        doctorId=scanner.nextLine();
        Boolean found=false;
        for(Doctor d: doctorList) {
            if (d.getDoctorId().equalsIgnoreCase(doctorId)) {
                System.out.println("Enter Patient ID");
                d.setAssignedPatients(scanner.nextLine());
                System.out.println("Patient Successfully assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Doctor ID NOT found");
        }
    }
    public void assignPatient(Doctor doctor, Patient patient){
        doctorList.add(doctor);
        doctor.setAssignedPatients(patientList.add(patient));
                System.out.println("Patient Successfully assign");

    }
    public void  assignPatient(String doctorId, List<String> patientIds) {
        System.out.println(doctorList+" ");
        System.out.println("Enter doctor ID");
        doctorId=scanner.nextLine();
        Boolean found=false;
        for(Doctor d: doctorList) {
            if (d.getDoctorId().equalsIgnoreCase(doctorId)) {
                System.out.println("Enter Patient ID");
                patientIds.add(scanner.nextLine());
                d.setAssignedPatients(patientIds);
                System.out.println("Patient Successfully assign");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Doctor ID NOT found");
        }
    }
    public void displayDoctors(){}
    public void displayDoctors(String specialization){}
    public void displayDoctors(String departmentId, boolean showAvailableOnly){}

}
