import java.util.Scanner;

public class LrgSmllAvg{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 5 integers:");
	int numb1 = input.nextInt();
	int numb2 = input.nextInt();
	int numb3 = input.nextInt();
	int numb4 = input.nextInt();
	int numb5 = input.nextInt();

	if(numb1 >= numb2 && numb1 >= numb3 && numb1 >= numb4 && numb1 >= numb5){
	System.out.println(numb1 + " is the Largest Number" + numb3);
	}
	else if(numb2 >= numb1 && numb2 >= numb3 && numb2 >= numb4 && numb2 >= numb5){
	System.out.println(numb2 + " is the Largest Number");
	}
	else if(numb3 >= numb1 && numb3 >= numb2 && numb3 >= numb4 && numb3 >= numb5){
	System.out.println(numb3 + " is the Largest Number");
	}
	else if(numb4 >= numb1 && numb4 >= numb2 && numb4 >= numb3 && numb4 >= numb5){
	System.out.println(numb4 + " is the Largest Number");
	}
	else if(numb5 >= numb1 && numb5 >= numb2 && numb5 >= numb3 && numb5 >= numb4){
	System.out.println(numb5 + " is the Largest Number");
	}
	else{
	System.out.println("Invalid Input");
	}

	if(numb1 <= numb2 && numb1 <= numb3 && numb1 <= numb4 && numb1 <= numb5){
	System.out.println(numb1 + " is the Smallest Number");
	}
	else if(numb2 <= numb1 && numb2 <= numb3 && numb2 <= numb4 && numb2 <= numb5){
	System.out.println(numb2 + " is the Smallest Number");
	}
	else if(numb3 <= numb1 && numb3 <= numb2 && numb3 <= numb4 && numb3 <= numb5){
	System.out.println(numb3 + " is the Smallest Number");
	}
	else if(numb4 <= numb1 && numb4 <= numb2 && numb4 <= numb3 && numb4 <= numb5){
	System.out.println(numb4 + " is the Smallest Number");
	}
	else if(numb5 <= numb1 && numb2 <= numb2 && numb5 <= numb3 && numb5 <= numb4){
	System.out.println(numb5 + " is the Smallest Number");
	}
	else{
	System.out.println("Invalid Input");
	}


	int evenNum = 0;
	int evenNumCounter = 0;

	if(numb1 % 2 == 0) {
	evenNum = evenNum + numb1;
	evenNumCounter = evenNumCounter + 1;
	}
	if(numb2 % 2 == 0) {
	evenNum = evenNum + numb2;
	evenNumCounter = evenNumCounter + 1;
	}
	if(numb3 % 2 == 0) {
	evenNum = evenNum + numb3;
	evenNumCounter = evenNumCounter + 1;
	}
	if(numb4 % 2 == 0) {
	evenNum = evenNum + numb4;
	evenNumCounter = evenNumCounter + 1;
	}
	if(numb5 % 2 == 0) {
	evenNum = evenNum + numb5;
	evenNumCounter = evenNumCounter + 1;
	}

	if(evenNumCounter == 0){
	System.out.print("There are no Even Numbers");	
	}
	else{

	double avgOfEvenNum = (double) evenNum / evenNumCounter;

	System.out.printf ("%.2f is the Average of Even Numbers", avgOfEvenNum);

	//System.out.println(avgOfEvenNum + " is the Average of Even Numbers");
	}
	
}}
