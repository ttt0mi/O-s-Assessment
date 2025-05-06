public class UniqueElementsFunction{

	public static int[] uniqueElements(int[] array){

		

		int noOfUniqueCount = 0;

		for(int index = 0; index < array.length; index++){

			int count1 = 0;

			for(int innerIndex = 0; innerIndex < array.length; innerIndex++){
					
				if(array[index] == array[innerIndex]) count1++;
			}

			if(count1 == 1) ++noOfUniqueCount;
		}

		


		int[] newArray = new int[noOfUniqueCount];	//count1 & 2 should be in the loop


		int uniqueCount = 0;

		for(int index = 0; index < array.length; index++){

			int count2 = 0;

			for(int innerIndex = 0; innerIndex < array.length; innerIndex++){
					
				if(array[index] == array[innerIndex]) ++count2;
				
			}

			if(count2 == 1){ 

				newArray[uniqueCount] = array[index];
					
				++uniqueCount;
			}

		}


		return newArray;
	}

}