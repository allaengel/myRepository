package testExercises;

public class StaticNonStatic {
	
	public static void printName(){ // why can't be void?
		System.out.println("PrintingName");
		//getName();//this line gives compiler error because can NOT make static reference to non-static method getName
	}
	
	public void getName(){
		System.out.println("GettingName");
	}
	
	public void printAddress(){
		System.out.println("PrintingAddress");
		String str= getAddress();
		System.out.println(str);
		//return myAddress;
	}
	
	public static String getAddress(){
		return ("GettingMyAddress");
	}
}
