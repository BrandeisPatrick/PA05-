package lesson19;
/*
 * This class runs the simulation a number of times and 
 * out prints results from it
 */

public class AnalyzeSimulation {

	public static int days = 0;
	public static int sick = 0;
	public static int maxInfected = 0;


	private static int MAX_TICKS=1000;

	public static void main(String[] args) {

		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		int numStayHome = Integer.parseInt(args[2]);
		int numEssential = Integer.parseInt(args[3]);
		int numSkeptic = Integer.parseInt(args[4]);
		int numFreqFlier = Integer.parseInt(args[5]);
		int numCompromised = Integer.parseInt(args[6]);
		int iterations = Integer.parseInt(args[7]);



		//population = new Population(numPeople);
		//population = new AllStayAtHome(numPeople);
		//int numEssential = numPeople/10;
		//int numOther = numPeople/20;
		//int numStayHome = numPeople - numEssential - numOther;

		for (int i = 0; i < iterations; i++) {
			System.out.println("Run: " + (i+1));
			// next we create the population and the country
			Population population;
			population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFreqFlier, numCompromised);
			population.createPeople();

			Country country = new Country(width,height);
			// and add a link to the population in the country
			country.population = population;
			// next we place the people into the country randomly
			population.placePeople(country);

			for(int k=0;k<MAX_TICKS; k++) {
				country.simulateOneStep();
				days++;
				if (country.numInfected==0) {
					break;
				}
				if (country.numInfected > maxInfected) {
					maxInfected = country.numInfected;
				}
			}

			sick = sick + country.numInfected + country.numRecovered;
			System.out.println("days: " + days + " sick: " + sick + " maxinfected: " + maxInfected);
		}
		System.out.println("total num days: " + days + ", Average number of days until no new infections: " + (days/iterations));
		System.out.println("total num infected: " + sick + ", Average number of people infected/recovered: " + (sick/iterations));
		System.out.println("The max number of people infected at any one time was: " + maxInfected);
	}
}

