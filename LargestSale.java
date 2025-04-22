import java.util.Scanner;

public class LargestSale{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int counter = 0;
	int number = 1;
	int max = Integer.MIN_VALUE;

	do{
		System.out.print("Enter a number or enter 0 to get results: ");
		number = input.nextInt();

		if(number > max){
			max = number;
			counter = 1;
		}
		else
		if(number == max) counter++;
		else{}

	}
	
	while(number != 0);

	System.out.print("The Largest Number is " + max);
	if(counter == 1) System.out.println(" and it Occured Once");
	else System.out.println(" and it Occurs " + counter + " Times");
}}