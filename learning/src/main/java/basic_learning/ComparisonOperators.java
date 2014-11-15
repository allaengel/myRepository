package basic_learning;

public class ComparisonOperators {
	
	public static void main(String args[]){
		
		int a=5;
		int b=5;
		boolean isEqual = (a==b); // need to put comp operators in paranthesys
		boolean isNotEqual = (a!=b);
		boolean greaterThan = (a>b);
		boolean lessThan = (a<b);

		boolean grOrEq = (a>=b);
		boolean lsOrEq = (a<=b);
		
		System.out.println(a+ " isEqual "+b+" : " +isEqual);
		System.out.println(a+ " isNotEqual "+b+" : " +isNotEqual);
		System.out.println(a+ " greaterThan "+b+" : " +greaterThan);
		System.out.println(a+ " lessThan "+b+" : " +lessThan);
		System.out.println(a+ " grOrEq "+b+" : " +grOrEq);
		System.out.println(a+ " lsThanEq "+b+" : " +lsOrEq);

		boolean orOperator = (2 == 2 || 3 == 2);
		boolean andOperator = (2 == 2 && 3 == 2);
		boolean notOperator = !(2 == 2);
		
		System.out.println("result of orOperator is : "+orOperator);
		System.out.println("result of andOperator is : "+andOperator);
		System.out.println("result of notOperator is : "+notOperator);

	}
}
