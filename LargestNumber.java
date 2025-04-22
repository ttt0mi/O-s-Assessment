import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Your First Number is ");
	int numb1 = input.nextInt();
	System.out.print("Your Second Number is ");
	int numb2 = input.nextInt();

	if(numb1 > numb2){
	System.out.println("Result: " + numb1);
	}
	else if(numb2 > numb1){
	System.out.println("Result: " + numb2);
	}
	else if(numb1 == numb2){
	System.out.println("Result: 0");
	}
	else {
	System.out.println();
	}

	if(numb1 % 6 == numb2 % 6){
	if(numb1 < numb2) System.out.println("The smallest value is " + numb1);
	if(numb2 < numb1) System.out.println("The smallest value is " + numb2);
	}


}}
