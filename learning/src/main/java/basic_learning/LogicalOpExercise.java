package basic_learning;

public class LogicalOpExercise {

	public static void main(String args[]){
		
		int a = 2;
		int b = 5;
		int c = 4;
		int d = 7;
		
		boolean orOperator = ((a+b)>20 || (c+d)>10);
		boolean andOperator = ((a+b)>20 && (c+d)>10);
		boolean notAndOperator = !((a+b)>20 &&(c+d)>10);
		boolean notOrOperator = !((a+b)>20 || (c+d)>10);
			
		
		System.out.println("result of orOperator is : " +orOperator);
		System.out.println("result of andOperator is : " +andOperator);
		System.out.println("result of && notOperator is : " +notAndOperator);
		System.out.println("result of || notOperator is : " +notOrOperator);

		
	}
	
}
	