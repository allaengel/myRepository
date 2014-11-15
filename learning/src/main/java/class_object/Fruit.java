package class_object;

//
public class Fruit {
	
	String name;
	String taste;
	String color;
	
	//default constructor
	public Fruit (){
		System.out.println("This is from default constructor");
	}
	
	public Fruit(String name){
		this(name, null);
		System.out.println("This is overloading one param constructor");
	}
	
	public Fruit(String name, String taste){
		this(name, taste, null);// DO WE NEED to DEFINE NULL HERE?
	}
	
	//initializing constructor
	public Fruit (String name, String taste, String color){
		this.name=name;
		this.taste=taste;
		this.color=color;
	}
	
	public static void main(String args[]){
		Fruit lime = new Fruit();
		System.out.println("This is call to default constructor");
		System.out.println("This is: "+lime.name);
		System.out.println("This is: "+lime.taste);
		System.out.println("This is: "+lime.color);
		
		Fruit orange= new Fruit("orange");
		System.out.println("Fruit name is : "+orange.name);
		
		Fruit apple= new Fruit("apple", "sour-sweet");
		System.out.println("Fruit name is: "+ apple.name);
		System.out.println("Fruit taste is:"+apple.taste);
		
		Fruit banana=new Fruit("banana", "sweet", "yellow");
		System.out.println("Fruit name is : "+banana.name);
		System.out.println("Fruit taste is: "+banana.taste);
		System.out.println("Fruit color is: " +banana.color);
		
	}
	
}
