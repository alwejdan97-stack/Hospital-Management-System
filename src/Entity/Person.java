package Entity;

import java.time.LocalDate;

public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return  firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return "Person{"+"id: "+id+" | firstName: "+firstName+" | lastName: "+lastName+" | dateOfBirth: "+dateOfBirth+" | gender: "+gender+" | phoneNumber: "+phoneNumber+" | email: "+email+" | address: "+address;
    }
    @Override
    public Boolean equals(){
        return true;
    }

    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public void displayInfo(){

    }

}
