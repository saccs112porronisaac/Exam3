import java.util.Scanner; 

public class Dice {
public static void main(String[] args) {
		
		Scanner game = new Scanner(System.in);
		
				// My variables
				int dice;// dice 1 ,2, or 3?
				String userGuess;// high or low?
				int GamesPlayed = 1;// will count how many times the user has played
				String Playagain;
				boolean Game = true;
				int points = 0;
				int middleValue = 0;
				
				// user input
				System.out.println("how many dices you want to play with between 1-3: ");
				dice = game.nextInt();

				do {
					// Based off of dice it will call upon one of 3 if statements
					if (dice == 1 || dice == 2 || dice == 3)
					{

						System.out.println("guess high/mid/low?");
						userGuess = game.next();
						
						//System.out.println("\n midpoint guess?");
						//midpointGuess = key.nextInt();
						
						if (dice == 1)
						{
							middleValue = 3;
						}
						if (dice == 2)
						{
							middleValue = 6;
						}
						if (dice == 3)
						{
							middleValue = 9;
						}

						diceGame guy = new diceGame(dice, userGuess, middleValue); // calls oneDice class and gives it values to work with
						guy.output(); // calls the output
						points += guy.getPoints();
						

					} 
					
					else 
					{
						System.out.println("either 1,2, or 3, dices...no more..no less..");
					}

					System.out.println("\n play/try again?? (y/n)");
					Playagain = game.next();

					if (Playagain.equals("y")) {
						GamesPlayed++; // counts times played and decides to play again or not
					} else {
						System.out.println("\n ok, goodbye..");
						System.out.println("times played:" + GamesPlayed);
						System.out.println("\n points:" + points);
						Game = false; // sets the boolean ( playing game ) to false therefore ending it
					}
				} while (Game == true);// if ( playingGame ) is still true.. it will keep playing
				game.close();

		
		
		
		
	}//ends Main

} //ends HighLowGame Class

