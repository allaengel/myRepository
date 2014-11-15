package class_object;

	public class Person {

	// Below are the properties/c;ass variables/instance variables/member variables
	private String name;
	private int age;
	private String ssn;
	private static String gender;// it's a CLASS var, it's value shared between all objects
	
	//this is an example of a function/instance method/behavior of the class
	public void walk(){
		//define walking here
		System.out.println("I am walking");
	}
	
	public void printName(){
		System.out.println("My name is : "+name);
	}

	public static void main(String args[]){
		Person personObject = new Person(); //first Person means reference class; now you can perform operations on this object
		// java will call the constructor by default
		
		Person personObject1 = new Person();
		String str = new String();
		personObject.name = "myName";
		personObject.age = 12;
		personObject.ssn = "234-23-2344";
		personObject.gender="male";
		personObject.printName();
		System.out.println("Age is : "+personObject.age);
		System.out.println("SSN is : "+personObject.ssn);
		System.out.println("The gender is : "+personObject.gender);
		
		Person personObject2 = new Person();
		String str1 = new String();
		personObject2.name = "Alla";
		personObject2.age = 32;
		personObject2.gender="female";
		System.out.println("Age is : "+personObject2.age);
		System.out.println("SSN is : "+personObject2.ssn);
		System.out.println("The gender is : "+personObject.gender);
		//Person personObject2 = Person();
		
	}
}
