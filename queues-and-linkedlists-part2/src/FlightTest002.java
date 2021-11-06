import java.util.LinkedList;
/**
 * This class will create a number of flights, join them to the queue, with or without maintaining priority order.
 * @author Nadwine Louis
 *
 */
public class FlightTest002 {
	public static void main(String[] args) {
		//Create number of flights.

		NormalFlightQueue queue = new NormalFlightQueue();
		PriorityFlightQueue1 queue1 = new PriorityFlightQueue1();
		PriorityFlightQueue2 queue2 = new PriorityFlightQueue2();

		Flight f1 = new Flight("ab123", 1);
		Flight f2 = new Flight("cd234", 2);
		Flight f3 = new Flight("ef456", 3);
		Flight f4 = new Flight("gh678", 4);
		Flight f5 = new Flight("ij910", 5);
		Flight f6 = new Flight("kl111", 6);
		Flight f7 = new Flight("mn123", 9);
		Flight f8 = new Flight("op321", 8);
		Flight f9 = new Flight("qr987", 7);
		
		/*---------------------------------------------------------------------
		|  NormalFlightQueue will not maintain priority order.
		*-------------------------------------------------------------------*/
		System.out.println("=======================================================================================================================");
		System.out.println(" ----------------------------------------- Printing the Normal Queue --------------------------------------------------");
		System.out.println();
		System.out.println(f1 + " joined the queue");
		queue.joinQueue(f1);
		queue.display();
		
		System.out.println(f3 + " joined the queue");
		queue.joinQueue(f3);
		queue.display();
		
		System.out.println(f2 + " joined the queue");
		queue.joinQueue(f2);
		queue.display();
		
		System.out.println(f4 + " joined the queue");
		queue.joinQueue(f4);
		queue.display();
		
		System.out.println(f6 + " joined the queue");
		queue.joinQueue(f6);
		queue.display();
		
		System.out.println(f5 + " joined the queue");
		queue.joinQueue(f5);
		queue.display();
		
		System.out.println(f7 + " joined the queue");
		queue.joinQueue(f7);
		queue.display();
		
		System.out.println(f8 + " joined the queue");
		queue.joinQueue(f8);
		queue.display();

		System.out.println(f9 + " joined the queue");
		queue.joinQueue(f9);
		queue.display();
		System.out.println();
		
		//clear flights test
		//queue.clear();

		System.out.println("***Landing all the flights:***");
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.landFlight();
		queue.display();
		
		

		/*---------------------------------------------------------------------
		|  PriorityFlightQueue1 will maintain priority order.
		*-------------------------------------------------------------------*/
		System.out.println("=======================================================================================================================");
		System.out.println(" ----------------------------- Printing Priority Queue using the collections.sort method ------------------------------");
		System.out.println();
		System.out.println(f1 + " joined the queue");
		queue1.joinQueue(f1);
		queue1.display();
		
		System.out.println(f2 + " joined the queue");
		queue1.joinQueue(f2);
		queue1.display();

		System.out.println(f3 + " joined the queue");
		queue1.joinQueue(f3);
		queue1.display();

		System.out.println(f4 + " joined the queue");
		queue1.joinQueue(f4);
		queue1.display();

		System.out.println(f5 + " joined the queue");
		queue1.joinQueue(f5);
		queue1.display();

		System.out.println(f6 + " joined the queue");
		queue1.joinQueue(f6);
		queue1.display();
		
		System.out.println(f7 + " joined the queue");
		queue1.joinQueue(f7);
		queue1.display();
		
		System.out.println(f8 + " joined the queue");
		queue1.joinQueue(f8);
		queue1.display();

		System.out.println(f9 + " joined the queue");
		queue1.joinQueue(f9);
		queue1.display();
		System.out.println();
		
		System.out.println("***Landing all the flights:***");
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.landFlight();
		queue1.display();

		/*---------------------------------------------------------------------
		|  PriorityFlightQueue2 will maintain priority order
		*-------------------------------------------------------------------*/
		System.out.println("=======================================================================================================================");
		System.out.println(" ----------------------------- Printing Priority Queue without using a comparator -------------------------------------");
		System.out.println();
		System.out.println(f3 + " joined the queue");
		queue2.joinQueue(f3);
		queue2.display();

		System.out.println(f2 + " joined the queue");
		queue2.joinQueue(f2);
		queue2.display();
	
		System.out.println(f1 + " joined the queue");
		queue2.joinQueue(f1);
		queue2.display();

		System.out.println(f6 + " joined the queue");
		queue2.joinQueue(f6);
		queue2.display();

		System.out.println(f5 + " joined the queue");
		queue2.joinQueue(f5);
		queue2.display();

		System.out.println(f4 + " joined the queue");
		queue2.joinQueue(f4);
		queue2.display();

		System.out.println(f7 + " joined the queue");
		queue2.joinQueue(f7);
		queue2.display();

		System.out.println(f8 + " joined the queue");
		queue2.joinQueue(f8);
		queue2.display();

		System.out.println(f9 + " joined the queue");
		queue2.joinQueue(f9);
		queue2.display();
		
		System.out.println("***Landing all the flights:***");
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.landFlight();
		queue2.display();
	

	}
}
