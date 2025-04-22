import java.util.Scanner;

public class DisplayProduct{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Your First Number is ");
	int numb1 = input.nextInt();
	System.out.print("Your Second Number is ");
	int numb2 = input.nextInt();

	int product = numb1 * numb2;

	System.out.printf("%d x %d = %d", numb1, numb2, product);

}}