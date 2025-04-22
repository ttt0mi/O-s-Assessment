import java.util.Scanner;

public class PositiveNegativeSum{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an Integer: ");
	int numb1 = input.nextInt();
	
	System.out.print("Enter a Second Integer: ");
	int numb2 = input.nextInt();

	int sum = numb1 + numb2;
	int product = numb1 * numb2;

/*	if (numb1 > 0 && numb2 > 0) {
	System.out.print("The Product is " + product);
	}
	else if (numb1 < 0 && numb2 < 0) {
	System.out.print("The Product is " + product);
	}
	else {
	System.out.print("The Sum is " + sum);
	}
*/

	if (numb1 > 0 && numb2 > 0 || numb1 < 0 && numb2 < 0) {
	System.out.print("The Product is " + product);
	}
	else {
	System.out.print("The Sum is " + sum);
	}

}
}