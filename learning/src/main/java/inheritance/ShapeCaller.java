package inheritance;

public class ShapeCaller {
	//should be ShapeCaller
	//Create the object of circle class (and triangle class later) and pass name 
	//and radius for circle and name, height and width for triangle while creating object.
	
	
	
	public static void main(String args[]){
		//Circle myCircle=new Circle("mycircle", 5);//creating object & calling overloaded constructor (passing 2 args here)
		//double area=myCircle.getArea();
		//String name = myCircle.getName();
		
		//constructor HAVE TO BE INSIDE MAIN METHOD because can not call non-static method from static (main method)
		Shape myCircle=new Circle("blueCircle", 6); //better to use PARENT type than child's as below
		Shape myTriangle=new Triangle("red triangle",3, 7);// WHY NEED STATIC???
		
		System.out.println("The area of the circle is: "+myCircle.getArea());
		System.out.println("The name of the shape is :" + myCircle.getName());
		
		//if need to print area of 15 shapes, you need to do this 15 times
		System.out.println("The area of the circle is: "+myTriangle.getArea());
		System.out.println("The name of the shape is :" + myTriangle.getName());
		
		System.out.println("Area of "+myTriangle.getName()+" is "+myTriangle.getArea());
		
		
		Shape[] shpArr = new Shape[]{myCircle, myTriangle};
		
		for (Shape sh: shpArr){
			System.out.println("Area of: " +sh.getName() + " is : "+sh.getArea());
		}
		
	}
		
	
}
