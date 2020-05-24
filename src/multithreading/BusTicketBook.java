package multithreading;

public class BusTicketBook {
    public static void main(String[] args) {
      TicketCounter tc = new TicketCounter();
      BookTicket bookTicket1 = new BookTicket("Mayank", 2, tc);
      BookTicket bookTicket2 = new BookTicket("Ranjan", 2, tc);
      bookTicket1.start();
      bookTicket2.start();
    }
}
class BookTicket extends Thread{
    String name;
    int seatsToBook;
    TicketCounter ticketCounter;

    public BookTicket(String name, int seatsToBook, TicketCounter ticketCounter) {
        this.name = name;
        this.seatsToBook = seatsToBook;
        this.ticketCounter = ticketCounter;
    }
    @Override
    public void run() {
        ticketCounter.bookSeats(name, seatsToBook);
    }
}

class TicketCounter {
    int availableSeats = 3;
    public synchronized void bookSeats(String name, int noOfTickets) {
            if (noOfTickets <= availableSeats && noOfTickets > 0) {
                System.out.println("Hi: " + name + ", successfully booked: " + noOfTickets + "ticket(s)");
                availableSeats -= noOfTickets;
                return;
            }
            System.out.println("Seat(s) not available");
    }
}
