import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        String firstName, lastName, response, otherResponse;
        int mealCharge, entertainmentCharge, overNightCharge = 0;
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

            switch (response){
                case "y":
                    overNightCharge = 150;
                    break;
                case "n":
                    overNightCharge = 0;
                    break;
            }
            int totalCost = (mealCharge + entertainmentCharge + overNightCharge);
            System.out.println("Total cost of " + firstName + " " + lastName + " is $" + totalCost);

            System.out.println("Do you have another customer? (y/n)");
            otherResponse = i.next();
        } while (otherResponse.equalsIgnoreCase("y"));
    }
}
