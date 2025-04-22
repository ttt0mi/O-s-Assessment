import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsModded{
	public static void main(String... args) {
	Scanner input = new Scanner(System.in);
	Random rnumber = new Random(); 

	int userWinCounter = 0;
	int compWinCounter = 0;

	while(userWinCounter != compWinCounter + 3  && userWinCounter + 3 != compWinCounter ) {

		System.out.print("Choose Scissors(0), Rock(1) or Paper(2): ");
		int answer = input.nextInt();
		int compNum = rnumber.nextInt(3);
	
		if(compNum == 0) System.out.print("The Computer Chooses Scissors, ");
		else
		if(compNum == 1) System.out.print("The Computer Chooses Rock, ");
		else{
			System.out.print("The Computer Chooses Paper, ");
		}
	
		if(answer == 0) System.out.print("You Choose Scissors, ");
		else
		if(answer == 1) System.out.print("You Choose Rock, ");
		else
		if(answer == 2) System.out.print("You Choose Paper, ");
		else{
			System.out.print("Invalid c`mon! just 0s, 1s and 2s mate");
		}
	
		if(compNum == answer) System.out.println("It`s a Draw!");

		else if(compNum == 0 && answer == 1){
			System.out.println("You Win!");
			userWinCounter += 1;
		}
		else if(compNum == 1 && answer == 0){
			System.out.println("The Computer Wins!");
			compWinCounter += 1;
		}
		else if(compNum == 1 && answer == 2){
			System.out.println("You Win!");
			userWinCounter += 1;
		}
		else if(compNum == 2 && answer == 1){
			System.out.println("The Computer Wins!");
			compWinCounter += 1;
		}
		else if(compNum == 2 && answer == 0){
			System.out.println("You Win!");
			userWinCounter += 1;
		}
		else if(compNum == 0 && answer == 2){
			System.out.println("The Computer Wins!");
			compWinCounter += 1;
		}
		else{}

	}
	
	if(userWinCounter == compWinCounter + 3){
	System.out.print("Game Over! You Won");
	}
	if( userWinCounter + 3 == compWinCounter ){
	System.out.print("Game Over! The Computer Won");
	}

}}