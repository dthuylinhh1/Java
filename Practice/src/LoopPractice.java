import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args){
        String firstName, lastName, response, otherResponse;
        int mealCharge, entertainmentCharge, overNightCharge;
        Scanner i = new Scanner(System.in);

        do {
            System.out.println("Enter your First Name:");
            firstName = i.next();

            System.out.println("Enter your Last Name:");
            lastName = i.next();

            System.out.println("Enter your Meal Charge: ");
            mealCharge = i.nextInt();

            System.out.println("Enter your Entertainment Charge: ");
            entertainmentCharge = i.nextInt();

            System.out.println("Do you want to stay over night? (y/n)");
            response = i.next();

            if(response.equalsIgnoreCase("y")){
                overNightCharge = 150;
            }else{
                overNightCharge = 0;
            }

            int totalCost = (mealCharge + entertainmentCharge + overNightCharge);
            System.out.println("Total cost of " + firstName + " " + lastName + " is $" + totalCost);

            System.out.println("Do you have another customer? (y/n)");
            otherResponse = i.next();

        }while(otherResponse.equalsIgnoreCase("y"));

    }
}
