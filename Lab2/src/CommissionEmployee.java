/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class CommissionEmployee extends Employee{
    private double commissionRate, grossSale;
    
    public CommissionEmployee(String firstName, String lastName, String sinNum, double commissionRate, 
            double grossSale){
        super(firstName, lastName, sinNum);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }
    
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 0.0 && commissionRate < 1.0){
            this.commissionRate = commissionRate;
        }else{
            throw new IllegalArgumentException ("Commission rate must be greater than 0.0 and less than 1.0!!");
        }
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public void setGrossSale(double grossSale){
        if(grossSale > 0.0){
            this.grossSale = grossSale;
        }else{
            throw new IllegalArgumentException("Gross sale must be greater than 0.0!!");
        }
    }
    
    public double getGrossSale(){
        return grossSale;
    }
    
    @Override
    public double getEarnings(){
        return getGrossSale() * getCommissionRate();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nGross Sale: " + getGrossSale()+
                "\nCommission Rate: " + getCommissionRate()
                ;
    }
}
