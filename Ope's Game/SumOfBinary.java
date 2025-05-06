import java.util.Scanner; 

public class SumOfBinary{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter a binary number: ");
	int numb1 = input.nextInt();
	System.out.print("Enter another binary number: ");
	int numb2 = input.nextInt();


	int remNum1 = 0;
	int digits1 = 0;
	int sum1 = 0;
	int power1 = 0;
	int counter1 = 0;


	do{

		remNum1 = numb1 % 10;

		numb1 /= 10;

		power1 = (int) Math.pow(2, counter1);

		digits1 = remNum1 * power1;

		sum1 += digits1;

		counter1++;

	}while(numb1 != 0);


	int remNum2 = 0;
	int digits2 = 0;
	int sum2 = 0;
	int power2 = 0;
	int counter2 = 0;

	do{

		remNum2 = numb2 % 10;

		numb2 /= 10;

		power2 = (int) Math.pow(2, counter2);

		digits2 = remNum2 * power2;

		sum2 += digits2;

		counter2++;

	}while(numb2 != 0);

	
	int decimalNum = sum1 + sum2;
	int binaryNum = 0;
	String answer = " ";


	do{

		binaryNum = decimalNum % 2;

		answer = binaryNum + answer;

		decimalNum /= 2;

	}while(decimalNum != 0);
	

	System.out.print(answer);


}}

	











