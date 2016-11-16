/* SportsEvent.java
 * Kenton Duprey
 * AP Computer Science A
 * Mr. Blondin
 * 11/4/13
 */
 
import java.util.*;

public class SportsEventDuprey
{
    // instance variables
    private double[] scores = new double[8]; 

    /* This method prompts the user to enter in 8 scores and stores
     * them in the array scores.
     */
    public void readScores()
    {
    	Scanner scan = new Scanner(System.in);
    	
		// implemented by you
		for (int i = 0; i<scores.length; i++)
		{
			System.out.print("Enter score #" + (i+1) + ": ");
			scores[i] = scan.nextDouble();
		}
    }
	
    /* Determines which score in scores is the lowest
     * @return the lowest score in scores
     */
    public double lowest()
    {
		
		// implemented by you 
		double minimum = Double.MAX_VALUE;
		for (int i = 0; i<scores.length; i++)
		{
			if(scores[i] < minimum)
				minimum = scores[i];
		}
		return minimum;
    }
	
	/* Determines which score in scores is the highest
     * @return the highest score in scores
     */
    public double highest()
    {
		// implemented by you
		double maximum = Double.MIN_VALUE;
		for (int i = 0; i<scores.length; i++)
		{
			if(scores[i] > maximum)
				maximum = scores[i];
		}
		
		return maximum;
    }
	
    /* Calculates the average of scores with the lowest and highest scores
     * thrown out.
     * @return the average
     */
    public double average()
    {
        // implemented by you 
        double sum = 0;
        for (int i = 0; i<scores.length; i++)
        {
        	sum = sum + scores[i];
        }
        sum = sum - (highest() + lowest());
		double average = sum / (scores.length - 2);
		return average;

    }

    /* This method prints a summary report which includes the original list of
     * scores, the average of the scores, the lowest score, and the highest
     * score.
     */
    public void printSummary()
    {
		// implemented by you 
		System.out.println("	Summary");
		System.out.println("-------------------------------");
		System.out.println("Scores: " + scores[0] + " " + scores[1] + " " + scores[2] + " " + scores[3] + " " + 
		scores[4] + " " + scores[5] + " " + scores[6] + " " + scores[7]);
		System.out.println("Lowest Score: " + lowest());
		System.out.println("Highest Score: " + highest());
		System.out.println("Average Score: " + average());
    }

    public static void main(String[] args)
    {
        SportsEventDuprey app = new SportsEventDuprey();
        app.readScores();
        app.printSummary();
    }
}
