

/**
 * 
 * This class will hold the date for the appointments 
 * @author Nadwine Louis
 *
 */
 public class Date implements Comparable, Cloneable{
			// Declaring attributes
	 
			private static int objectID = 200;
			private int id;

			// To enable textual month descriptors
			private static String months =  "JanFebMarAprMayJunJulAudSepOctNovDec";
			private int day; // Day of the month
			private int month; // Month of the year
			private int year; // The year

			
			/**
			 * Default Constructor
			 */
			public Date(){
				day = month = year = 1;
				id = objectID++;
			}

			/**
			 * Create Date object using data passed by the parameters.
			 * @param day
			 * @param month
			 * @param year
			 */
			public Date(int day, int month, int year) {
				id = objectID++;
				if (day <=31 && month <=12) {
					this.day = day;
					this.month = month;
					this.year = year;
				}
				else {
					System.out.println("please enter a valid date");
				}
			}

			/**
			 * 
			 * @param date
			 * Copy constructor to perform shallow copy
			 */
			public Date(Date date){
				this.day = date.day;
				this.month = date.month;
				this.year = date.year;
				id = objectID++;	
			}
			
			/**
			 * Clone method
			 */
			public Object clone(){
				Date date = new Date(this);
				return date;
			}
			
			/**
			 * Set the details for Date.
			 * @param day
			 * @param month
			 * @param year
			 */
			public void setDetails(int day, int month, int year){
				this.day = day;
				this.month = month;
				this.year = year;
			}
			
			
			/**
			 * Get description of the Date.
			 */
			public String toString(){
				String s = new String("Date: "+ day + " " + months.substring((month-1)*3, month*3) + " " + year + " ");
				return s;
			}
			

			
			/**
			 * CompareTo method that provides the natural ordering on month
			 */
			public int compareTo(Object obj) {
				Date date = (Date) obj;
				if(date == null)
					return 1;
				else {
					String converter1 = Integer.toString(month);
			    return converter1.compareTo(converter1);
				}
			}
			
			/**
			 * @return day
			 */
	public int getDay() {
		return day;
	}
	
	
	/**
	 * @return month
	 */
 public int getMonth() {
			  return month;
 }
 
 
 /**
  * @return year
  */		
public int getYear() {
	return year;
}


/**
 * @param day
 * Set the day if the day entered is lesser than 31
 */
	public void setDay(int day) {
		
		if(day >=1 && day <=31) {
			this.day = day;
		}
		else
			{
				System.out.print("Please enter a valid date (1-31)");
			}
		return;
		
 	
	}
	
	 /**
	  * @param month
	  * Set the month if the month entered is greater than 12.
	  */
	public void setMonth(int month) {
		if(month >=1 && month <=12) {
		 this.month=month;
		}
		else {
			System.out.println("Please enter a valid month (1-12)");
		}}
	
	 /**
	  * @param year
	  * Set the year.
	  */
	public void setYear(int year) {
		this.year=year;
	}
			
	


 }



