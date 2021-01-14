package ie.gmit.sw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Alpha {
	private Beta beta = new Beta();
	private Gamma gamma = new Gamma();
	private Delta delta = new Delta();
	private Epsilon epsilon = new Epsilon();
	private Zeta zeta = new Zeta();
	
	public Object alpha(Status s) {
		//Beta and Gamma only deal with Status values of Slight, Low and Medium 
		if (s == Status.Slight || s == Status.Low) {
			return beta.beta();
		}else if (s == Status.Medium) {
			return gamma.gamma();
		}else {
			//Delta, Epsilon and Zeta handle more complex situations
			DayOfWeek day = LocalDate.now().getDayOfWeek();
			return switch (day) {
				case MONDAY, TUESDAY -> delta.delta(day.name());
				case WEDNESDAY, THURSDAY -> epsilon.epsilon(day.name());
				case FRIDAY -> zeta.zeta(day.name());
				case SATURDAY -> Integer.valueOf((delta.delta(day.name()) + epsilon.epsilon(day.name()))); 
				case SUNDAY -> Integer.valueOf((epsilon.epsilon(day.name()) + zeta.zeta(day.name())));
			};			
		}
	}
}