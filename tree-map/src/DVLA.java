import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
/**
 * This class will store information on cars. It will store the month that the current taxation
 * ends, car owner and registration number.
 * @author Nadwine Louis
 *
 */
public class DVLA {

	HashMap<RegNo, Keeper> hashMapRegKeeper = new HashMap<RegNo, Keeper>();
	HashMap<RegNo, Car> hashMapRegCar = new HashMap<RegNo, Car>();

	List<String> allReminders = new LinkedList<>();
	List<String> allWarnings = new LinkedList<>();
	
	/**
	 * Default constructor.
	 */
	public DVLA() {
		
	}
	
	/**
	 * Set all the attribute values based on parameter values.
	 * @param hashMapRegKeeper
	 * @param hashMapRegCar
	 * @param allReminders
	 * @param allWarnings
	 */
	public DVLA(HashMap<RegNo, Keeper>hashMapRegKeeper, HashMap<RegNo, Car>hashMapRegCar,List<String>allReminders, List<String>allWarnings ) {
	this.hashMapRegKeeper=hashMapRegKeeper;
	this.hashMapRegCar=hashMapRegCar;
	this.allReminders=allReminders;
	this.allWarnings=allWarnings;	
	}

	/**
	 * Display registration numbers and car details from a HashMap.
	 * @param hashMapRegCar
	 */
	public void showAllCars(HashMap<RegNo, Car> hashMapRegCar) {
		//Instantiate an iterator over the map to use for loop
		Iterator<Entry<RegNo, Car>> iterator = hashMapRegCar.entrySet().iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next().toString());
		}
	}

	/**
	 * Display registration numbers and car owner details from a HashMap.
	 * @param hashMapRegKeeper
	 */
	public void showAllKeepers(HashMap<RegNo, Keeper> hashMapRegKeeper) {
		//Instantiate an iterator over the map to use for loop
		Iterator<Entry<RegNo, Keeper>> iterator = hashMapRegKeeper.entrySet().iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next().toString());
		}
	}

	/**
	 * Send reminders.
	 * @param reminderMonth
	 * @return all reminders
	 */
	public List<String> sendReminder(int reminderMonth) {
		if (reminderMonth > 0 && reminderMonth < 13) {

			// iterate over registration numbers stored as keys to store as a value for
			// second HashMap search
			for (RegNo key1 : hashMapRegCar.keySet()) {

				if (hashMapRegCar.get(key1).getTaxExpiresEndMonth().getMonth() == reminderMonth) {

					RegNo currentRegNo = key1;
					for (RegNo key2 : hashMapRegKeeper.keySet()) {

						if (currentRegNo == key2) {
							Car car = hashMapRegCar.get(key1);
							Keeper keeper = hashMapRegKeeper.get(key2);
							String message = "Hi " + keeper.toString() +","+ " your registration for " + car
									+ " with registation number " + currentRegNo + " will expire soon.";
							allReminders.add(message);
						}

					}
				}
			}
		}
		System.out.println("\n ============================ Printing Reminder Send Log ====================== \n");
		for (String s : allReminders) {
			System.out.println(s);
		}
		return allReminders;
	}

	/**
	 * Send warning if registration expires.
	 * @param expirationMonth
	 * @return all warnings.
	 */
	public List<String> sendWarning(int expirationMonth) {
		if (expirationMonth > 0 && expirationMonth < 13) {

			//iterate over registration numbers stored as keys to store as a value for second HashMap search
			for (RegNo key1 : hashMapRegCar.keySet()) {

				if (hashMapRegCar.get(key1).getTaxExpiresEndMonth().getMonth() < expirationMonth) {

					RegNo currentRegNo = key1;
					for (RegNo key2 : hashMapRegKeeper.keySet()) {

						if (currentRegNo == key2) {
							Car car = hashMapRegCar.get(key1);
							Keeper keeper = hashMapRegKeeper.get(key2);
							String message = "Hi " + keeper.toString() + ","+" your registration for" + car
									+ " with registation number " + currentRegNo + " has been expired.";
							allWarnings.add(message);
						}

					}
				}
			}
		}
		System.out.println("\n ============================ Printing Warning Send Log ====================== \n");
		for (String s : allWarnings) {
			System.out.println(s);
		}
		return allWarnings;
	}

	/**
	 * Saves all the reminder letters sent to car owners on a flash drive.
	 * @throws IOException
	 */
	public void writeReminderFile() throws IOException {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object to read input
	    System.out.println("Enter the drive letter to write file to: ");
	    String driveLetter = myObj.nextLine();
	    FileOutputStream fos = null;
	    File file;
	    for (String s : allReminders) {
	    	byte[] bytesArray = s.getBytes();
	    	file = new File(driveLetter+":/reminders.txt");
	    	fos = new FileOutputStream(file);
	    	if (!file.exists()) {
	   	     file.createNewFile();
	   	  }
	    	fos.write(bytesArray);
	   	    fos.flush();
	   	    System.out.println("Suessfully wrote 1 reminder file to: " +file.toString());
	   	    fos.close();
		}

	}
	
	/**
	 * Saves all the warning letters sent to car owners on a flash drive.
	 * @throws IOException
	 */
	public void writeWarningFile() throws IOException {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object to read input
	    System.out.println("Enter the drive letter to write file to: ");
	    String driveLetter = myObj.nextLine();
	    FileOutputStream fos = null;
	    File file;
	    for (String s : allWarnings) {
	    	byte[] bytesArray = s.getBytes();
	    	file = new File(driveLetter+":/warnings.txt");
	    	fos = new FileOutputStream(file);
	    	if (!file.exists()) {
	   	     file.createNewFile();
	   	  }
	    	fos.write(bytesArray);
	   	    fos.flush();
	   	    System.out.println("Suessfully wrote 1 to warning file to: "+ file.toString());
	   	    fos.close();
		}

	}

	/**
	 * Read the reminder file from a flash drive.
	 * @param month
	 * @throws IOException
	 */
	public void readReminderFile(int month) throws IOException {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object to read input
	    System.out.println("Enter the drive letter to read file from: ");
	    String driveLetter = myObj.nextLine();
	    
	    Path path = Paths.get(driveLetter+":/reminders.txt"); // absolute path as a java Path Object
	    String reminders = Files.readString(path, StandardCharsets.US_ASCII);
	    System.out.println("Reading reminders from drive: " + driveLetter);
	    System.out.println(reminders);
	   
	}
	
	/**
	 * Read the warning file from a flash drive.
	 * @param month
	 * @throws IOException
	 */
	public void readWarningFile(int month) throws IOException {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object to read input
	    System.out.println("Enter the drive letter to read file from: ");
	    String driveLetter = myObj.nextLine();
	    
	    Path path = Paths.get(driveLetter+":/warnings.txt");// absolute path as a java Path Object
	    String warnings = Files.readString(path, StandardCharsets.US_ASCII);
	    
	    System.out.println("Reading warnings from drive: " + driveLetter);
	    System.out.print(warnings);
	   
	}
}