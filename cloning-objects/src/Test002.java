/**
 *This class will create a number of appointments and demonstrate deep copying of Appointment objects.
 * @author Nadwine Louis
 *
 */
public class Test002 {

	/**
	 * 
	 * @param args
	 * Create appointments
	 */
	public static void main(String[] args) {
		Appointment a1 = new Appointment("Nadwine Louis", 20,12,2020, 23,15, "t111", "Eye test");
		Appointment a2= null;
		Appointment a3= null;
		Appointment a4= null;
		Appointment a5= null;
		
		/**
		 *Deep Copying of objects
		 *
		 */
		
		System.out.println("-----Performing Deep Copy-----");
		
		a2 = (Appointment) a1.clone();
		a3 = (Appointment) a1.clone();
		a4 = (Appointment) a1.clone();
		a5 = (Appointment) a1.clone();
		
		//Print Appointments
		System.out.println(a1);		
		System.out.println(a2);	
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		

		
		
	}
	
}

