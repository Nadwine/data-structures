/**
 * This class will store the car owner's address.
 * @author Nadwine Louis
 *
 */

public class Address {
	
	private String street;
	private String town;
	private String postcode;
	
/**
 * Default constructor.
 */
	public Address() {
		
	}
	
	/**
	 * Sets the attribute values based on the parameter values.
	 * @param street
	 * @param town
	 * @param postcode
	 */
	public Address (String street, String town, String postcode) {
		this.street=street;
		this.town=town;
		this.postcode=postcode;
		
	}
	
	/**
	 * 
	 * @return the street.
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Sets the street.
	 * @param street
	 */
	public void setStreet(String street) {
		this.street=street;
	}
	
	/**
	 * 
	 * @return the town.
	 */
	public String getTown() {
		return town;
	}
	
	/**
	 * Sets the town.
	 * @param town
	 */
	public void setTown(String town) {
		this.town=town;
	}
	
	/**
	 * 
	 * @return the postcode.
	 */
	public String getPostcode() {
		return postcode;
	}
	
	/**
	 * Sets the postcode.
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode=postcode;
	}
	
	/**
	 * Get the description of the address.
	 */
	public String toString() {
		return street + " " + town + " " + postcode;
		
	}
	
	

}
