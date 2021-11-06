 
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
/**
 * This classes uses the concrete java.util.PriorityQueue to create the queue.
 * @author Nadwine Louis
 *
 */

public class JavaPriorityFlightQueue {
	
	protected PriorityQueue<Flight> flights = new PriorityQueue<Flight>(new SortingByPriority());//constructs the priority queue using the SortingByPriority comparator
	
	Iterator<Flight> iterator = flights.iterator();//sets the flights linked list as the collection for the iterator.
	
	/**
	 * Inserts a flight into the queue.
	 * @param f adds the flight.
	 */
	public void joinQueue(Flight f) {
		flights.add(f);
	}

	/**
	 * Removes flight from the queue.
	 */
	public void landFlight() {
		if (flights.isEmpty()) { //checks if the queue is empty.
			System.out.println("The Queue is empty no flights to land");
		} 
		else {
			
			//The "remove" method returns the head object just before removing it.
			//This variable will temporarily hold the object being removed so it can be printed to console before removing.
			Flight flightBeingRemoved = flights.remove();
			System.out.println("Flight with priority-"+flightBeingRemoved.getPriority() + " has landed");
		}

	}

	/**
	 * 
	 * @return the number of aircraft in the queue.
	 */
	public int size() {
		return flights.size();
	}

	/**
	 * Lands all the flights leaving the queue empty.
	 */
	public void clear() { //checks if the queue is empty.
		if (flights.isEmpty()) {
			System.out.println("The Queue is cleared");
		} else {
				while (iterator.hasNext()){ //uses iterator in a loop to remove flights.
						flights.remove();
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
		for(Flight fl : flights) { // uses loop to display the flights.
			System.out.print(fl.toString());
		}
		System.out.println("<-REAR\n");
	}

	}}
