package lesson19;
//No Changes

public class StayAtHomeIfSick extends Person{


	public StayAtHomeIfSick() {
		super();
	}

	public void tryToMove() {

    if (!this.infected){
      super.tryToMoveRandomly();
    }
	}

}
