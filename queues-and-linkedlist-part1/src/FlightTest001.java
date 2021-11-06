import java.util.*;

/**
 * This class will create a number of flights and joins them to the queue without maintaining priority order.
 * @author Nadwine Louis
 *
 */
public class FlightTest001 {
public static void main (String[] args) {
	FlightQueue f = new FlightQueue();///
	
	//Create the flight objects.
  //Flight f10= new Flight("te123, 10);-- displays error message since priority is higher than 9.
	Flight f1 = new Flight("ab123", 9);
	Flight f2 = new Flight("cd234", 6);
	Flight f3 = new Flight("ef456", 3);
	Flight f4 = new Flight("gh678", 1);
	Flight f5 = new Flight("ij910", 2);
	Flight f6 = new Flight("kl111", 5);
	Flight f7 = new Flight("mn123", 7);
	Flight f8 = new Flight("op321", 8);
	Flight f9 = new Flight("qr987", 4);
	

	//Join flights to the queue.
	System.out.println();
	System.out.println("====================== Printing the queue without maintaining priority order ================================");
	System.out.println();
	System.out.println(f1 + " joined the queue");
	f.joinQueue(f1);
	f.display();
	
	System.out.println(f2 + " joined the queue");
	f.joinQueue(f2);
	f.display();
	
	System.out.println(f3 + " joined the queue");
	f.joinQueue(f3);
	f.display();
	
	System.out.println(f4 + " joined the queue");
	f.joinQueue(f4);
	f.display();
	
	System.out.println(f5 + " joined the queue");
	f.joinQueue(f5);
	f.display();
	
	System.out.println(f6 + " joined the queue");
	f.joinQueue(f6);
	f.display();
	
	System.out.println(f7 + " joined the queue");
	f.joinQueue(f7);
	f.display();
	
	System.out.println(f8 + " joined the queue");
	f.joinQueue(f8);
	f.display();
	
	System.out.println(f9 + " joined the queue");
	f.joinQueue(f9);
	f.display();
	
	//land flight test
	//f.landFlight();
}
}
