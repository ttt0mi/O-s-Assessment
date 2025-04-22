import java.util.Scanner;

public class SumProdAvgDiffMaxMin{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Your First Number is ");
	int numb1 = input.nextInt();
	System.out.print("Your Second Number is ");
	int numb2 = input.nextInt();

	int sum = numb1 + numb2;
	int product = numb1 * numb2;
	double average = (double) (numb1 + numb2) / 2; //Casted Int answer to double
	int difference = Math.abs(numb1 - numb2);
	
	System.out.println("Sum of the two integers: " + sum);
	System.out.println("Product of the two integers: " + product);
//	System.out.println("Average of the two integers: " + average);
	System.out.printf("Average of the two integers: %.2f%n", average);
	System.out.println("Distance between the two integers: " + difference);

	if(numb1 > numb2){
	System.out.println("Max integer: " + numb1);
	System.out.println("Min integer: " + numb2);
	}
	if(numb2 > numb1){
	System.out.println("Max integer: " + numb2);
	System.out.println("Min integer: " + numb1);
	}
	if(numb1 == numb2){
	System.out.println("Max integer: " + numb1);
	System.out.println("Min integer: " + numb2);
	}

}}

/*
import java.util.Scanner;

public class SumProdAvgDiffMaxMin{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Your First Number is ");
	double numb1 = input.nextDouble();
	System.out.print("Your Second Number is ");
	double numb2 = input.nextDouble();

	double sum = numb1 + numb2;
	double product = numb1 * numb2;
	double average = (numb1 + numb2) / 2;
	double difference = Math.abs(numb1 - numb2);
	
	System.out.printf("Sum of the two integers: %.0f%n", sum);
	System.out.printf("Product of the two integers: %.0f%n", product);
	System.out.printf("Average of the two integers: %.2f%n", average);
	System.out.printf("Distance between the two integers: %.0f%n", difference);

	if(numb1 > numb2){
	System.out.printf("Max integer: %.0f%n", numb1);
	System.out.printf("Min integer: %.0f%n", numb2);
	}
	if(numb2 > numb1){
	System.out.printf("Max integer: %.0f%n", numb2);
	System.out.printf("Min integer: %.0f%n", numb1);
	}
	if(numb1 == numb2){
	System.out.printf("Max integer: %.0f%n", numb1);
	System.out.printf("Min integer: %.0f%n", numb2);
	}

}}
*/