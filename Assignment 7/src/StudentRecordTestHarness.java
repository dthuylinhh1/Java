import java.util.Random;
import java.util.Scanner;

public class StudentRecordTestHarness {
    public static void main(String[] args){
        //Instantiation new object of StudentRecord Class with reference myRecord.
        StudentRecord myRecord = new StudentRecord();
        //Instantiation new array of StudentRecord Class with reference myArray with 200 elements.
        StudentRecord myArray[] = new StudentRecord[200];

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        for(int i = 0; i<200; i++){
            myArray[i] = new StudentRecord(rand.nextInt(), rand.nextLong(), rand.nextBoolean());
            //System.out.println("Student Name: " + myArray[i].name);
            System.out.println("Student Record " + StudentRecord.numberRecord);
            System.out.println("Student ID: " + myArray[i].getStudentID());
            System.out.println("Student get scholarship: " + myArray[i].getScholarship());
            System.out.println("Student reference number: " + myArray[i].getStudentReferenceNumber());
            System.out.println("----------------------------------------------");
        }

        System.out.println("Do you want to test the second phase? (yes/no)");
        String response = in.next();

        while (response.equalsIgnoreCase("yes")){
            for(int i = 1; i<=200; i++){
                myRecord.setStudentID(10);
                myRecord.setStudentReferenceNumber(10);
                myRecord.setScholarship(true);
                System.out.println("Student Record: " + i);
                System.out.println("Student ID: " + myRecord.getStudentID());
                System.out.println("Student get scholarship: " + myRecord.getScholarship());
                System.out.println("Student reference number: " + myRecord.getStudentReferenceNumber());
                System.out.println("----------------------------------------------");
            }
            System.out.println("Do you want to continue? (yes/no)");
            response = in.next();
        }
    }
}
