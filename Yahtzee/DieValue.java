package Test;


/**
 * The Class dieValue.
 */
public class DieValue {

	/** The roll. */
	Roll roll = new Roll();
	
	/** The val 1. */
	int val1;
	
	/** The val 2. */
	int val2;
	
	/** The val 3. */
	int val3;
	
	/** The val 4. */
	int val4;
	
	/** The val 5. */
	int val5;
	
	/**
	 * Gets the d1.
	 *
	 * @return the d1
	 */
	public int getD1() {
		val1 = roll.roll();
		return (val1);
	}
	
	/**
	 * Gets the d2.
	 *
	 * @return the d2
	 */
	public int getD2() {
		val2 = roll.roll();
		return (val2);
	}
	
	/**
	 * Gets the d3.
	 *
	 * @return the d3
	 */
	public int getD3() {
		val3 = roll.roll();
		return (val3);
	}
	
	/**
	 * Gets the d4.
	 *
	 * @return the d4
	 */
	public int getD4() {
		val4 = roll.roll();
		return (val4);
	}
	
	/**
	 * Gets the d5.
	 *
	 * @return the d5
	 */
	public int getD5() {
		val5 = roll.roll();
		return (val5);
	}
	

	
}
