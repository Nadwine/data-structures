import java.util.Comparator;
/**
 * This class will be the Comparator class that will be used to compare the priorities of the flights.
 * @author Nadwine Louis
 *
 */
public class SortingByPriority implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {//compares two flights for order.
		Flight f1 = (Flight) o1;
		Flight f2 = (Flight) o2;
		return f2.getPriority()- f1.getPriority();
	
	}

}