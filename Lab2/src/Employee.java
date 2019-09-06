/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public abstract class Employee {
    private String firstName, lastName;
    private String sinNum;
    
    public Employee(String firstName, String lastName, String sinNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sinNum = sinNum;
    }
    
    public void setFirstName(String firstName){
        if(firstName.matches("[A-Z a-z_]+")){
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException ("First name must contain only alphabet characters!!");
        }  
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        if(lastName.matches("[A-Z a-z_]+")){
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException ("Last name must contain only alphabet characters!!");
        }  
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setSinNum(String sinNum){
        if(sinNum.matches("[- 0-9_]+")&& sinNum.length() ==11){
            this.sinNum = sinNum;
        }else{
            throw new IllegalArgumentException ("Social Insurance Number must contain only number and "
                    + "must have 9 digits!!");
        }
    }
    
    public String getSinNum(){
        return sinNum;
    }
    
    public abstract double getEarnings();
    
    
    @Override
    public String toString(){
        return "First Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nSocial Insurance Number: " + getSinNum();
    }
}
