/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */

public class Chequing extends Account{
    //Chequing is the sub class 
    //Account is the super class
    //Declaring only the required addition substances of sub class
    private double monthlyFees, overDraftLimit, overDraftCharges, overDraftInterest;
    private boolean overDraftActive;
    
/**
 * constructor with overdraft inactive
 * @param monthlyFees
 * @param overDraftLimit
 * @param overDraftCharges
 * @param overDraftInterest
 * @param acctType
 * @param balance
 * @param customer 
 */    
    public Chequing(double monthlyFees, double overDraftLimit, double overDraftCharges, double overDraftInterest
    , String acctType, double balance, Customer customer){
        super (acctType, balance, customer); //Invoking the super class
        this.monthlyFees = monthlyFees;
        this.overDraftLimit = overDraftLimit;
        this.overDraftCharges = overDraftCharges;
        this.overDraftInterest = overDraftInterest;
    }
    
/**
 * constructor with overdraft active
 * @param monthlyFees
 * @param overDraftLimit
 * @param overDraftCharges
 * @param overDraftInterest
 * @param overDraftActive
 * @param acctType
 * @param balance
 * @param customer 
 */    
    public Chequing(double monthlyFees, double overDraftLimit, double overDraftCharges, double overDraftInterest
    ,boolean overDraftActive, String acctType, double balance, Customer customer){
        super (acctType, balance, customer); //Invoking the super class
        this.monthlyFees = monthlyFees;
        this.overDraftLimit = overDraftLimit;
        this.overDraftCharges = overDraftCharges;
        this.overDraftInterest = overDraftInterest;
        this.overDraftActive = overDraftActive;
    }
    
    public void setMonthlyFees(double monthlyFees){
        this.monthlyFees = monthlyFees;
    }
    
    public double getMonthlyFees(){
        return monthlyFees;
    }
    
    public void setOverDraftLimit(double overDraftLimit)
    {
        this.overDraftLimit = overDraftLimit;
    }
    
    public double getOverDraftLimit(){
        return overDraftLimit;
    }
    
    public void setOverDraftCharges(double overDraftCharges){
        this.overDraftCharges = overDraftCharges;
    }
    
    public double getOverDraftCharges(){
        return overDraftCharges;
    }
    
    public void setOverDraftInterest(double overDraftInterest){
        this.overDraftInterest = overDraftInterest;
    }
    
    public double getOverDraftInterest(){
        return overDraftInterest;
    }
    
    public void setOverDraftActive(boolean overDraftActive){
        this.overDraftActive = overDraftActive;
    }
    
    public boolean getOverDraftActive(){
        return overDraftActive;
    }
    
    @Override
    public double deposit(double depositAmount){
        if(overDraftActive == true){
            if(depositAmount<0){
                throw new IllegalArgumentException ("Deposit Amount must be positive!!!!");
            }else{
                super.setBalance(super.getBalance() + depositAmount);
                System.out.println("Your current balance is: " + super.getBalance());
            }
        }else{
            if(depositAmount<0){
                throw new IllegalArgumentException ("Deposit Amount must be positive!!!!");
            }else{
                super.setBalance(super.getBalance() + depositAmount);
                System.out.println("You successfully deposit money! Your current balance is: " 
                        + super.getBalance());
            }
        }
        return super.getBalance();
    }
    
    @Override
    public double withdrawal(double withdrawalAmount){
        if(overDraftActive == true){
            if(withdrawalAmount <= super.getBalance()){
                super.setBalance(super.getBalance() - withdrawalAmount);
                System.out.println("You successfully withdraw money! Your current account balance is: "
                + super.getBalance());
            }else{
                super.setBalance((super.getBalance()+ overDraftLimit - withdrawalAmount)* -1);
                System.out.println("You successfully withdraw money! Your current account balance is: "
                + super.getBalance());
            }
        }else{
            if(withdrawalAmount <= super.getBalance()){
                super.setBalance(super.getBalance() - withdrawalAmount);
                System.out.println("You successfully withdraw money! Your current account balance is: "
                + super.getBalance());
            }else{
                System.out.println("You do not have enough money to withdraw!");
            }
        }
        return super.getBalance();
    }
}
