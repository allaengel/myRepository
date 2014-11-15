package basic_learning;

public class FloatComparisonOperators {
	
public static void main(String args[]){
		
		float a=1.4f;
		float b=2.3f;
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean isGreaterThan = (a>b);
		boolean isLessThan = (a<b);
		
		
		System.out.println(a+ " is equal "+b+" : " +isEqual);
		System.out.println(a+ " is not equal "+b+ " : " +isNotEqual);
		System.out.println(a+ " is greater than " +b+ " : " +isGreaterThan);
		System.out.println(a+ " is less than " +b+ " : " +isLessThan);
		
}	

}
