import java.util.Scanner;

public class PositiveNegative{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int positiveCounter = 0;
	int negativeCounter = 0;
	int numberCounter = 0;
	int number = 0;
	int sum = 0;

	System.out.println("Enter a Set of Positive/Negative Numbers. Enter 0 to get results: ");

	do{
		number = input.nextInt();

		if(number > 0)positiveCounter++;
		if(number < 0)negativeCounter++;
		if(number != 0)numberCounter++;

		sum += number;		
	}
	while(number != 0);

	double total = (double) sum;
	double avg = (double) sum / numberCounter;

	//double avg = (double) Math.abs(sum / numberCounter);

	if(sum == 0) System.out.println("No Numbers were Entered");
	else{
		if(positiveCounter == 1) System.out.println("There is " + positiveCounter + " Positive Number" );
		else  System.out.println("There are " + positiveCounter + " Positive Numbers" );

		if(negativeCounter == 1) System.out.println("There is " + negativeCounter + " Negative Number" );
		else System.out.println("There are " + negativeCounter + " Negative Numbers" );
	
		System.out.println("The Total is " + total);
		System.out.printf("The Average is %.2f", avg);
	}


}}















/*
	if(numberCounter == 0) System.out.println("No Numbers were Entered");
	else{	
		if(positiveCounter == 1) System.out.println("There is " + positiveCounter + " Positive Number" );
		else  System.out.println("There are " + positiveCounter + " Positive Numbers" );

		if(negativeCounter == 1) System.out.println("There is " + negativeCounter + " Negative Number" );
		else System.out.println("There are " + negativeCounter + " Negative Numbers" );
	
		System.out.println("The Total is " + total);
		System.out.printf("The Average is %.2f", avg);
	}


	if(positiveCounter == 1) System.out.println("There is " + positiveCounter + " Positive Number" );
	else  System.out.println("There are " + positiveCounter + " Positive Numbers" );

	if(negativeCounter == 1) System.out.println("There is " + negativeCounter + " Negative Number" );
	else System.out.println("There are " + negativeCounter + " Negative Numbers" );
	
	System.out.println("The Total is " + total);
	System.out.printf("The Average is %.2f", avg);



*/