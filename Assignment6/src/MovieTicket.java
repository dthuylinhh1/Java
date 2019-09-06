//Create a class called MovieTicket
public class MovieTicket {
    //Initialize variables
    private String movieName;
    private int ticketNumber;
    private int theaterNumber;

    //Static variables
    static double ticketPrice = 35.5;
    static double taxAmount;

    //Setter and Getter for each instance
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    public int getTicketNumber(){
        return ticketNumber;
    }
    public void setTheaterNumber(int theaterNumber){
        this.theaterNumber = theaterNumber;
    }
    public int getTheaterNumber(){
        return theaterNumber;
    }

    //Static method to calculate and return Tax
    public static double getTax(){
        taxAmount = (0.13*ticketPrice);
        return taxAmount;
    }

    public String getDate(String showDay){
        switch (movieName){
            case "Cinderella":
                showDay = "Saturday";
                System.out.println("The show time for The Vow is on Saturday");
                break;
            case "WallE":
                showDay = "Sunday";
                System.out.println("The show time for Captain Marvel is on Sunday");
                break;
            case "XMen":
                showDay = "Friday";
                System.out.println("The show time for Alice in Wonderland is on Friday");
                break;
            default:
                System.out.println("The show time for the movie you have chosen is not available at the moment");
        }
        return showDay;
    }

    public double getDate(double showTime){
        switch (ticketNumber){
            case 20:
                showTime = 5.30;
                System.out.println("The show time for your ticker is on 5.30 pm");
                break;
            case 30:
                showTime = 6.30;
                System.out.println("The show time for your ticket is on 6.30 pm");
                break;
            case 40:
                showTime = 7.30;
                System.out.println("The show time for your ticket is on 7.30 pm");
                break;
            default:
                System.out.println("The show time for your ticket is not available at the moment");
        }
        return showTime;
    }

}
