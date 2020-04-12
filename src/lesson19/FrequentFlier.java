package lesson19;
//New Class for Part II
import java.util.Random;

public class FrequentFlier extends Person {

	private Random random = new Random();

	public FrequentFlier() {
		super();
	}

	//Tries to move to any open spot on the board
	public void tryToMove() {

	      int i = random.nextInt(country.places.length);
	      int j = random.nextInt(country.places[i].length);
	      while (country.places[i][j] != null) {
	        // loop to make sure it is an open space ...
	        i = random.nextInt(country.places.length);
	        j = random.nextInt(country.places[i].length);
	      }
	      //System.out.println("placing "+p.id+" at "+i+","+j);

	      this.setPosition(i,j);
	    }
	}
