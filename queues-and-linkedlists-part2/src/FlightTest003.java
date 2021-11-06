/**
 * This class will be using the JavaPriorityFlightQueue to create flights and join them to the queue.
 * @author Nadwine Louis
 *
 */
public class FlightTest003 {
	public static void main(String[] args) {
		//Creates a  number of flights
	
		Flight f1 = new Flight("ab123", 9);
		Flight f2 = new Flight("cd234", 6);
		Flight f3 = new Flight("ef456", 3);
		Flight f4 = new Flight("gh678", 1);
		Flight f5 = new Flight("ij910", 2);
		Flight f6 = new Flight("kl111", 5);
		Flight f7 = new Flight("mn123", 7);
		Flight f8 = new Flight("op321", 8);
		Flight f9 = new Flight("qr987", 4);
	
	JavaPriorityFlightQueue queue = new JavaPriorityFlightQueue();
	
	System.out.println("=======================================================================================================================");
	System.out.println(" ----------------------------------------- Printing the Java Priority Queue --------------------------------------------------");
	System.out.println();
	System.out.println(f1 + " joined the queue");
	queue.joinQueue(f1);
	queue.display();
	
	System.out.println(f3 + " joined the queue");
	queue.joinQueue(f3);
	queue.display();
	
	System.out.println(f2 + " joined the queue");
	queue.joinQueue(f2);
	queue.display();
	
	System.out.println(f4 + " joined the queue");
	queue.joinQueue(f4);
	queue.display();
	
	System.out.println(f6 + " joined the queue");
	queue.joinQueue(f6);
	queue.display();
	
	System.out.println(f5 + " joined the queue");
	queue.joinQueue(f5);
	queue.display();
	
	System.out.println(f7 + " joined the queue");
	queue.joinQueue(f7);
	queue.display();
	
	System.out.println(f8 + " joined the queue");
	queue.joinQueue(f8);
	queue.display();
	
	System.out.println(f9 + " joined the queue");
	queue.joinQueue(f9);
	queue.display();
	System.out.println();
	
	System.out.println("***Landing all the flights:***");
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.landFlight();
	queue.display();
	
}
}