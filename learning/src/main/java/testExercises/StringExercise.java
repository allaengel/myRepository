package testExercises;

public class StringExercise {

	public static void main(String args[]){

		String str = new String ("abc");
		String test = "abc";
		String test1 = "abc";
		String test2 = new String ("abc");
		
		
		//Equals operator =
		System.out.println("Output of str vs test with '=' operator is "+ (str==test));
		System.out.println("Output of str vs test1 with '='operator is " +(str==test1));
		System.out.println("Output of str vs test2 with '=' operator is "+(str==test2));
		
		
		System.out.println("Output of test vs test1 with '=' operator is "+ (test==test1));
		System.out.println("Output of test vs test2 with '=' operator is "+ (test==test2));
		
		System.out.println("Output of test1 vs test2 with '=' operator is "+ (test1==test2));

		//Equals method
		System.out.println("Output of str vs test with equal method is: " + (str.equals(test)));
		System.out.println("Output of str vs test1 with eq method is: " +(str.equals(test1)));
		System.out.println("Output of str vs test2 with equal method is: " + (str.equals(test2)));
		
		System.out.println("Output of test vs test1 with eq method is: " +(test.equals(test1)));
		System.out.println("Output of test vs test2 with equal method is: " + (test.equals(test2)));
		
		System.out.println("Output of test1 vs test2 with eq method is: " +(test1.equals(test2)));
		
	}

}
