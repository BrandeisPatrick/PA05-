package lesson19;
//New Class for Part III
/**
This new class of Person has an increased risk for becoming infected
the setInfectionProb is higher. No other changes to the super class.
 */
public class Compromised extends Person {
	
	public Compromised() {
		super();

		// TODO Auto-generated constructor stub
		double n = 0.75;
		super.setinfectionProb(n);
	}

	//Overrides super class
	public void tryToMove() {
		super.tryToMoveRandomly();
	}

}
