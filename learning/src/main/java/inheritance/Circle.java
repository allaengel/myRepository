package inheritance;

public class Circle extends Shape {
	
	double radius;
	
	//define overloaded constructor that takes 2 ar	gs (parameters) String name and radius
	public Circle(String name, double radius){
		super(name); // IS THIS REQUIRED?
		this.radius=radius;
	}
	
	
	//methods to get Area of the circle;
	public double getArea(){
		return 3.14*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

		
}
