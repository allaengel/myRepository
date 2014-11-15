package static_example;

public class Calculator {

	int number1;
	int number2;
	int sum;
	int product;

	//public Calculator (int num1, int num2){
	//this.number1=num1;
	//this.number2=num2;
	//}

	public static int add(int a, int b){
		int sum=a+b;
		return sum;
	}

	public static float add(float c, float d){
		return c+d;
	}

	public static int subtract(int a, int b){
		int result=a-b;
		return result;
	}

	public static int multiply(int a, int b)
	{
		int product=a*b;
		return product;
	}

	public static int divide(int a, int b){
		return a/b;//no need to assign to var

	}

	public static void main(String args[]){
		System.out.println(add(2,2));
		System.out.println(add(3.0f, 2.0f));

		float sumF=add(3.0f, 3.0f);
		System.out.println(sumF);

	}
}
