/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class HourlyEmployee extends Employee {
    private double wagePerHour, hours;
    
    public HourlyEmployee(String firstName, String lastName, String sinNum, double wagePerHour, double hours){
        super(firstName, lastName, sinNum);
        this.wagePerHour = wagePerHour;
        this.hours = hours;
    }
    
    public void setWagePerHour(double wagePerHour){
        if(wagePerHour > 0.0){
            this.wagePerHour = wagePerHour;
        }else{
            throw new IllegalArgumentException("Hourly wage must be greater than 0.0!!");
        }
    }
    
    public double getWagePerHour(){
        return wagePerHour;
    }
    
    public void setHours(double hours){
        if(hours > 0.0){
            this.hours = hours;
        }else{
            throw new IllegalArgumentException("Hours worked must be greater than 0.0!!!");
        }
    }
    
    public double getHours(){
        return hours;
    }
    
    @Override
    public double getEarnings(){
        double earnings;
        if(getHours()<40){
            earnings = getHours() * getWagePerHour();
        }else{
            earnings = 40 * getWagePerHour() + (getHours() - 40)* getWagePerHour()*1.5;
        }
        return earnings;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nWage per hour: " + getWagePerHour() +
                "\nHours worked: " + getHours()+
                "\nEarnings: " + getEarnings();
    }
    
}
