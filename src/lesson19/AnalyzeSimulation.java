package lesson19;
/*
 * This class runs the simulation a number of times and
 * prints out results from it (Part IV)
 */

import java.util.Random;

public class AnalyzeSimulation {

	public static int days = 0;
	public static int sick = 0;
	public static int maxInfected = 0;
	//Variables that will be printed

	private static int MAX_TICKS=1000;
	private Random random = new Random();


	public static void main(String[] args) {
		int totalDays = 0;
		int totalSick = 0;

		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		int numStayHome = Integer.parseInt(args[2]);
		int numEssential = Integer.parseInt(args[3]);
		int numSkeptic = Integer.parseInt(args[4]);
		int numFreqFlier = Integer.parseInt(args[5]);
		int numCompromised = Integer.parseInt(args[6]);
		int iterations = Integer.parseInt(args[7]);
		//Input parameters for Country, number of iterations for analysis, and number of each type of people

		//run a given number of trials
		for (int i = 0; i < iterations; i++) {
			System.out.println("Run: " + (i+1));

			//create the population and the country
			Population population;
			population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFreqFlier, numCompromised);
			population.createPeople();

			Country country = new Country(height,width);
			// add population in the country
			country.population = population;
			// place the people into the country randomly
			population.placePeople(country);

			//move for MAX_TICKS steps, then stop
			for(int k=0;k<MAX_TICKS; k++) {
				country.simulateOneStep();
				days++;
				//Adds up the total number of days
				if (country.numInfected==0) {
					break;
					//End of one simulation/iteration
				}
				if (country.numInfected > maxInfected) {
					maxInfected = country.numInfected;
					//Keeps track of the maximum number of people infected at any time
				}
			}

			sick += country.numInfected + country.numRecovered;
			totalSick += sick; //Total number of sick people in all simulations
			totalDays += days; //Total number of days in all simulations
			System.out.println("days: " + days + " sick: " + sick + " maxinfected: " + maxInfected);
		}
		System.out.println();
		System.out.println("total num days: " + totalDays + ", Average number of days until no new infections: " + (totalDays/iterations));
		System.out.println("total num infected: " + totalSick + ", Average number of people infected/recovered: " + (totalSick/iterations));
		System.out.println("The max number of people infected at any one time was: " + maxInfected);
	}
}
