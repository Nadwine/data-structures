/**
 * This class will test that the reminder letters and warning letters can be sent to the 
 * appropriate keeps on any given month. 
 * @author Nadwine Louis
 *
 */
public class Test004 {

	public static void main(String[] args) {

		Car c1 = new Car("Ford", "Focus", "red", Month.January);
		Car c2 = new Car("Tesla", "Model-S", "white", Month.January);
		Car c3 = new Car("Mercedes", "Benz", "black", Month.March);

		Address ad1 = new Address("21 Street", "Leeds", "LS1 5HT");
		Address ad2 = new Address("30 Road", "Birmingham", "BR5 9BD");
		Address ad3 = new Address("10 Lane", "Glasgow", "GL3 7YT");

		Keeper kp1 = new Keeper("Jordan", "Walsh", ad1);
		Keeper kp2 = new Keeper("Lenny", "Kompton", ad2);
		Keeper kp3 = new Keeper("Sam", "Stone", ad3);

		RegNo reg1 = new RegNo("LS102543");
		RegNo reg2 = new RegNo("BR578284");
		RegNo reg3 = new RegNo("GL245768");

		DVLA dvla = new DVLA();
		
		dvla.hashMapRegCar.put(reg1, c1);
		dvla.hashMapRegCar.put(reg2, c2);
		dvla.hashMapRegCar.put(reg3, c3);
		
		dvla.hashMapRegKeeper.put(reg1, kp1);
		dvla.hashMapRegKeeper.put(reg2, kp2);
		dvla.hashMapRegKeeper.put(reg3, kp3);
		
		dvla.sendReminder(1);
		
		dvla.sendWarning(4);

	}

}
