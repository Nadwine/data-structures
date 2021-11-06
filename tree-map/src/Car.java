/**
 * This class will store the details of the cars.
 * @author Nadwine Louis
 *
 */

public class Car {

	private final String make;
	private final String model;
	private String colour;
	private Month taxExpiresEndMonth;

	/**
	 * Default constructor.
	 */
	public Car() {
		this.make = "";
		this.model = "";
		this.colour = "";
		this.taxExpiresEndMonth = null;
		
	}

	/**
	 * Set all the attribute values based on parameter values.
	 * @param make
	 * @param model
	 * @param colour
	 * @param taxExpiresEndMonth
	 */
	public Car(String make, String model, String colour, Month taxExpiresEndMonth) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.taxExpiresEndMonth = taxExpiresEndMonth;
	}

	/**
	 * 
	 * @return the car's make.
	 */
	public String getMake() {
		return make;
	}

	/**
	 * 
	 * @return the car's model.
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * 
	 * @return the tax expiry month.
	 */
	public Month getTaxExpiresEndMonth() {
		return taxExpiresEndMonth;
	}
	
	/**
	 * Sets the tax expiry month.
	 * @param month
	 */
	public void setTaxExpiresEndMonth(Month month) {
		this.taxExpiresEndMonth = month;
	}

	/**
	 * 
	 * @return the car's colour.
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Sets the car's colour.
	 * @param colour
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * Get the description of the car.
	 */
	public String toString() {
		return make + " " + model + " " + colour + " " + taxExpiresEndMonth;

	}
}
