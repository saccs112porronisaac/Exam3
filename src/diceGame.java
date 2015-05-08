
	import java.util.Scanner;
public class diceGame {

	Scanner dice = new Scanner(System.in);

	private int Value;
	private int Total;
	private int game;
	private String guess;
	//private int midGuess;
	int points = 0 ; 

	// Constructor
	public diceGame(int dice, String userGuess, int highOrLow ) 
	{
		for (int i = 0; i < dice; i++)// generates dice/dice's value
		{
			Value = 1 + (int) (Math.random() * 6);
			Total += Value;
		}
		
		guess = userGuess;
		game = highOrLow;
		//midGuess = mGuess;
	}

	// Get the Dice Value
	public int getDiceValue() 
	{
		return Value;
	}
	
	
	

	// Will return if the user is too low, too high, or just right
	public void hiAndLow() 
	{
		if (Total >= game && guess.equals("hi"))
		{
			System.out.println("you guessed correctly ");
			System.out.print("ComputerGuess: " + Total);
			points++;
		}
		else if (Total <= game && guess.equals("low"))
		{
			System.out.println("your right ");
			System.out.print("ComputerGuess: " + Total);
			points++;
		}
		else if (Total == game && guess.equals("mid"))
		{
			System.out.println("you guessed correctly ");
			System.out.print("ComputerGuess: " + Total);
			points += 5;
		}
		else 
		{
			System.out.println("you guessed incorrectly ");
			System.out.print("ComputerGuess: " + Total);
			points += -1;
		}
		
		
		
	}
	
	public int getPoints() 
	{
		return points; // returns points to main 
	}

	// Output
	public void output() 
	{
		System.out.println("\nyour guess: " + guess);
		hiAndLow();
		
		
	}
}


