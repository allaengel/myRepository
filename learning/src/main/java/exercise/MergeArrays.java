package exercise;
/*
 * Step1:
 * Define a method that will just merge 2 arrays.
 * -Define master array with size of both the arrays.
 * -Loop through first array and store that in master array
 * -Loop through second array and store that in master array
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
public class MergeArrays {
	
	public static void main(String args[]){
	
	int[] Arr1 = new int[]{5, 8, 2, 4, 8, 10};
	int[] Arr2 = new int[]{3, 2, 9, 6};
	
	//int[] CombinedArr 
	merge(Arr1, Arr2);
	
	}
	
	
	//public static int[] merge(int[] Arr1, int[] Arr2){
	public static void merge(int[] Ar1, int[] Ar2){
		//int[] AnotherArr = new int[Arr1.length+Arr2.length];
		//int totalLength=Arr1.length+Arr2.length;
		 
		int[] MasterArray= new int[10];
			for(int i = 0; i<Ar1.length; i++){
				MasterArray[i]=Ar1[i];
			    System.out.println(MasterArray[i]);
			}
		
		//return AnotherArr;
	}
  
}
