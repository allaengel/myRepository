package exercise;

public class Exercise22MergeArray {
	
	/*
	 * Step1:
	 * Define a method that will just merge 2 arrays.
	 * -Define master array with size of both the arrays.
	 * -Loop through first array and store that in master array
	 * -Loop through second array and store that in master arra.
	 * 
	 * Step 2:
	 * Define a method that will take an array as parameter and sort if ascend order
	 * -hint You will need 2 loops to sort
	 * -loop through the array, take first element, compare it with all remaining
	 * -if any element is lower than next element keep it on left (previous)
	 * 
	 * Step3:
	 * Remove duplicates and store the entries into a new array
	 * -Loop through the array, if previous entry is == next then it is duplicate, then
	 * -don't copy that into the new array

	 */
	
	
	
	
	public static void main(String args[]){
		int[] temp = new int[]{54, 576, 432, 8843, 8, 34, 2};
		int pre = 0;
		int next = 0;
		for(int i=0; i<temp.length; i++){//first array
			for(int j=temp.length-1; j>0; j--){
				
				int iVal=temp[i];
				int jVal=temp[j];
				if(iVal>jVal)
				if (temp[i]>temp[j]){
					pre=temp[j];
					
				}
			}
	}
}}
