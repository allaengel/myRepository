package inheritance;

public class Triangle extends Shape{

	//Create the object triangle class and pass name 
	//and radius for circle and name, height and width for triangle while creating object.
	
	double height;
	double width;
	
	public Triangle (String name, double height, double width){
		super(name);
		this.height=height;
		this.width=width;

	}
	
	public double getArea(){
		//return height*width;
		return(getHeight()*getWidth()/2);//better than above
	}
	
	public double getHeight() {
		return height;
	}
	
	//public float getBase(){
		//return base;
	//}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
}
