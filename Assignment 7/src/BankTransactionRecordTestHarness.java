import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BankTransactionRecord myRecord = new BankTransactionRecord();

        BankTransactionRecord myArray[] = new BankTransactionRecord[500];
        Random rand = new Random();


        for (int i = 0; i < 500; i++) {
            myArray[i] = new BankTransactionRecord(rand.nextInt(), rand.nextBoolean(), rand.nextDouble(), rand.nextLong());
            System.out.println("Record number: " + BankTransactionRecord.numberOfTransaction);
            System.out.println("Transaction number: " + myArray[i].getTransactionNumber());
            System.out.println("Canadian Funds: " + myArray[i].getCanadianFunds());
            System.out.println("Exchange rate: " + myArray[i].getExchangeRate());
            System.out.println("Transaction Reference Number: " + myArray[i].getTransactionReferenceNumber());
            System.out.println("-------------------------------------------------");
        }

        System.out.println("Do you want to complete phase two of the test:? (yes/no)");
        String response = in.next();

        while(response.equalsIgnoreCase("yes")){
            for(int i = 0; i < 500; i++){
                myRecord.setTransactionNumber(100);
                myRecord.setCanadianFunds(true);
                myRecord.setExchangeRate(100);
                myRecord.setTransactionReferenceNumber(100);
                System.out.println("Record number: " + i);
                System.out.println("Transaction number: " + myRecord.getTransactionNumber());
                System.out.println("Canadian Funds: " + myRecord.getCanadianFunds());
                System.out.println("Exchange rate: " + myRecord.getExchangeRate());
                System.out.println("Transaction Reference Number: " + myRecord.getTransactionReferenceNumber());
                System.out.println("-------------------------------------------------");

            }
            System.out.println("Do you want to continue? (yes/no)");
            response = in.next();
        }

    }
}
