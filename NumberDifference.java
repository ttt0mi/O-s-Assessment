import java.util.Scanner;

public class NumberDifference{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Your First Number is ");
	int numb1 = input.nextInt();
	System.out.print("Your Second Number is ");
	int numb2 = input.nextInt();

	int difference = numb1 - numb2;
	
	System.out.printf("The Difference is " + difference);
	

}}