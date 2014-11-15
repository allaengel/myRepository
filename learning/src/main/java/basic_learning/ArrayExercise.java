package basic_learning;

public class ArrayExercise {
	
	public static void main(String args[]){
		int j;
		String s;
		int [] intArr;//declared var int of type of array; intArr points to NULL
		intArr = new int[3];//allocates spaces of size 3 and points var intArr to this new object of size 3
		//intArr above is the reference to the new object below )new int[3]
		int [] intArr1 = new int[3];
		
		intArr[0]=32;
		intArr[1]=54;
		intArr[2]=23;
		
		int secondIndex=intArr[1];
		System.out.println("Value at 1st index of array is : "+intArr[0]);
		System.out.println("Value at 2st index of array is : " +secondIndex);
		
		for (int i=0; i<intArr.length; i++){
			System.out.println("Value at "+i+" index is : " +intArr[i]);
		}
		
		for (int val : intArr){
			
			System.out.println(val);
		}
		
		//another way to define, instantiate and initialize the array
		int[] anotherIntArr = new int[]{90, 23, 76}; // number of elements that you pass becomes length of the array
		
		//populate the array using for loop
		for (int i=0; i<anotherIntArr.length; i++){
			anotherIntArr[i] = i+10;// assigning new values to each position of the array
			System.out.println("The value of the array are: " +anotherIntArr[i]);
			
		}
		
		
		
	}

}
