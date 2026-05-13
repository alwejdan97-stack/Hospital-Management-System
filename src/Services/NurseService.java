package Services;

import Behaviour.Manageable;
import Behaviour.Searchable;
import Entity.Nurse;
import Entity.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NurseService implements Manageable, Searchable {
    public static List<Nurse> nurseList=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    public Nurse nurse=new Nurse();

    public Nurse addNurse(){
        System.out.println(" ** Adding new Nurse ** ");

        System.out.println("Enter First Name: ");
        nurse.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name: ");
        nurse.setLastName(scanner.nextLine());
        System.out.println("Enter ID: ");
        nurse.setNurseId(scanner.nextLine());
        System.out.println("Enter Date Of Birth: ");
        nurse.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Address: ");
        nurse.setAddress(scanner.nextLine());
        System.out.println("Enter Email: ");
        nurse.setGender(scanner.nextLine());
        System.out.println("Enter Phone Number:");
        nurse.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Qualification:");
        nurse.setQualification(scanner.nextLine());
        System.out.println("Enter Gender: ");
        nurse.setGender(scanner.nextLine());
        System.out.println("Enter Shift: ");
        nurse.setShift(scanner.nextLine());
        System.out.println("Assign Patient:");
        nurse.assignedPatient(scanner.nextLine());
        System.out.println("Enter Department ID: ");
        nurse.setDepartmentId(scanner.nextLine());

        System.out.println("Nurse Add Successfully");
        return nurse;
    }
    public List<Nurse> addNurses(){
        Boolean continueFlag = true;
        while (continueFlag) {
            nurseList.add(addNurse());
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
        return nurseList;
    }
    public void editNurse(){
        displayAllNurses();
        System.out.println("Enter Nurse ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(ID)){
                System.out.println("Enter New Name");
                n.setFirstName(scanner.nextLine());
                System.out.println("Nurse Updated Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Nurse NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }
    public void removeNurse(){
        displayAllNurses();
        System.out.println("Enter Nurse ID");
        String ID=scanner.nextLine();
        Boolean found=false;
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(ID)){
                nurseList.remove(ID);
                System.out.println("Nurse Removed Successful");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Nurse NOT Found");
        }
        Boolean continueFlag = true;
        while (continueFlag){
            System.out.println("Press E to exit OR press ENTER for more ");
            if(scanner.nextLine().equalsIgnoreCase("E")){
                continueFlag=false;
            }
        }
    }
    public void getNurseById(){
        displayAllNurses();
        System.out.println("Enter Nurse ID");
        String ID=scanner.nextLine();
        Boolean found = false;
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(ID)){
                System.out.println("Nurse Name: "+n.getFirstName()+" "+n.getLastName());
                System.out.println("Nurse ID: "+n.getNurseId());
                System.out.println("Nurse Birthday: "+n.getDateOfBirth());
                System.out.println("Nurse Phone Number: "+n.getPhoneNumber());
                System.out.println("Nurse Address: "+n.getAddress());
                System.out.println("Nurse Department ID:"+n.getDepartmentId());
                System.out.println("Nurse Shift: "+n.getShift());
                System.out.println("Nurse Assign Patients: "+n.getAssignedPatients());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Nurse NOT found");
        }
    }

    public void getNursesByDepartment(){
        displayAllNurses();
        System.out.println("Enter Nurse Department");
        String department=scanner.nextLine();
        Boolean found = false;
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(department)){
                System.out.println("Nurse Name: "+n.getFirstName()+" "+n.getLastName());
                System.out.println("Nurse ID: "+n.getNurseId());
                System.out.println("Nurse Birthday: "+n.getDateOfBirth());
                System.out.println("Nurse Phone Number: "+n.getPhoneNumber());
                System.out.println("Nurse Address: "+n.getAddress());
                System.out.println("Nurse Department ID:"+n.getDepartmentId());
                System.out.println("Nurse Shift: "+n.getShift());
                System.out.println("Nurse Assign Patients: "+n.getAssignedPatients());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Nurse NOT found");
        }
    }

    public void getNursesByShift(){
        displayAllNurses();
        System.out.println("Enter Nurse Shift");
        String shift=scanner.nextLine();
        Boolean found = false;
        for(Nurse n:nurseList){
            if(n.getShift().equalsIgnoreCase(shift)){
                System.out.println("Nurse Name: "+n.getFirstName()+" "+n.getLastName());
                System.out.println("Nurse ID: "+n.getNurseId());
                System.out.println("Nurse Birthday: "+n.getDateOfBirth());
                System.out.println("Nurse Phone Number: "+n.getPhoneNumber());
                System.out.println("Nurse Address: "+n.getAddress());
                System.out.println("Nurse Department ID:"+n.getDepartmentId());
                System.out.println("Nurse Shift: "+n.getShift());
                System.out.println("Nurse Assign Patients: "+n.getAssignedPatients());
                found=true;
            }
        }
        if (!found) {
            System.out.println("Nurse NOT found");
        }
    }

    public static void displayAllNurses(){
        if(nurseList.isEmpty()){
            System.out.println("NO Nurse in the List");
        }
        for(Nurse n: nurseList) {
            System.out.println("Doctor Name: " + n.getFirstName() + " " + n.getLastName()+" | Doctor ID: "+n.getNurseId()+" | Department ID: "+ n.getDepartmentId()+ " | Shift: "+n.getShift());
        }
    }

    public Nurse searchNurseByName(){
        displayAllNurses();
        System.out.println("Enter Nurse Name");
        String name=scanner.nextLine();
        Boolean found = false;
        for(Nurse n: nurseList){
            if(n.getFirstName().equalsIgnoreCase(name)){
                System.out.println("Nurse Name: "+n.getFirstName()+" "+n.getLastName()+" is found");
                found=true;
            }
        }
        if (!found) {
            System.out.println("Nurse NOT found");
        }
        return nurse;
    }

    public Boolean handelNurseService(Integer nurseOption){
        switch (nurseOption){
            case 1 -> {
                System.out.println("== Add Nurse ==");
                addNurses();
            }

            case 2 -> {
                System.out.println("== View All Nurses ==");
                displayAllNurses();
            }

            case 3 -> {
                System.out.println("== View Nurses by Department ==");
                getNursesByDepartment();
            }
            case 4 -> {
                System.out.println("== View Nurses by Shift ==");
                getNursesByShift();
            }

            case 5 -> {
                System.out.println("== Assign Nurse to Patient ==");
                nurse.getAssignedPatients();
            }

            case 6 -> {
                System.out.println("== Update Nurse Information ==");
                editNurse();
            }

            case 7 -> {
                System.out.println("== Remove Nurse ==");
                removeNurse();
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
        if(entity instanceof Nurse){
            nurseList.add((Nurse) entity);
        }
    }

    @Override
    public void remove(String id) {
        boolean found=false;
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(id)){
                nurseList.remove(id);
                System.out.println("Nurse Removed Successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Nurse NOT Found");
        }
    }

    @Override
    public void getAll() {
        for (Nurse n: nurseList){
            System.out.println(n+" ");
        }
    }

    @Override
    public void search(String keyword) {
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(keyword)||n.getFirstName().equalsIgnoreCase(keyword)||n.getLastName().equalsIgnoreCase(keyword)||n.getPhoneNumber().equalsIgnoreCase(keyword)){
                System.out.println("Nurse Exist");
            }
        }
        System.out.println("Nurse NOT Exist");
    }

    @Override
    public void searchById(String id) {
        for(Nurse n:nurseList){
            if(n.getNurseId().equalsIgnoreCase(id)){
                System.out.println("Nurse Exist");
            }
        }
        System.out.println("Nurse NOT Exist");
    }
}
