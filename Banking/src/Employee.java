/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class Employee {
    private String firstName, lastName, address;
    private int employeeNo, phNumber, sinNumber;
    private double hours;
    public Employee(){
        
    }
    
    public Employee(String firstName, String lastName, String address, int employeeNo, int phNumber, 
            int sinNumber, double hours){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.employeeNo = employeeNo;
        this.phNumber = phNumber;
        this.sinNumber = sinNumber;
        this.hours = hours;
    }
    
    public void setFirstName(String firstName){
        if(firstName.matches("[a-z A-Z_]+")){
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        if(lastName.matches("[a-z A-Z_]+")){
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setAddress(String address){
        if(address.matches("[a-z A-Z 0-9_]+")){
            this.address = address;
        }else{
            throw new IllegalArgumentException ("Please enter valid address!");
        }
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setEmployeeNo(int employeeNo){
        if(Integer.toString(employeeNo).matches("[0-9_]+")){
            this.employeeNo = employeeNo;
        }else{
            throw new IllegalArgumentException ("Please enter valid employee number!");
        }
    }
    
    public int getEmployeeNo(){
        return employeeNo;
    }
    
    public void setPhNumber(int phNumber){
        if(Integer.toString(phNumber).matches("[0-9_]+") && Integer.toString(phNumber).length() ==10){
            this.phNumber = phNumber;
        }else{
            throw new IllegalArgumentException ("Please enter valid phone number!");
        }
    }
    
    public int getPhNumber(){
        return phNumber;
    }
    
    public void setSinNumber(int sinNumber){
        if(Integer.toString(sinNumber).matches("[0-9_]+") && Integer.toString(sinNumber).length()==9){
            this.sinNumber = sinNumber;
        }else{
            throw new IllegalArgumentException ("Please enter valid social insurance number!");
        }
    }
    
    public int getSinNumber(){
        return sinNumber;
    }
    
    public void setHours(double hours){
        this.hours = hours;
    }
    
    public double getHours(){
        return hours;
    }
    
//    public double getEarnings(){
//        if(hours <=40){ //no overtime working
//            earnings = wage * hours;
//        }else{
//            earnings = 40 * wage + (hours - 40)*1.5; //*1.5 rate for overtime
//        }
//        return earnings;
//    }
    
    @Override
    public String toString(){
        return "First Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nEmployeeNo: " + getEmployeeNo() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhNumber() +
                "\nSocial Insurance Number: " + getSinNumber();
                
    }
}
