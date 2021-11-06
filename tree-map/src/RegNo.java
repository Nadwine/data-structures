/**
 * This class will store the details of the car's registration number (number plate).
 * @author Nadwine Louis
 *
 */
public class RegNo implements Comparable {

	private final String regNo;

	public RegNo() {
		this.regNo = "";

	}

	/**
	 * Set the attribute value based on the parameter value.
	 * @param regNo
	 */
	public RegNo(String regNo) {
		this.regNo = regNo;
	}

	/**
	 * 
	 * @return the registration number.
	 */
	public String getRegNo() {
		return regNo;
	}
	
	/**
	 * Get the description of the registration number.
	 */
	public String toString() {
		return regNo;
	}

	/**
	 * Compares the RegNo with the specified object for order.
	 */
	public int compareTo(Object object) {
		//casted input object to type RegNo
		return this.regNo.compareTo(((RegNo) object).getRegNo());
	}

}
