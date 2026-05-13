package Utils;

public class MenuMessage {
    public static String MAIN_MENU_MESSAGE = """
            ==== Hospital Management System ====
            1. Patient Management
            2. Doctor Management
            3. Nurse Management
            4. Appointment Management
            5. Medical Records Management
            6. Department Management
            7. Reports and Statistics
            8. Exit
            """;
    public static String PATIENT_MENU_MESSAGE = """
            1.1 Register New Patient
            1.2 Register InPatient
            1.3 Register OutPatient
            1.4 Register Emergency Patient
            1.5 View All Patients
            1.6 Search Patient
            1.7 Update Patient Information
            1.8 Remove Patient
            1.9 View Patient Medical History
            """;

    public static String DOCTOR_MENU_MESSAGE = """
            2.1 Add Doctor
            2.2 Add Surgeon
            2.3 Add Consultant
            2.4 Add General Practitioner
            2.5 View All Doctors
            2.6 Search Doctor by Specialization
            2.7 View Available Doctors
            2.8 Assign Patient to Doctor
            2.9 Update Doctor Information
            2.10 Remove Doctor
            """;
    public static String NURSE_MENU_MESSAGE = """
            1- Add New Nurse
            2- Update Nurse
            3- Show Nurses
            4- Show SPECIFIC Nurse Using ID
            5- Show SPECIFIC Nurse Using Department ID
            6- SShow SPECIFIC Nurse Using Shift
            7- Delete Nurse
            8- Search For Nurse
            9- Go Back to Main Menu
            """;
    public static String DEPARTMENT_MENU_MESSAGE = """
            1- Add New Department
            2- Update Department
            3- Show Departments
            4- Show Departments Using Department ID
            5- Delete Department
            6- Assign Doctors To Departments
            7- Go Back to Main Menu
            """;
    public static String APPOINTMENT_MENU_MESSAGE = """
            1- Add New Appointment
            2- Update Appointment
            3- Show Appointments
            4- Show Appointments Using Patient ID
            5- Show Appointments Using Doctor ID
            6- Show Appointments Using Appointment Date
            7- Delete Appointments
            8- Reschedule Appointment
            9-Cancel Appointment
            10- Go Back to Main Menu
            """;
    public static String MEDICAL_SERVICE_MENU_MESSAGE = """
            1- Add New Medical Record
            2- Update Medical Record
            3- Show Medical Records
            4- how Medical Records Using Patient ID
            5- Show Medical Records Using Doctor ID
            6- Delete Medical Record
            7- Display Patient History
            8- Go Back to Main Menu
            """;
}
