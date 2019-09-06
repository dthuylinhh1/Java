import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        boolean found = false;
        String newItem;
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Music");
        bookList.add("Love");
        bookList.add("Sport");
        bookList.add("Programming");
        bookList.add("Math");
        System.out.println("Current list includes: \n" + bookList);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a new item: ");
        newItem = in.next();

        while (newItem.equalsIgnoreCase("quit") == false) {
            for (int i = 0; i < bookList.size()-4; i++) {
                if(newItem == bookList.get(i)) {
                    System.out.println("This item is already exist");
                }else{
                    bookList.add(newItem);
                }
            }
            System.out.println("Do you want to add new item?");
            newItem = in.next();
        }
        System.out.println("Final list includes: \n" + bookList);
    }
}