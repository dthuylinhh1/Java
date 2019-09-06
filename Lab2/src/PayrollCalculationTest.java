/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh
 */
public class PayrollCalculationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create subclass object
        SalariedEmployee emp1 = new SalariedEmployee("Linh", "Dao", "111-111-111", 560.0);
        HourlyEmployee emp2 = new HourlyEmployee("Thuong", "Tran", "222-222-222", 23.5, 45);
        CommissionEmployee emp3 = new CommissionEmployee("Hoa", "Le", "333-333-333", 0.2, 980.5);
        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee("Nguyen", "Do", "444-444-444", 0.3, 875.75, 500);
        
        System.out.println("Employee Information!");
        System.out.println("------------------------");
        System.out.println(emp1);
        System.out.println("------------------------");
        System.out.println(emp2);
        System.out.println("------------------------");
        System.out.println(emp3);
        System.out.println("------------------------");
        System.out.println(emp4);
        
    }
    
}
