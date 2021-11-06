import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * This class will always land the flights in priority order.
 * @author Nadwine Louis
 *
 */
public class PriorityFlightQueue2 extends AbstractFlightQueue {

	
/**
 * Adds the flight by iterating through the sorted loop to find where to insert flight the flight into the linked list.
 */
	public void joinQueue(Flight f) {

		if (flights.size() <= 2) {
			flights.add(f);
		
		} else {
			//Compares two flights and enters one in the middle based on the priority.
			for (int i = 0; i < flights.size(); i++) {
				if (f.getPriority() <= flights.get(i).getPriority()
						&& f.getPriority() >= flights.get(i + 1).getPriority()) {
					flights.add(i + 1, f);
					i = flights.size();
				} 
				else if (f.getPriority() > flights.get(0).getPriority()) {
					flights.addFirst(f);
					i = flights.size();
				}
			}
		}
		
		
	}
	
	/**
	 * Removes flight from the queue.
	 */
	public void landFlight() {
		if (flights.isEmpty()) {
			System.out.println("The PriorityFlightQueue2 is empty, no flights to land");
		} 
		else {
			
			//The "remove" method returns the head object just before removing it.
			//This variable will temporarily hold the object being removed so it can be printed to console before removing.
			Flight flightBeingRemoved = flights.remove();
			System.out.println("Flight with priority-"+flightBeingRemoved.getPriority() + " has landed");
		}

	}

}
