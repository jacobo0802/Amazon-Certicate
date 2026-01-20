package Assigments;

public class movies {
    public static void main(String[] args) {

        String FirstName = "Sandy";
        String LastName = "Jones";
        String MovieTitle = "The Source Code";
        int TicketsBought = 8;
        double TicketPrice = 10.57;

        double TotalPrice = TicketsBought * TicketPrice;

        String Username = FirstName.toLowerCase() + LastName.toLowerCase();
        
        String movieName = MovieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println("Username: " + Username);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + TicketsBought);
        System.out.println("Price per Ticket: $" + TicketPrice);
        System.out.println("Total Price of " + TicketsBought + " tickets: $" + TotalPrice);
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");

    }
    
}
