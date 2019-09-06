package assignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class Account {
    private String firstName, lastName;
    private double balance;
    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    
    public void setfirstName(String firstName){
        if(firstName.matches("[a-z A-Z_]+")){
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getfirstName(){
        return firstName;
    }
    
    public void setlastName(String lastName){
        if(lastName.matches("[a-z A-Z_]+")){
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException ("Please enter the alphabets only!!!!");
        }
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    @Override
    public String toString(){
        return "FirstName:" + getfirstName() + " LastName:" + getlastName() + " Balance:" 
                + getBalance();
    }
    
    public void deposit(double amountOfMoney){
        if(amountOfMoney > 0){
        balance += amountOfMoney;
        }else{
            throw new IllegalArgumentException("Deposit amount can not be negative");
        }
    }
}
