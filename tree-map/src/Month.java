/**
 * This is an enumeration class that will provide each month with an associated integer value from 1 to 12.
 * @author Nadwine Louis
 *
 */
public enum Month {
	
	
	January(1),
	February(2),
	March(3),
	April(4),
	May(5),
	June(6),
	July(7),
	August(8),
	September(9),
	October(10),
	November(11),
	December(12);
	
	private final int month; 

	//Constructor
	Month(int i) {
		this.month = i;
	}

	/**
	 * 
	 * @return the month in integer value.
	 */
	public int getMonth() {
		return month;
	}
}
