/**
 * Class Omega
 * @author John Shields - G00348436
 * @version 1.0
 */
package ie.gmit.sw;
/**
 * all methods from Delta, Zeta and Epsilon are now here
 * Omega uses the interface AlphaAndOmega to implement the methods of Delta, Zeta and Epsilon
 * 0mega can handle more complex situations
 */
public class Omega implements AlphaAndOmega {
	// fields and methods
	@Override
	public int omega(String value) {
		System.out.println("Omega");
		return value.length();
	}
	@Override
	public int delta(String value) {
		System.out.println("Delta");
		return value.hashCode();
	}
	@Override
	public int zeta(String value) {
		System.out.println("Zeta");
		return Integer.parseInt(value) + 7;
	}
	@Override
	public int epsilon(String value) {
		System.out.println("Epsilon");
		return value.length();
	}
}
