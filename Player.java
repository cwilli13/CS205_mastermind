/* C. Ryan Williams 1/27/14
	
Set Player class. Will include;
	- string name
	- int wins
	- int losses
	 */

import java.util.Scanner;
/*import java.util.*; */

public class Player{

	private String name;
	private int wins = 0;
	private int losses = 0;

	Scanner userInput = new Scanner(System.in);

	public Player(){
		System.out.println("Creating Player...");
		
		/* Get user's name */
		setName();

		System.out.println("\n\n\nWelcome to Mastermind " + name + ".");
		System.out.println("\nYour record:");
		System.out.println("Wins - " + wins);
		System.out.println("Losses - " + losses + "\n");

	}

	public String setName(){
		System.out.println("Enter Your Name:");
		name = userInput.nextLine();

		return name;
	}

	public String getName(){

		return name;
	}

	public int setWins(){
		wins++;

		return wins;
	}

	public int getWins(){
		return wins;
	}

	public int setLosses(){
		losses++;

		return losses;
	}
	public int getLosses(){
		return losses;
	}

}