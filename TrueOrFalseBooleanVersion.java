import java.util.Scanner;

public class TrueOrFalseBooleanVersion{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an Integer: ");
	int numb1 = input.nextInt();
	
	System.out.print("Enter a Second Integer: ");
	int numb2 = input.nextInt();

	System.out.print("Enter a Third Integer: ");
	int numb3 = input.nextInt();

	System.out.print(numb2 > numb1 && numb3 > numb2);

}}