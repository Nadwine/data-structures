import java.util.Collections;
/**
 * This class will always land flights in priority order.
 * @author Nadwine Louis
 *
 */
public class PriorityFlightQueue1 extends AbstractFlightQueue {

	/**
	 * Adds new flight to the back of queue then sort queue using the collections sort method..
	 */
	public void joinQueue(Flight f){
		if(flights.isEmpty()) {
			flights.add(f);
		}
		else {
			flights.add(f);
			Collections.sort(flights, new SortingByPriority());// uses the comparator SortingByPriority to sort.
		}
	}
	
	
	public void landFlight() {
		if (flights.isEmpty()) {
			System.out.println("The PriorityFlightQueue1 is empty, no flights to land");
		} 
		else {
			
			//The "remove" method returns the head object just before removing it.
			//This variable will temporarily hold the object being removed so it can be printed to console before removing.
			Flight flightBeingRemoved = flights.remove();
			System.out.println("Flight with priority-"+flightBeingRemoved.getPriority() + " has landed");
		}

	}
}
