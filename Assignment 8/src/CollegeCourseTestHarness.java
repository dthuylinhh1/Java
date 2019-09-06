import java.util.Scanner;

public class CollegeCourseTestHarness {
    public static void main(String[] args){
        //Create a two dimensional array with 10 columns and 200 rows.
        int count = 1000000;
        CollegeCourse [][] myArray = new CollegeCourse[200][10];
        Scanner in = new Scanner(System.in);
        int [] referenceList = {12345, 23456, 34567, 45678, 56789};
        int itemCounter = 0;
        for(int i = 0; i < 10; i++){
            for(int x = 1; x < 101; x++) {
                myArray[x][i] = new CollegeCourse();
                System.out.println("Cell number " + x);
                myArray[x][i].setCourseNumber(0);
                myArray[x][i].setCourseReferenceNumber(0);
                System.out.println("Course reference number: " + myArray[x][i].getCourseReferenceNumber());
                System.out.println("Course number " + myArray[x][i].getCourseNumber());
                System.out.println("---------------------------------------------");
            }
            for(int x = 101; x < 200; x++){
                myArray[x][i] = new CollegeCourse();
                System.out.println("Cell number " + x);
                myArray[x][i].setCourseNumber(9999);
                myArray[x][i].setCourseReferenceNumber(9999);
                System.out.println("Course reference number: " + myArray[x][i].getCourseReferenceNumber());
                System.out.println("Course number " + myArray[x][i].getCourseNumber());
                System.out.println("---------------------------------------------");
            }
        }
        System.out.println("Do you want to keep continue? (yes/no)");
        String response = in.next();

        while(response.equalsIgnoreCase("yes")){
            for(int i = 0; i < 10; i++){
                for(int x = 0; x < 200; x++){
                    myArray[x][i] = new CollegeCourse();
                    System.out.println("Cell number " + x);
                    itemCounter = (itemCounter + 1)%4;
                    myArray[x][i].setCourseReferenceNumber(count++);
                    myArray[x][i].setCourseNumber(referenceList[itemCounter]);
                    System.out.println("Course reference number: " + myArray[x][i].getCourseReferenceNumber());
                    System.out.println("Course number " + myArray[x][i].getCourseNumber());
                    System.out.println("---------------------------------------------");
                }
            }
            System.out.println("Do you want to run the loop again? (yes/no)");
            response = in.next();
        }


        try{
            System.out.println("Please insert the first index: ");
            int indexOne = in.nextInt();
            System.out.println("Please insert the second index: ");
            int indexTwo = in.nextInt();
            System.out.println("Course reference number: " + myArray[indexOne][indexTwo].getCourseReferenceNumber());
            System.out.println("Course number: " + myArray[indexOne][indexTwo].getCourseNumber());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Good job!!!");
        }

    }
}
