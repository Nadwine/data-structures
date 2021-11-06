import java.util.*;
/**
 * This class will hold all the Employee's details.
 * @author Nadwine Louis
 *
 */

public class Employee implements Cloneable {
 private String forename;
 private String surname;
 private String title;
 private float salary;
 
 
 /**
  * Default constructor that will initialise the attributes.
  */
 public Employee() {
	 title="";
	 forename="";
	 surname="";
	 salary= 0.02f;
			 
 }
 
 /**
  * Sets all the attribute values based on the parameter values.
  * @param forename sets the Employee's forename.
  * @param surname sets the Employee's surname.
  * @param title sets the Employee's job title.
  * @param salary sets the Employee's salary.
  */
 public Employee( String forename, String surname, String title, float salary) {
	 this.forename=forename;
	 this.surname=surname;
	 this.title=title;
	 this.salary=salary;
	 
	 
 }
 
 /**
  * Copy Constructor to perform shallow copy.
  * @param employee
  */
 public Employee(Employee employee) {
			this.forename = employee.forename;
			this.surname = employee.surname;
			this.title=title;
			this.salary= employee.salary;	
}

 /**
  * 
  * @return the Employee's forename.
  */
public String getForename() {
	 return forename;
 }
 
/**
 * Sets the Employee's forename.
 */
 public void setForename() {
	 this.forename=forename;
 }
 
 /**
  * 
  * @return the Employee's surname.
  */
 public String getSurname() {
	 return surname;
 }
 
 /**
  * Sets the Employee's surname.
  */
 public void setSurname() {
	 this.surname=surname;
 }
 
 /**
  * 
  * @return the Employee's job title.
  */
 public String getTitle() {
	 return title;
 }
 
 /**
  * Sets the Employee's job title.
  */
 public void setTitle() {
	 this.title=title;
 }
 
 /**
  * 
  * @return the Employee's salary.
  */
 public float getSalary() {
	 return salary;
 }
 
 /**
  * Sets the Employee salary.
  */
 public void setSalary() {
	 this.salary=salary;
 }
 
 /**
  * Get the description of the Employee.
  */
 public String toString() {
	 String titleUppercase = title.substring(0, 1).toUpperCase() + title.substring(1);//ensures that the first letter in title is capitalised.
	 String forenameUppercase = forename.substring(0, 1).toUpperCase() + forename.substring(1);//first letter in forename is capitalised.
	 String surnameUppercase = surname.substring(0, 1).toUpperCase() + surname.substring(1);//first letter in surname is capitalised.
	 String formatSalary = String.format("%.02f", salary); //format salary to 2 decimal places.
	 return (forenameUppercase+" "+ surnameUppercase + "," + " "+titleUppercase+ ","+" "+"£"+ formatSalary);
	 
 }
 
 /**
  * 
  * @return clone object.
  */
 public Object Clone(){
		// get a shallow copy
		Employee e = new Employee(this);

		// Clone any object references (deep copy)
	    e.title = this.title;
	    e.forename = this.forename;
		e.surname =  this.surname;
		e.salary= this.salary;
		return e;
	}
 }
