 /**
 * 
 * This class will hold the time for the appointments
 * @author Nadwine Louis
 *
 */

public class Time implements Comparable, Cloneable {
	// Declaring attributes
	
	private int hour; // Hour of the day
	private int minute; // Minute within the hour
	private static int objectID = 100;
	private int id;
	
	/**
	 * Default Constructor
	 */
	public Time(){
		hour = minute = 1;
		id = objectID++;
	}

	/**
	 * Create Time object using data passed by the parameters.
	 * @param hour
	 * @param minute
	 */
	public Time(int hour,int minute) {
		//Make sure minute is lesser than 59 and hour lesser than 24
		if(minute <=59 && hour <=24 ) {
		this.hour = hour;
		this.minute = minute;
		id = objectID++;
		}
		else {
			System.out.println("Please enter a valid time");
		}
	}

	/**
	 * 
	 * @param time
	 * Copy Constructor to perform shallow copy.
	 */
	public Time(Time time){
		this.hour = time.hour;
		this.minute = time.minute;
		id = objectID++;	
	}
	
	/**
	 * Clone method
	 */
	public Object clone(){
		Time time = new Time(this);
		return time;
	}
	
	
	/**
	 * Set the details for time.
	 * @param hour
	 * @param minute
	 */
	public void setDetails(int hour, int minute){
        this.hour=hour;
		this.minute = minute;
		this.id = id;
	}
	
	
	/**
	 * CompareTo method that provides the natural ordering on hour.
	 */
public int compareTo(Object obj) {
	Time time = (Time) obj;
	if(time == null)
		return 1;
	else {
		String converter1 = Integer.toString(hour);
    return converter1.compareTo(converter1);
    
		
	}
	
}

 /**
  * 
  * @param hour
  * Make sure the hour is not greater than 24 and then set hour
  */
 public void setHour(int hour) {
	 if(hour >=0 && hour <=24) {
		 this.hour=hour;
	 }
	 else {
		 System.out.println("Please enter a valid hour (0-23)");
	 }
 }
 
 /**
  * 
  * @param minute
  * Make sure the minute is not greater than 59 and then set the minute
  */
 public void setMinute(int minute) {
	 if(minute >=0 && minute <=59) {
		 this.minute=minute;
	 }
	 else {
		 System.out.println("Please enter a valid minute (0-59)");
	 }
 }
 
 /**
  * @return hour
  */
 public int getHour() {
	 return hour;
 }
 
 /**
  * @return minute
  */
 public int getMinute() {
	 return minute;
 }
 
 
 /**
  * Get description of Time object.
  */
 public String toString()
 {
     String s;
     s = "Time: " +hour+":"+minute;
     return s;
 }

 
}
