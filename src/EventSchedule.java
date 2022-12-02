import java.time.LocalDate;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Neeraj Katewa. 
 */


/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * @see  java.time.LocalDate
 * @version 1
 * @author Neeraj Katewa
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of
	 */
	private int month;
	
	/**
	 * day component of the date of
	 */
	private int day;
	/**
	 * Creating a local instance of LocalDate
	 */
	static LocalDate localDate=LocalDate.now();
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		this(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		System.out.println("EventSchedule() was called");

	}
	
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	
	public EventSchedule(int year) {
		this(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		System.out.println("EventSchedule(int) was called");
		setyear(year);
	}
	
	
	/**
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
	public EventSchedule(int year,int month)
	{
		this(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		System.out.println("EventSchedule(int,int) was called");
		setyear(year);
		setMonth(month);
	}

	/**
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */	
	
	public EventSchedule(int year, int month, int day) {
		System.out.println("EventSchedule(int,int,int) was called");
		setday(day);
		setyear(year);
		setMonth(month);
	}
	
	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}
	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}
	/**
	 * Return the month for this EventSchedule
	 * @return the month for this EventSchedule 
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */
	
	public void setMonth(int month) {
		this.month=month;
	}
	
	/**
	 * Return the day for this EventSchedule
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}
	
	/**
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
