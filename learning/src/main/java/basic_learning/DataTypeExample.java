package basic_learning;

public class DataTypeExample {
	
	String classVar = "I am a class variable"; // class vars, outside of the methods
	
	public static void main(String args[]){
		char varChar = 'a'; // character always goes with single quote
		// string comes with double quote
		boolean varBoolean = false;
		byte varByte = 127;
		short varShort = 12;
		int varInt=4;
		long varLong = 123;
		float varFloat = 5.0f; // need to put f at the end of value to differentiate
		//between float and double;
		double varDouble = 543.34;
		String varString = "a";
		String stringPart1 = "b";
		String stringPart2 = " is ";
		
		System.out.println(stringPart1+ " char"+ stringPart2 + varChar);
		System.out.println(stringPart1 + " integer" + stringPart2 +varInt);
		System.out.println(stringPart1 + " boolean" + stringPart2 +varBoolean);
		System.out.println("Value of byte is :"+varByte);
		System.out.println("Value of short is :"+varShort);
		System.out.println("Value of int is :"+varInt);// srting and plus is used as concatination
		// string concat does NOT care what is the type of your variable
		System.out.println("Value of long is :"+varLong);
		System.out.println("Value of float is :"+varFloat);
		System.out.println("Value of double is :"+varDouble);
		
		
		
		
		
	}

}
