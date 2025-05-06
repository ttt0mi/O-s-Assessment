import java.util.Scanner;

public class HighestScoreNew{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the score of students: ");
	int studentsNo = input.nextInt();

	
	int maxScore = Integer.MIN_VALUE;
	String maxScoreName  = " ";

	for(int counter = 0; counter < studentsNo; counter++){

		System.out.print("Enter the Student Name:   ");
		String name = input.next();

		System.out.println("and what was their score? ");
		int score = input.nextInt();

		if(score > maxScore){
			maxScore = score;
			maxScoreName  = name;	
		}
		else
		if(score == maxScore){
			maxScore = score;
			maxScoreName  = maxScoreName  + " and " + name;
		}

	}

	if(studentsNo == 0) System.out.print("There are no students");
	if(studentsNo < 0) System.out.print("Invalid Input");
	else{
		System.out.printf("The highest in class is %s with a score of %d", maxScoreName , maxScore);
	}


}}