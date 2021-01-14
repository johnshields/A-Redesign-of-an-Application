/**
 * Class Alpha
 * @author John Shields - G00348436
 * @version 1.1
 */
package ie.gmit.sw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Alpha {
	/**
	 * fields and methods
	 * The method alpha() returns an instance of Object based on a Status and DayOfWeek
	 */
	private Beta beta = new Beta();
    private Gamma gamma = new Gamma();
    private AlphaAndOmega omega = new Omega();

    public Object alpha(Status s) {
        /**
         * Beta and Gamma only deal with Status values of Slight, Low and Medium
         */
        if (s == Status.Slight || s == Status.Low) {
            return beta.beta();
        } else if (s == Status.Medium) {
            return gamma.gamma();
        } else {
            /**
             * 0mega can handle more complex situations
             */
            DayOfWeek day = LocalDate.now().getDayOfWeek();
            return switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
                        FRIDAY, SATURDAY, SUNDAY -> omega.omega(day.name());
            };
        }
    }
}