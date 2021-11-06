import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

/**
 *This class will create a number of appointments and store them in an ArrayList and Array. It will also demonstrate object
 *references.
 * @author Nadwine Louis
 *
 */	
	
public class Test003 {
	
	
	public static void main(String[] args) {
		/**
		 *Create appointment objects and store them in an Arraylist
		 */
		
		//Create Appointment objects
		Appointment app1 = new Appointment("Paul", 25, 6, 2005, 16, 35, "b205", "ultra sound");
		Appointment app2 = new Appointment("Anna", 21, 2, 2001, 12, 31, "a105", "blood test");
		Appointment app3 = new Appointment("Beyonce", 22, 3, 2002, 13, 32, "c205", "x-ray");
		Appointment app4 = new Appointment("Susanne", 22, 3, 2002, 14, 33, "c105", "eye test");//This date is the same as the date before it, the test should compare the time 
		Appointment app5 = new Appointment("Manny", 24, 5, 2004, 15, 34, "t111", "dental exam");
	    ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	    /**
		 *Object referencing
		 *
		 */
	Appointment searchAppointment  = (Appointment) app1.clone();
	Appointment searchAppointmentClone = (Appointment)searchAppointment.clone();
	
	appointmentList.add(app1);  
	appointmentList.add(app2);
	appointmentList.add(app3);
	appointmentList.add(app4);
	appointmentList.add(app5);
	appointmentList.add(searchAppointment);
    appointmentList.add(searchAppointmentClone);
    System.out.println("=============================== ArrayLists ============================================");
    // Print elements in arraylist
    System.out.println("-----Printing ArrayList Before Sorting:-----");
    for(Object s: appointmentList)
		System.out.println(s);
	
        	
    System.out.println();
	
 System.out.println("-----Printing ArrayList After sorting by date:-----");
 Collections.sort(appointmentList);

 // printing all the elements in the arraylist after sorting
	for(Object s: appointmentList)
		System.out.println(s);
	
System.out.println("-----Printing index of sorted searchAppointment-----");
	
	
	System.out.println(appointmentList.indexOf(searchAppointment));
	System.out.println(); 
	
	
System.out.println("-----Printing index of searchAppointmentClone-----");
System.out.println(appointmentList.indexOf(searchAppointmentClone));
	


System.out.println("=============================== Arrays ============================================");

Appointment[] appArray = new Appointment[7];
appArray[0] = new Appointment("Paul", 25, 6, 2005, 16, 35, "b205", "ultra sound");
appArray[1]= new Appointment("Anna", 21, 2, 2001, 12, 31, "a105", "blood test");
appArray[2]= new Appointment("Beyonce", 22, 3, 2002, 13, 32, "c205", "x-ray"); 
appArray[3]= new Appointment("Susanne", 22, 3, 2002, 14, 33, "c105", "eye test"); 
appArray [4]= new Appointment("Manny", 24, 5, 2004, 15, 34, "t111", "dental exam");

//Objects to search
appArray [5] = searchAppointment;
appArray[6]= searchAppointmentClone;

//Print elements in array
System.out.println();
System.out.println("-----Printing unsorted Array:-----");
for(Object a: appArray)
	System.out.println(a);

//Print array after sorting
System.out.println();
System.out.println("------Printing sorted Array by date:-----");
Arrays.sort(appArray);

for(Object a: appArray)
	System.out.println(a);

System.out.println();

System.out.println("-----Printing sorted searchAppointment index------");
	int indexOfSortedSearchappointment = 0;
	for (Appointment a : appArray) {
		indexOfSortedSearchappointment++;
		if (a.equals(searchAppointment)){
			System.out.println("searchAppointment was found in index " + indexOfSortedSearchappointment);
		}
	}
	
	System.out.println();
		
System.out.println("-----Printing searchAppointment Clone index");
int indexOfSortedSearchappointmentClone = 0;
for (Appointment a : appArray) {
	indexOfSortedSearchappointmentClone++;
	if (a.equals(searchAppointmentClone)){
		System.out.println("searchAppointment was found in index " + indexOfSortedSearchappointmentClone);
	
	
}}}}