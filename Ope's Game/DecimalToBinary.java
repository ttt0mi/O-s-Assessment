import java.util.Scanner; 

public class DecimalToBinary{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = input.nextInt();
	
	String answer = " "; 
	int  binaryNum = 0;

	do{

		binaryNum = num % 2;
		answer = binaryNum + answer; 
		num /= 2;

	}
	while(num != 0);

	System.out.print(answer);



}}