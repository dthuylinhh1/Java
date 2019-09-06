/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Customer {
    private String clientFirstName, clientLastName, streetName, province, postalCode, address, streetNum, phNumber;
    private LocalDate dateOfBirth;
    
    public Customer(){
    }
    
    public Customer(String clientFirstName, String clientLastName, String streetNum, String streetName,
            String province, String postalCode,LocalDate dateOfBirth, String phNumber){
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.province = province;
        this.postalCode = postalCode;
        this.dateOfBirth = dateOfBirth;
        this.phNumber = phNumber;
    }
    
    public boolean isEmployed(){
        Scanner in = new Scanner(System.in);
        System.out.println("Are you currently an employee?");
        String answer = in.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
            return true;
        }else{
            return false;
        }
    }
    
    public void setClientFirstName(String clientFirstName){
        if(clientFirstName.matches("[a-z A-Z_]+")){
            this.clientFirstName = clientFirstName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getClientFirstName(){
        return clientFirstName;
    }
    
    public void setClientLastName(String clientLastName){
        if(clientLastName.matches("[a-z A-Z_]+")){
            this.clientLastName = clientLastName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getClientLastName(){
        return clientLastName;
    }
    
    public void setStreetNum(String streetNum){
        if(streetNum.matches("[a-z A-Z 0-9_]+")){
            this.streetNum = streetNum;
        }else{
            throw new IllegalArgumentException ("Please enter valid street number!!!!");
        }
    }
    
    public String getStreetNum(){
        return streetNum;
    }
    
    public void setStreetName(String streetName){
        if(streetName.matches("[a-z A-Z_]+")){
            this.streetName = streetName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getStreetName(){
        return streetName;
    }
    
    public void setProvine(String province){
        if(province.matches("[a-z A-Z_]+") && province.length()==2){
            this.province = province;
        }else{
            throw new IllegalArgumentException ("Please enter valid province!!!!");
        }
    }
    
    public String getProvince(){
        return province;
    }
    
    public void setPostalCode(String postalCode){
        if(postalCode.matches("[a-z A-Z 0-9_]+")&& postalCode.length()==6){
            this.postalCode = postalCode;
        }else{
            throw new IllegalArgumentException ("Please enter valid postal code!!!!");
        }
    }
    
    public String getPostalCode(){
        return postalCode;
    }
    
    public void setPhNumber(String phNumber){
        if(phNumber.matches("[0-9_]+") && phNumber.length()==9){
            this.phNumber = phNumber;
        }else{
            throw new IllegalArgumentException ("Please enter valid phone number!!!!");
        }
    }
    
    public String getPhNumber(){
        return phNumber;
    }
    
    public void setDateOfBirt(LocalDate dateOfBirth){
        if(dateOfBirth.toString().matches("[- 0-9_]+")){
            this.dateOfBirth = dateOfBirth;
            
        }else{
            throw new IllegalArgumentException ("Please enter valid date of birth!!!!");
        }
    }
    
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    
    public String getAddress(){
        address = getStreetNum() + getStreetName() + getProvince() + getPostalCode();
        return address;
    }
    
    public void twoStepVerification(){
        Scanner in = new Scanner(System.in);
        System.out.println("Step1: Please enter your SIN number:");
        String sin = in.next();
        while(sin.matches("[0-9_]+") == false && sin.length()!=9){
            System.out.println("Please enter your SIN number again!!!!");
            sin = in.next();
        }
        System.out.println("Your SIN number is correct!!");
        System.out.println("Step2: Please enter your secret code");
        String code = in.next();
        while(code.matches("[0-9_]+") == false && code.length()!=4){
            System.out.println("Please enter your secret code again!!!!");
            code = in.next();
        }
        System.out.println("You are successfully verified!!!!");
    }
    
    @Override
    public String toString(){
        return "First Name: " + getClientFirstName() + "\nLast Name: " + getClientLastName() + 
                "\nAddress: " + getAddress() + "\nPhone Number: " + getPhNumber() +
                "\nDate of Birth: " + getDateOfBirth();
    }
}
