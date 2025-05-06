import java.util.Scanner;

public class CostOfShipping{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("What is the weight of the package in pounds(lbs)? ");
	double weight = input.nextDouble();
	float cost = 0;

	if (weight > 0 && weight <=1) {
	cost = 3.5f;
	System.out.printf("This package will cost you $%.2f in shipping costs", cost);
	}
	else if (weight > 1 && weight <=3) {
	cost = 5.5f;
	System.out.printf("This package will cost you $%.2f in shipping costs", cost);
	}
	else if (weight > 3 && weight <=10) {
	cost = 8.5f;
	System.out.printf("This package will cost you $%.2f in shipping costs", cost);
	}
	else if (weight > 10 && weight <=20) {
	cost = 10.5f;
	System.out.printf("This package will cost you $%.2f in shipping costs", cost);
	}
	else if(weight > 20) {
	System.out.println("This Package Cannot be Shipped!");
	}
	else {
	System.out.println("Invalid Weight!");
	}

}}





/*
Import a package called java utility and invoke the scanner class to collect user input

declare a public class with a variable name related to the code`s function
declare the method of the class created above
create an object from the class scanner to read inputs from the user through the command line

prompt the user to enter the weight of their package
use the scanner object to read & store the input for weight in a variable "weight" of data type Double
initialize a variable "cost" of data type Float to 0

if weight > 0 & weight <= 1
set cost variable to the corresponding weight value, which is $3.5
print "This package will cost you 'COST VALUE' in shipping costs" using %f format specifier for float value of cost

else
if weight > 1 & weight <= 3
set cost variable to the corresponding weight value, which is $5.5
print "This package will cost you 'COST VALUE' in shipping costs" using %f format specifier for float value of cost

else
if weight > 3 & weight <= 10
set cost variable to the corresponding weight value, which is $8.5
print "This package will cost you 'COST VALUE' in shipping costs" using %f format specifier for float value of cost

else
if weight > 10 & weight <= 20
set cost variable to the corresponding weight value, which is $10.5
print "This package will cost you 'COST VALUE' in shipping costs" using %f format specifier for float value of cost

else
if weight > 20
print "This Package Cannot be Shipped!"

else
print "Invalid Weight" to safeguard against negative & other invalid user inputs 
*/
