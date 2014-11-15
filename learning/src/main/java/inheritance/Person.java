package inheritance;

//Create a Person Class with gender, age and name. 

public class Person {
	
	public String name;
	public int age;
	public String gender;
	
	
	public Person(){
		System.out.println("this is a default constructor");	
	}
	
	public Person(String name, int age){
		this(name, age, null);
		System.out.println("this is overloading constructor");
	}
	
	//initializing constructor;
	public Person(String gender, int age, String name){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
