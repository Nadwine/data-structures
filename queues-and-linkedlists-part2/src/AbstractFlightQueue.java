import java.util.Iterator;
import java.util.LinkedList;
/**
 * Abstract class that will hold the concrete and abstract methods for the flight queue.
 * @author Nadwine Louis
 *
 */

public abstract class AbstractFlightQueue {
	protected LinkedList<Flight> flights = new LinkedList<Flight>();
	
	Iterator<Flight> iterator = flights.iterator();//sets the flights linked list as the collection for the iterator.

	/**
	 * Default constructor.
	 */
	public AbstractFlightQueue() {

	}

	
	public abstract void joinQueue(Flight f);// abstract method

	public abstract void landFlight();// abstract method
	

	/**
	 * 
	 * @return the number of aircraft in the queue.
	 */
	public int size() { //concrete method
		return flights.size();
	}

	/**
	 * Lands all flights leaving the queue empty.
	 */
	public void clear() { // concrete method.
		if (flights.isEmpty()) {
			System.out.println("The Queue is cleared");
		} else {
				while (iterator.hasNext()){ //uses iterator in a loop to remove flights.
						flights.removeFirst();
				}
			}
		
	}
	
	/**
	 * Displays a list of flights in the queue.
	 */
	public void display() {
		if (flights.isEmpty())
			System.out.println("The Queue is empty");
		else {
		System.out.print("FRONT-> ");
		for(Flight fl : flights) { // uses loop to display the queue.
			System.out.print(fl.toString());
		}
		System.out.println("<-REAR\n");
	}

}}