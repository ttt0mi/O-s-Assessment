import java.util.Scanner;

public class ChooseYourArithmeticSimple{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int reset = -1;
	while(reset != 0){

		System.out.print("Enter a Number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter Another Number: ");
		double number2 = input.nextDouble();

		double sum = number1 + number2;
		double difference = number1 - number2;
		double product =  number1 * number2;
		double quotent = number1 / number2;

		int newReset = -1;
		while(newReset != 0){

			String choice = """

			Select Number To Perform It's Corresponding Operation
			1. Addition
			2. Subtraction
			3. Multiplication
			4. Division
			0. Use Other Numbers
			
				""";

			System.out.print(choice);
			int arithmetic = input.nextInt();

			switch(arithmetic){
				case 1:
					System.out.println("The Answer is " + sum);					

					int userInput1 = -1;
					while(userInput1 != 0){

						System.out.println("press 0 to end or 1 to perform another operation");
						userInput1 = input.nextInt();
						
						if(userInput1 == 0) {
							newReset = 0;
							reset = 0;
							break;
						}
						else
						if(userInput1 == 1) break;
						else System.out.println("Invalid Number Selected");

					}//addition while loop end
	
				break;
				case 2:
					System.out.println("The Answer is " + difference);					

					int userInput2 = -1;
					while(userInput2 != 0){

						System.out.println("press 0 to end or 1 to perform another operation");
						userInput2 = input.nextInt();
						
						if(userInput2 == 0) {
							newReset = 0;
							reset = 0;
							break;
						}
						else
						if(userInput2 == 1) break;
						else System.out.println("Invalid Number Selected");

					}//Subtraction while loop end
				break;
				case 3:
					System.out.println("The Answer is " + product);					

					int userInput3 = -1;
					while(userInput3 != 0){

						System.out.println("press 0 to end or 1 to perform another operation");
						userInput1 = input.nextInt();
						
						if(userInput3 == 0) {
							newReset = 0;
							reset = 0;
							break;
						}
						else
						if(userInput3 == 1) break;
						else System.out.println("Invalid Number Selected");

					}//multiplication while loop end
				break;
				case 4:
					System.out.println("The Answer is " + quotent);					

					int userInput4 = -1;
					while(userInput4 != 0){

						System.out.println("press 0 to end or 1 to perform another operation");
						userInput1 = input.nextInt();
						
						if(userInput4 == 0) {
							newReset = 0;
							reset = 0;
							break;
						}
						else
						if(userInput4 == 1) break;
						else System.out.println("Invalid Number Selected");

					}//division while loop end
				break;
				case 0:
					newReset = 0; break;


				default: System.out.println("Invalid Number Selected");

			}
			
		continue;
		}//arithmetic choice while loop end

	continue;	
	}//number request while loop end

	System.out.println("Bye");

}}