/**
 *This class is the comparator class to search the appointments by the meeting room.
 * @author Nadwine Louis
 *
 */

import java.util.Comparator;

public class SortByRoomFloor implements Comparator <Appointment> {
	
	  public int compare(Appointment paramT1, Appointment paramT2) {
	        if (paramT1 == null) {
	            if (paramT2 == null) {
	                return 0; // Both Appointments are null
	            } else {
	                return -1; // paramT1 is NULL, so put paramT1 in the end of
	                           // the sorted list
	            }
	        } else {
	            if (paramT2 == null) {
	                return 1;
	            }
	        }
	       MeetingRoom room1 = paramT1.getMeetingRoom();
	        MeetingRoom room2 = paramT2.getMeetingRoom();
	        String s1 = room1.toString();
	        String s2 = room2.toString();
	        return s1.compareTo(s2);
}
}