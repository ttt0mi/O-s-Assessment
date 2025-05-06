import java.util.Scanner; 

public class Palindrome{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	int remNum = 0;
	int reversedNum = 0;
	int oldNum = num;

	while(num != 0){

		remNum = num % 10;
		reversedNum = reversedNum * 10 + remNum;
		num = num / 10;

/*
456 % 10 = 6 (to get the "unit" digit)
0 * 10 + 6 = 6 (to put them in reverse)
456 / 10 = 45 (to get the other digit)

45 % 10 = 5 (to get the "tenth" digit)
6 * 10 + 5 = 65
45 / 10 = 4

4 % 10 = 4 (to get the "hundredth" digit)
65 * 10 + 4 = 654
4 / 10 = 0

*/


	}

	if(oldNum == reversedNum) System.out.printf("%d is a palindrome", oldNum);
	else  System.out.printf("%d is not a palindrome", oldNum);

}}