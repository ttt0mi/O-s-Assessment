import java.util.Arrays;

public class UniqueArray{
	public static void main(String... args){

	int[] numbers = {1, 2, 3, 2, 4, 5, 88, 54, 32, 6};

	String answer = Arrays.toString(UniqueElementsTest.uniqueElements(numbers));

	System.out.print(answer);

}}