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
    private String acctType;
    private double balance;
    private Customer customer; //calling Customer class as a variable in the Account class
    //data type: Customer
    
    public Account(String acctType, double balance, Customer customer){
        this.acctType = acctType;
        this.balance = balance;
        this.customer = customer;
    }
    
    public Account(){
        
    }
    
    public void setAcctType(String acctType){
        this.acctType = acctType;
    }
    
    public String getAcctType(){
        return acctType;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public double deposit(double depositAmount){
        if(depositAmount > 0){
            balance += depositAmount;
            System.out.println("You successfully deposit money! Your current account balance is: " + balance);
        }else{
            throw new IllegalArgumentException ("Deposit Amount must be positive!!!!");
        }
        return balance;
    }
    
    public double withdrawal(double withdrawalAmount){
        if(withdrawalAmount <= balance){
            balance = balance - withdrawalAmount;
            System.out.println("You successfully withdraw money! Your current account balance is: " + balance);
        }else{
            throw new IllegalArgumentException ("You do not have enough money to withdraw!!!!");
        }
        return balance;
    }
}
