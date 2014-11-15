package static_example;

public class CalculatorCaller {

	public static void main(String[] args){
	int a = 10;
	int b = 5;
	
	int sum = Calculator.add(a, b);
	System.out.println("The sum is: "+sum);
	
	System.out.println("Output of sub is "+Calculator.subtract(a, b));
	
	int mul= Calculator.multiply(3, 6);
	System.out.println("The product is: "+mul);
	
	int div = Calculator.divide(a, b);
	System.out.println("Output of division is "+div);
		
	
	}
}
