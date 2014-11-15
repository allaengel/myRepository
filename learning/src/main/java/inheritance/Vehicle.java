package inheritance;

public class Vehicle {
	
	//Create a vehicle class with String color, int make(year) and String model properties;
	//write default and overloaded constructor that initializes these properties.
	//Write a main method that creates the object by passing these values.
	//Print value of the properties after object is created

	public String color;
	public int maxSpeed;
	public String model;
	protected String source = "vehicle";//overwriting the property
	
	
	public Vehicle(){
		System.out.println("This is from default constructor");
	}
	
	public Vehicle(String color, int make){//defining, these type of parameters that I will accept
		this("silver", 2000, null); //calling constructor(passing values)
		System.out.println("This is overloading constructor");
	}
	
	public Vehicle(String color){//defining, these type of parameters that I will accept
		this(color,0, null); //calling constructor(passing values)
		System.out.println("This is overloading constructor");
	}
	
	//initializing the constructor
	public Vehicle(String color, int make, String model){
		this.color = color;
		this.maxSpeed = make;
		this.model = model;
	}
	public static void main(String args[]){
		
		Vehicle bmw=new Vehicle("silver", 2014);//calling constructor
		System.out.println("The color is : "+bmw.color);
		System.out.println("The make is : "+bmw.maxSpeed);
		System.out.println("The model is : "+bmw.model);
		
		Vehicle audi= new Vehicle("red", 2005, "530i");
		System.out.println("The color is : "+audi.color);
		System.out.println("The make is : "+audi.maxSpeed);
		System.out.println("The model is : "+audi.model);
	
		//System.out.println("This is overloading constructor");
		
	}

	public void run(){
		System.out.println("My vehicle is running");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	
	
}
