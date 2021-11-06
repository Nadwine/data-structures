/**
 *This class will hold all the appointment details.
 * @author Nadwine Louis
 *
 */


public class Appointment implements Comparable, Cloneable{
	
// Declaring attributes
	
private String name; //Who to meet
Date date; //Date of the appointment
private Time time; // Time of the appointment
private MeetingRoom meetingRoom; //Where to meet
private String purpose; // Purpose of the appointment
private static int objectID = 100;
private int id;

/**
 * Default constructor.
 */
public Appointment(){
	name = "";
	purpose = "";
	date = new Date();
	time= new Time();
	meetingRoom= new MeetingRoom();
	this.purpose=purpose;
	id = objectID++;
	
}

/**
 * Create appointment object using data passed by the parameters.
 * @param name
 * @param day
 * @param month
 * @param year
 * @param hour
 * @param minute
 * @param room
 * @param purpose
 */
public Appointment(String name, int day, int month, int year, int hour, int minute, String room, String purpose) {
	this.name = name;
	this.date = new Date(day,month,year);
	this.time = new Time(hour, minute);
	this.meetingRoom = new MeetingRoom(room);
	this.purpose=purpose;
	id = objectID++;
}

/**
 * 
 * @param appointment
 * Copy constructor to perform shallow copy
 */
public Appointment(Appointment appointment){
	this.name = appointment.name;
	this.date = appointment.date;
	this.time = appointment.time;
	this.meetingRoom=appointment.meetingRoom;
	this.purpose = appointment.purpose;
	id = objectID++;	
}

/**
 * Clone method
 */
public Object clone(){
	// get a shallow copy
	Appointment a = new Appointment(this);

	// Clone any object references (deep copy)
	a.date = (Date) date.clone();
	a.time = (Time) time.clone();
	a.meetingRoom = (MeetingRoom) meetingRoom.clone();
	return a;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name
 * the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return purpose
 */
public String getPurpose() {
	return purpose;
}

/**
 * @param purpose
 * the purpose to set
 */
public void setPurpose(String purpose) {
	this.purpose = purpose;
}

/**
 * @return date
 */
public Date getDate() {
	return date;
}


/**
 * @param day
 * @param month
 * @param year
 * Set the details of Date.
 */
public void setDate(int day, int month, int year){
	date.setDetails(day, month, year);
}

/**
 * @param hour
 * @param minute
 * Set the time.
 */
public void setTime(int hour, int minute) {
	time.setDetails(hour,minute);
}

/**
 * Get description of the Appointment 
 */
public String toString(){
	return ("[ <-" + id + "-> " + name +", "+ " " + date + " " + time + " "+ meetingRoom + " "+ "Purpose: "+ purpose + "]");
}


/**
 * @return time
 */
public Time getTime() {
	return time;
}


/**
 * 
 * @return meetingRoom
 */
public MeetingRoom getMeetingRoom() {
	return meetingRoom;
}


/**
 * 
 * @param room
 * Set the room
 */
public void setMeetingRoom(String room) {
	meetingRoom.setDetails(room);
	}

/**
 * CompareTo method that provides the natural ordering on date.
 */
public int compareTo(Object obj) {
	Appointment app = (Appointment) obj;
	if(app == null)
		return 1;
	else {
    return this.getDate().toString().compareToIgnoreCase(app.getDate().toString());
	}
}


}


