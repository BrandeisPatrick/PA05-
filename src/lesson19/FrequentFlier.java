//New Class for Part II
package lesson19;
import java.util.Random;

public class FrequentFlier extends Person {
	private Random random = new Random();

	/*
	Constructor
	 */
	public FrequentFlier() {
		super();
	}


	/*
	@Overrides
	Frequent Flyer will move to a random available spot every tick
	Random spot doesn't have to be next to previous spot
	 */
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
				//Places FrequentFlier in new location
	    }
	}
