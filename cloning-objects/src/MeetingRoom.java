/**
 *This class will hold all the meeting room for the  appointment details.
 * @author Nadwine Louis
 *
 */

public class MeetingRoom implements Comparable, Cloneable {
	// Declaring attributes
	private String room; //Where to meet
	private int id;
	private static int objectID = 200;


	/**
	 * Default Constructor
	 */
	public MeetingRoom() {
	id = objectID++;
	}

	/**
	 * 
	 * @param room
	 * Create MeetingRoom object using data passed by the parameters
	 */
	public MeetingRoom(String room) {
		this.room =room;
		id = objectID++;
	}
	
	/**
	 * 
	 * @param meetingRoom
	 * Copy constructor to perform shallow copy.
	 */
		public MeetingRoom(MeetingRoom meetingRoom){
					this.room = meetingRoom.room;
					id = objectID++;	
				}
	
		/**
		 * @return room
		 */
	public String getRoom() {
		return room;
	}
	
	/**
	 * @param room
	 * to set the room
	 */
	public void setRoom(String room) {
		this.room=room;
		
	}
	
	/**
	 * 
	 * @param room
	 * Set the room
	 */
	public void setDetails(String room){
		this.room = room;
		this.id = id;
	}
	
	/**
	 * Clone method
	 */
	public Object clone(){
		MeetingRoom meetingRoom = new MeetingRoom(this);
		return meetingRoom;
	}
	
	
	
	/**
	 * Get description of Meeting Room.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder(room);//to format the entered string
		sb.insert(2, '-');
		String sb2 = sb.toString();
		return "Room: "+sb2.toUpperCase();
	}
	
	
	/**
	 * CompareTo method that provides natural ordering on room.
	 */
	public int compareTo(Object obj) {
		MeetingRoom meet = (MeetingRoom) obj;
		if(meet == null)
			return 1;
		else 
	    return room.compareTo(room);
	}
}
