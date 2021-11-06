/**
 *   This class will add flights to the queue without maintaining priority order.
 * @author Nadwine Louis
 *
 */
public class NormalFlightQueue extends AbstractFlightQueue {

	/**
	 * Inserts a flight into the queue with no priority order.
	 */
	public void joinQueue(Flight f){
		flights.addLast(f); 
	}

	/**
	 * Removes the flight from queue.
	 */
	public void landFlight() {
		if (flights.isEmpty()) {// checks if the queue is empty.
			System.out.println("The NormalFlightQueue is empty no flights to land");
		} 
		else {
			
			//The "remove" method returns the head object just before removing it.
			//This variable will temporarily hold the object being removed so it can be printed to console before removing.
			Flight flightBeingRemoved = flights.remove();
			System.out.println("Flight with priority-"+flightBeingRemoved.getPriority() + " has landed");
		}

	}
}
