//New Class for Part I
//Subclass of Person
package lesson19;
public class Skeptic extends Person{

	/*
	Constructor
	 */
	public Skeptic() {
		// TODO Auto-generated constructor stub
		super();
	}

	/*
	Skeptic people try to move randomly at every tick
	New spot is next to old spot
	 */
	public void tryToMove() {
		//Overrides abstract method in Person
		super.tryToMoveRandomly();

	}


}
