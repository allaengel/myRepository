package class_object;

//constructor initialzing values as soon as object is created;
//overloading constructors having different parameter list;

public class PersonConstructor {

	// Below are the properties/c;ass variables/instance variables/member variables
	private String name;
	private int age;
	private String ssn;
	private String firstName;
	private String lastName;

	//default constructor; name has to be exactly like the name of the class
	public PersonConstructor(){
		//it is called by default
		System.out.println("This is from default constructor");
	}

	//overloaded constructor
	public PersonConstructor(String pName, int pAge){
		System.out.println("this is from overloaded");
		this.name=pName;//class vars
		//if name=name, we will not set the value to my object, it will get lost
		this.age=pAge;
		this.name=firstName+lastName;

		System.out.println("This is from overloaded constructor");
		//this.ssn=ssn; //you don't have to provide it if you don't know it
	}

	public PersonConstructor(String firstName, String lastName){
		System.out.println("this is from overloaded");
		this.firstName=firstName;//class vars
		//if name=name, we will not set the value to my object, it will get lost
		this.lastName=lastName;
	}
//defining the constructor
	public PersonConstructor(String firstName, int age, String lastName){
		System.out.println("this is from overloaded");
		this.firstName=firstName;//class vars
		//if name=name, we will not set the value to my object, it will get lost
		this.lastName=lastName;
	}
	public PersonConstructor(int age){
		this(null,age);
	}

	public PersonConstructor(String name){
		this(name,0,null);
	}


	public void printName(){
		System.out.println("My name is : "+name);
	}

	public static void main(String args[]){

		PersonConstructor objDefConstructor = new PersonConstructor();
		System.out.println("Creating objects with overloaded constructors******");
		PersonConstructor personObject = new PersonConstructor("myName", 23); //first Person means reference class; now you can perform operations on this object
		String test = new String();
		personObject.name = "myName";
		personObject.age = 12;
		personObject.ssn = "234-23-2344";
		personObject.printName();

		System.out.println("Age is : "+personObject.age);
		System.out.println("SSN is : "+personObject.ssn);

		PersonConstructor personObject2 = new PersonConstructor("YourName", 323, "ssn");//calling the constructor
		personObject2.printName();
		System.out.println("Age is :"+personObject2.age);
		System.out.println("name is :"+personObject2.name);
		//Person personObject2 = Person();;
	}
}
