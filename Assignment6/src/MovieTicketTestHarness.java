import java.util.Scanner;

public class MovieTicketTestHarness {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MovieTicket ticketOne = new MovieTicket();
        System.out.println("Please enter your movie you want to see: (Cinderella, WallE, XMen) ");
        ticketOne.setMovieName(in.next());
        Scanner ticket = new Scanner(System.in);
        System.out.println("Please enter your ticket number: ");
        ticketOne.setTicketNumber(ticket.nextInt());
        Scanner theater = new Scanner(System.in);
        System.out.println("Please enter your theater number: ");
        ticketOne.setTheaterNumber(theater.nextInt());
        System.out.println("The ticket number " + ticketOne.getTicketNumber() + " for " + ticketOne.getMovieName() + " in theater number " + ticketOne.getTheaterNumber() + " is $" + MovieTicket.ticketPrice + " plus $" + MovieTicket.getTax() + " for tax.");

        ticketOne.getDate(ticketOne.getTicketNumber());
        ticketOne.getDate(ticketOne.getMovieName());
    }
}
