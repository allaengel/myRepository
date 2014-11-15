package accessModifiers;

public class Apple extends Fruits{

	String name;
	String taste;
	final String originCountry="USA";
	
	public Apple(){
		
	}
	
	//We can not override final methods from super class.
//	public final String getSource(){
//		return "France";
//	}
	
	public float getWeight(){
		return 120.5f;
	}
	
}
