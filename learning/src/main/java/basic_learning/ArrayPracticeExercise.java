package basic_learning;

public class ArrayPracticeExercise {
	
	public static void main (String args[]){
		
		//declare an array of char which takes 5 elements
		//declare an array of int and initialize element in the array
		//write method which takes a parameter of array of int and print the size of any array
		//write a method which takes and parameter of array of String and print all the items in the array

		char[] charArr = new char[5];
		int [] intArr = new int[3];
		int [] intArr1 = {1,2,3,4,5};
		String [] strArr = new String[10];
		
		String[] strArrWords = new String[]{"Alla","Fedir","Maria", "Yefim"};
		
		int [] intArr2 = new int[] {1, 2, 4};
		
		printSize(intArr);
		
		printStringArray(strArr);
		printStringArray(strArrWords);
	}
		//method
		public static void printSize(int[] inputArr){ //no need to return here anything
			System.out.println("The size of array is : "+inputArr.length);
			
		}
		
		public static void printStringArray(String[] inputStrArr){
			for (int i=0; i<inputStrArr.length; i++){
				System.out.print(inputStrArr[i]+", ");
			}
			System.out.println("");
			System.out.println("The size of word array is: " +inputStrArr.length);
		}
		
	}


