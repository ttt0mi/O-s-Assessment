import java.util.Scanner;

public class CurrencyExchange{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("What is the exchange rate from dollars to RMB? ");
	double rate = input.nextDouble();
	
	if(rate <= 0 || rate > 100) {
	System.out.print("Invalid Rate");
	}
	else{
	
		System.out.print("Enter 0 to convert dollars to RMB and 1 to convert RMB to dollars: ");
		int convert = input.nextInt();

		if(convert == 0) {
		System.out.print("Enter Dollar Amount: ");
		double convertDollar = input.nextDouble();
		double dollarToRMB = convertDollar * rate;

			if(convertDollar < 0) {
			System.out.print("Invalid Amount");
			}
			else{
			System.out.printf("$%.2f is %.2f yuan", convertDollar, dollarToRMB);
			}	

		// or System.out.printf((convertDollar>0) ? (convertDollar + " yuan is $" + dollarToRMB) : "Invalid Input");

		}
		else if(convert == 1) {
		System.out.print("Enter RMB Amount: ");
		double convertRMB = input.nextDouble();
		double rmbToDollar = convertRMB / rate;

			if(convertRMB < 0) {
			System.out.print("Invalid Amount");
			}
			else{
			System.out.printf("%.2f yuan is $%.2f", convertRMB, rmbToDollar);
			}

		// or System.out.printf((convertRMB > 0) ? (convertRMB + " yuan is $" + rmbToDollar) : "Invalid Input");

		}
		else {
		System.out.print("Invalid Input, only enter 0 or 1 to convert");
		}

	}

}} 

//javac CurrencyExchange.java