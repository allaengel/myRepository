package basic_learning;

public class OperatorExample {
	
	public static void main(String args[]){
	
		int a=5;
		int b=5;
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b; //mod gives you remainder
		
		System.out.println("********Arithmetic operator starts*********");
		System.out.println(a+ " add "+b+" = "+add);
		System.out.println(a+ " add "+b+" = "+add);
		System.out.println(a+ " add "+b+" = "+add);
		System.out.println(a+ " add "+b+" = "+add);
		System.out.println(a+ " add "+b+" = "+add);
		System.out.println(a+ " add "+b+" = "+add);
		System.out.println("********Arithmetic operator ends***********");

		
		System.out.println("********Assignment operator starts*********");
		//a = a+5;
		a += 5;// means a = a+5
		
		System.out.println("Value of a is now " +a);
		//b = a+5;
		b += a;
		
		System.out.println("Value of b now is " +b);

		b -= a;
		
		System.out.println("Value of b now is " +b);

		System.out.println("********Arithmetic operator ends*********");

	}
}
