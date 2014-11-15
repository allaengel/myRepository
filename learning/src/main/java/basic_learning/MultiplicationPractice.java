package basic_learning;

public class MultiplicationPractice {

	// Define a function that accepts two int variables and returns the multiplication value of that. 
	//Call this function from the main method and print the return value.
	
	public static void main(String args[])
	{
		int a=8;
		int b=7;
		
		int product=multiplier(a,b);
		
		System.out.println("Return value for multiplication is: "+ product);
		
	};
	
	public static int multiplier(int a, int b){
		int result=a*b;
		return result;
		
	}
	
}
