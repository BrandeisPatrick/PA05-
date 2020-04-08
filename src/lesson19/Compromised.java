package lesson19;
//New Class for Part III
/**
 * @author mac
 *
 */
public class Compromised extends Person {

	/**
	 * @param x
	 * @param y
	 * @param country
	 */
	public Compromised() {
		super();

		// TODO Auto-generated constructor stub
		double n = 0.75;
		super.setinfectionProb(n);
	}

	@Override
	public void tryToMove() {
		super.tryToMoveRandomly();
	}

}
