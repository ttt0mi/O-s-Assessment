import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rnumber = new Random(); 

	System.out.print("Choose Scissors(0), Rock(1) or Paper(2): ");
	int answer = input.nextInt();
	int compNum = rnumber.nextInt(3); //Returns a random integer between (included)0 and the (excluded)bound(4)

	if(compNum == 0){
	System.out.print("The Computer Chooses Scissors, ");
	}
	else if(compNum == 1){
	System.out.print("The Computer Chooses Rock, ");
	}
	else{
	System.out.print("The Computer Chooses Paper, ");
	}

	if(answer == 0){
	System.out.print("You Choose Scissors, ");
	}
	else if(answer == 1){
	System.out.print("You Choose Rock, ");
	}
	else if(answer == 2){
	System.out.print("You Choose Paper, ");
	}
	else{
	System.out.print("Invalid c`mon! just 0s, 1s and 2s mate");
	}

	if(compNum == answer){
	System.out.print("It`s a Draw!");
	}
	else if(compNum == 0 && answer == 1){
	System.out.print("You Win!");
	}
	else if(compNum == 1 && answer == 0){
	System.out.print("The Computer Wins!");
	}
	else if(compNum == 1 && answer == 2){
	System.out.print("You Win!");
	}
	else if(compNum == 2 && answer == 1){
	System.out.print("The Computer Wins!");
	}
	else if(compNum == 2 && answer == 0){
	System.out.print("You Win!");
	}
	else if(compNum == 0 && answer == 2){
	System.out.print("The Computer Wins!");
	}
	else{
	System.out.print("Invalid c`mon!");
	}

}}

