/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String sinNum,
            double commissionRate, double grossSale, double baseSalary){
        super(firstName, lastName, sinNum, commissionRate, grossSale);
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary){
        if(baseSalary > 0.0){
            this.baseSalary = baseSalary;
        }else{
            throw new IllegalArgumentException("Base salary must be greater than 0.0!!");
        }
    }
    
    public double getBaseSalary(){
        return baseSalary + baseSalary * 0.1;
    }
    
    @Override
    public double getEarnings(){
        return getBaseSalary() + super.getEarnings();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBase Salary: " + getBaseSalary()+
                "\nEarnings: " + getEarnings();
    }
}
