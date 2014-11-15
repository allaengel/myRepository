package inheritance;

public class Car extends Vehicle{
	private int engineCap;
	private boolean isFourWheel;
	public String source = "car";//overwriting the property
	
	public Car(){
		System.out.println("this is from Car");
		this.engineCap = 3;
	}
	
	public Car(int engineCap, boolean isFourWheel, int maxSpeed, String color, String model){
		super(color, maxSpeed,model);
		this.engineCap = engineCap;
		this.isFourWheel = isFourWheel;
		System.out.println("this is from Car overloaded");
	}
	
	@Override//it's annotation at compiler level to indicate the parent method is overridden.It will not let you change the base
	//the parent's main run method
	public void run(){
		System.out.println("My car is running");
		super.getColor();
		super.source="Vihicle from Car";
	}
	
	public static void main(String args[]){
		
		Car myCar1  = new Car(5,true,20,"blue","Nissan");
		String color = myCar1.getColor();
		String model = myCar1.getModel();
		int myCap = myCar1.getEngineCap();
		System.out.println("color is "+color+", model is "+model+" and engineCap is: "+myCap);
		//these values we get from parent, no child class
		myCar1.run();
		
		Vehicle vh = new Vehicle();
		vh.run();
		//vh.getEngineCap();//parent object tries to access child method, it can NOT
	
	//here reference (type) is Vehicle, object is Car
		Vehicle car = new Car();//type is Vehicle, object is the Car; when reference and objects are different,
		//overriden methods are always called from objects not from reference
		car.run();
		//overidden properties are always called from reference not objects
		System.out.println(car.source); //calling the property
		
		String overridenProper=car.source;
		System.out.println("this is from overriden property: "+car.source);
		}
	
	public int getEngineCap(){
		return engineCap;
	
	}

	
	
}
