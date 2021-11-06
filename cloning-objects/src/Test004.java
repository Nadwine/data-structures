import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;
	
/**
 *This class will create appointment objects and store them in both an Array and Arraylist and sort them using the 
 *Comparable interface.
 *
 * @author Nadwine Louis
 *
 */	
public class Test004 {
	/**
	 * 
	 * @param args
	 * Create appointment objects and store them in an Arraylist
	 */
	
	public static void main(String[] args) {
	Appointment app1 = new Appointment("Paul", 25, 6, 2005, 16, 35, "b205", "ultra sound");
	Appointment app2 = new Appointment("Anna", 21, 2, 2001, 12, 31, "a105", "blood test");
	Appointment app3 = new Appointment("Beyonce", 22, 3, 2002, 13, 32, "c205", "x-ray");
	Appointment app4 = new Appointment("Susanne", 23, 4, 2003, 14, 33, "c105", "eye test");
	Appointment app5 = new Appointment("Manny", 24, 5, 2004, 15, 34, "t111", "dental exam");
	ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	/**
	 *Object referencing
	 *
	 */
	
	//Objects to search
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
    // Print elements in the arraylist
    System.out.println("-----Printing ArrayList Before Sorting:-----");
    for(Object a: appointmentList)
		System.out.println(a);
	
        	
    System.out.println();
    
	//Print arraylist elements after sorting
  System.out.println("-----After sorting by room:-----");
		
 Collections.sort(appointmentList, new SortByRoomFloor());// Sort by room floor
 for(Object a: appointmentList)
		System.out.println(a);


	
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
appArray[3]= new Appointment("Susanne", 23, 4, 2003, 14, 33, "c105", "eye test");
appArray [4]= new Appointment("Manny", 24, 5, 2004, 15, 34, "t111", "dental exam");

appArray [5] = searchAppointment;
appArray[6]= searchAppointmentClone;


//Print elements in the array
System.out.println();
System.out.println("-----Printing unsorted Array:-----");
for(Object a: appArray)
	System.out.println(a);

//Print elements in the array after sorting
System.out.println();
System.out.println("------Printing sorted Array by room floor:-----");
Arrays.sort(appArray, new SortByRoomFloor()); //Sort by room floor

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
	 
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	

		
	
