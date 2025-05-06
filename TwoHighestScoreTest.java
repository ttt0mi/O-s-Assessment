import java.util.Scanner;

public class TwoHighestScoreTest{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the score of students: ");
	int studentsNo = input.nextInt();
	
	int maxScore = Integer.MIN_VALUE;
	String maxScoreName = " ";
	int secondMaxScore = Integer.MIN_VALUE;
	String secondMaxScoreName= " ";

	for(int counter = 0; counter < studentsNo; counter++){

		System.out.print("Enter the Student Name: ");
		String name = input.next();

		System.out.println("and what was their score? ");
		int score = input.nextInt();

		if(score > maxScore){
			secondMaxScore = maxScore;
			secondMaxScoreName = maxScoreName;
			
			maxScore = score;
			maxScoreName = name;
		}	
		else
		if(score == maxScore){
			maxScore = score;
			maxScoreName = maxScoreName + " and " + name;
		}
		else
		if(score > secondMaxScore){
			secondMaxScore = score;
			secondMaxScoreName = name;
		}
		else
		if(score == secondMaxScore){
			secondMaxScore = score;
			secondMaxScoreName= secondMaxScoreName + " and " + name;	
		}		

	}

	if(studentsNo == 0) System.out.print("There are no students");
	//else
	//if(studentsNo < 0) System.out.print("Invalid Input");
	else
	if(studentsNo > 0){
		System.out.printf("The highest in class is %s with a score of %d%n", maxScoreName, maxScore);
		//System.out.println("The highest in class is " + maxScoreName + "with a score of " +  maxScore);
		System.out.printf("The second highest in class is %s with a score of %d", secondMaxScoreName, secondMaxScore);
		//System.out.println("The second highest in class is " + secondMaxScoreName + " with a score of " +  secondMaxScore);
	}


}}