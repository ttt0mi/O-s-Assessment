import java.util.Scanner;
import java.util.Random;

public class FlipACoin{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rnumber = new Random(); 

	System.out.print("I flipped a coin, guess what it landed on! 0 for Heads, 1 for Tails: ");
	int answer = input.nextInt();
	int randomNum = rnumber.nextInt(2); 

	if(answer == 0 && answer == randomNum){
	System.out.print("Yes, It's Heads!");
	}
	else if(answer == 0 && answer != randomNum){
	System.out.print("No, It's Tails!");
	}
	else if(answer == 1 && answer == randomNum){
	System.out.print("Yes, It's Tails!");
	}
	else if(answer == 1 && answer != randomNum){
	System.out.print("No, It's Heads!");
	}
	else{
	System.out.print("Invalid c`mon, just 0s and 1s mate");
	}
	
}}


/*
	if(answer != 0 && answer != 1){
	System.out.print("Invalid mate, C'mon!");
	}
	...
	else{};
*/