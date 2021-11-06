 /**
 *This class will create a number of appointments and will demonstrate shallow copying of appointment objects.
 * @author Nadwine Louis
 *
 */

public class Test001 {
	


	public static void main(String[] args) {
		
		
		/**
		 *Create appointment objects
		 *
		 */
		
		
		Appointment a1 = new Appointment("Abdul Razaz",10,12,2020,23,12, "t111", "blood test" );
		Appointment a2 = null;
		Appointment a3 = null;
		Appointment a4 = null;
		Appointment a5 = null;
		
		/**
		 *Shallow copying
		 *
		 */
		System.out.println("Performing Shallow Copy");
		
		a2 = new Appointment(a1);
		a3 = new Appointment(a1);
		a4 = new Appointment(a1);
		a5 = new Appointment(a1);
		
		//Print Appointments
		System.out.println(a1);		
		System.out.println(a2);	
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
				
		
		



			
		
		
		


	}
}
