/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String sinNum, double weeklySalary){
        super(firstName, lastName, sinNum);
        this.weeklySalary = weeklySalary;
    }
    
    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary >= 0.0){
            this.weeklySalary = weeklySalary;
        }else{
            throw new IllegalArgumentException ("Weekly Salary must greater than 0.0!!!");
        }
    }
    
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    @Override
    public double getEarnings(){
        return getWeeklySalary();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nWeekly Earnings: " + getEarnings();
    }
}
