import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number to get it's multiplication table: ");
	int numb = input.nextInt();
	
	if(number > 0){
	
		int counter = 1;
	
		while(counter <= 12){

			int answer = numb * counter;
			System.out.println(numb + " x " + counter + " = " + answer);
			counter += 1;
	
		}
	
	}

}}