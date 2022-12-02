
/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Neeraj Katewa
 */
public class TestDemo extends EventSchedule {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	
	public static void main(String[] args) {
		System.out.println("Just creating 4 EventSchedules");
		System.out.println("EventSchedule1");
		EventSchedule eventSchedule1 = new EventSchedule();
		System.out.println(eventSchedule1.createReport());
		System.out.println("EventSchedule2");
		EventSchedule eventSchedule2 = new EventSchedule(2023);
		System.out.println(eventSchedule2.createReport());
		System.out.println("EventSchedule3");
		EventSchedule eventSchedule3 = new EventSchedule(2023,12);
		System.out.println(eventSchedule3.createReport());
		System.out.println("EventSchedule4");
		EventSchedule eventSchedule4 = new EventSchedule(2023,12,15);
		System.out.println(eventSchedule4.createReport());
		
	
	}

}
