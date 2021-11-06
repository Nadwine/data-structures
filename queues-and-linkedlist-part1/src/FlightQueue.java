import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class will be the queue to hold the flight objects.
 * @author Nadwine Louis
 *
 */
public class FlightQueue {
	private LinkedList<Flight> flights = new LinkedList<Flight>();
	
	Iterator<Flight> iterator = flights.iterator();//sets the flights linked list as the collection for the iterator.
	
	
/**
 * Default Constructor
 */
	public FlightQueue() {

	}

	/**
	 * Inserts a flight into the queue with no priority.
	 * @param f adds the flight
	 */
	public void joinQueue(Flight f) {
		flights.addLast(f); // check this
	}

	
	/**
	 * Removes the flight from the queue.
	 */
	public void landFlight() {
		if (flights.isEmpty()) {
			System.out.println("The Queue is empty");
		} 
		else {
			
			//The "remove" method returns the head object just before removing it.
			//This variable will temporarily hold the object being removed so it can be printed to console before removing.
			Flight flightBeingRemoved = flights.remove();
			System.out.println("Flight with priority-"+flightBeingRemoved.getPriority() + " has landed");
		}
	}

	/**
	 * Returns the number of aircraft in the queue
	 * @return size
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
				for(Flight fl : flights) { // uses loop to display flights.
					System.out.print(fl.toString());
				}
				System.out.println("<-REAR\n");

		}

	}
}
