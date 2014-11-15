package accessModifiers;

// Exercise 15: (Final) Write a class Fruit with properties name, taste andoriginCountry. 
//originCountry should be a final variable with value = ÒUSAÓ  and methods String getSource();, 
//getWeight() getSource() should be a final method. 
//Write a sub class Apple and override getWeight method and also override getSource()method.

public class Fruits {
	String name;
	String taste;
	final String originCountry="USA";
	
	public final String getSource(){
		return "Ukraine";
	}
	
	public float getWeight(){
		return 100.5f;
	}
	
	
}
