/**
 * This class will hold the Flight's details for the queue.
 * @author Nadwine Louis
 *
 */


public class Flight {
	private String flightID; //The id of the flight.
	private int priority; //The priority of the flight from 1 to 9.
	
	/**
	 * Default constructor
	 */

	public Flight() {
		flightID = "";
		priority=1;

	}
	
	/**
	 * Parameter constructor that sets all the attributes values based on the parameter values.
	 * @param flightID sets the flight ID.
	 * @param priority sets the priority.
	 */

	public Flight(String flightID, int priority) {
		this.flightID = flightID;
		if (priority > 0 && priority < 10) { //exception handling.
			this.priority = priority;
		} else {
			System.out.println("Error..Please enter a number from 1 to 9");
		}

	}

	/**
	 * 
	 * @return the flight ID.
	 */
	public String getFlightID() {
		return flightID;
	}

	/**
	 * 
	 * @return the flight's priority.
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * 
	 * @param flightID sets the flightID
	 */
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	
	/**
	 * If the priority is greater than 0 and lesser than 10, it sets the priority.
	 * @param priority sets the priority
	 */
	public void setPriority(int priority) {
		if (priority > 0 && priority < 10) {// exception handling
			this.priority = priority;
		} else {
			System.out.println("Error..Please enter a number from 1 to 9");
		}

	}

	/**
	 * Get the description of the flight
	 */
	public String toString() {
		//toUpperCase ensures that if the  user enters the ID in lowercase, the format will be uppercase.
		return ("[ " + "Flight ID: " + flightID.toUpperCase() + " " + "Priority: " + priority + " ] ");
	}
}
