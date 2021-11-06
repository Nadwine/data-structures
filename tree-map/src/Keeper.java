/**
 * This class will store the car owner's details.
 * @author Nadwine Louis
 *
 */
public class Keeper {

	private String forename;
	private String surname;
	private Address address;

	/**
	 * Default constructor.
	 */
	public Keeper() {
	}
	
	/**
	 * Sets all the attribute values based on the parameter values.
	 * @param forename
	 * @param surname
	 * @param address
	 */
	public Keeper(String forename, String surname, Address address) {
		this.forename=forename;
		this.surname=surname;
		this.address=address;
	}
	
	/**
	 * 
	 * @return the car owner's forename.
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * Set the car owner's forename.
	 * @param forename
	 */
	public void setForename(String forename) {
		this.forename=forename;
	}
	
	/**
	 * 
	 * @return the car owner's surname.
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set the car owner's surname.
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname=surname;
	}

	/**
	 * 
	 * @return the car owner's address.
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * Set the car owner's address.
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address=address;
	}
	
	/**
	 * Get the description of the car owner.
	 */
	public String toString() {
		return forename + " " + surname + " " + address.toString();
	}
}
