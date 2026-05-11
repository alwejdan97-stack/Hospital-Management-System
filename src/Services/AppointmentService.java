package Services;

import Entity.Appointment;
import Entity.MedicalRecord;
import Entity.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    public List<Appointment> appointmentList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    Appointment appointment=new Appointment();
    public Patient patient=new Patient();
}
