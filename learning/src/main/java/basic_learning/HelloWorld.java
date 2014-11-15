package basic_learning;

public class HelloWorld {
	
	
	static String classVar = "I am a class variable";// class vars, outside of the methods
			
	public static void main (String args[]){
		String methodVar = " I am a method variable";
		System.out.println("Entering main");
		System.out.println(classVar + " main");
		int myVariable = 2/2;
		System.out.println("Value of I is : "+myVariable);
		int callerValue=childFunction(2);
		System.out.println("Exiting main with value = "+callerValue);
				
	}

	private static int childFunction(int myNum) {
		System.out.println(classVar + "childFunction");
		System.out.println("Entering main");
		int myVariable = myNum*2;
		System.out.println("returning from childfunction");
		return myVariable;
	}

}
