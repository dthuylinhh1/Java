import java.util.Random;
import java.util.Scanner;

public class RealEstateTransaction {
    private String streetNumber, streetName, city, county, purchasePrice;
    Random rand = new Random();
    String allState, afterTrim, firstHalf, secondHalf, newString, otherString;
    int stateLength, halfLength;

    //A default constructor
    public RealEstateTransaction(){

    }

    //A constructor that takes 5 arguments
    public RealEstateTransaction(String streetNumber, String streetName, String city, String county, String purchasePrice){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.county = county;
        this.purchasePrice = purchasePrice;
    }

    //Setters and Getters

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName(){
        return streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty() {
        return county;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void oneString(){
        allState = (streetNumber + streetName + city + county + purchasePrice);
        afterTrim = allState.trim();
        stateLength = afterTrim.length();
        halfLength = stateLength/2;
        firstHalf = afterTrim.substring(0,halfLength).toLowerCase();
        secondHalf = afterTrim.substring(halfLength).toUpperCase();
        newString = firstHalf + secondHalf;


        System.out.println("The result of first method is: " + newString);
    }

    int a,b;
    public void validNumber() {
        System.out.println("The length of string: " + stateLength);
        a = rand.nextInt(stateLength);
        System.out.println("The first number is: " + a);
        b = a + rand.nextInt(stateLength - a) +1;
        System.out.println("The second number is: " + b);
        System.out.println("The result of second method is: " + afterTrim.substring(a, b));

    }

    Scanner in= new Scanner(System.in);
    public void encryption(){
        System.out.println("Please enter a random number: ");
        int x = in.nextInt();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] newAlphabet = new char[26];
        for(int i = 0; i <alphabet.length;i++){
            newAlphabet[i]= alphabet[(i+x) %26];
            System.out.println(newAlphabet[i]);
        }

    }

}
