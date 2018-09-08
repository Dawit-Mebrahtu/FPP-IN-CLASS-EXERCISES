package lesson3.exercise_1;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Date date = dateFromLocalDate(LocalDate.of(1970, 1, 2));
	//	int numHours = -1; //implement
		//output numHours to the console
		
		long numHours = date.getTime()/(60 * 60 * 1000);
		
		System.out.println(numHours);
		
		date = dateFromLocalDate(LocalDate.of(1970, 1, 3));
		numHours = date.getTime()/(60 * 60 * 1000);		
		System.out.println(numHours);
	}

	public static Date dateFromLocalDate(LocalDate localDate) {
		//implement
		GregorianCalendar cal = new GregorianCalendar(localDate.getYear(), localDate.getMonthValue() - 1, localDate.getDayOfMonth());
		Date d = cal.getTime();
		
		return d;
	}
}
