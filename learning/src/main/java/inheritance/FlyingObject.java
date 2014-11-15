package inheritance;

public interface FlyingObject {
	
	//Create an interface FlyingObject 
	//Declare the property maxSpeed, maxAltitude. 
	//Declare the methods of flying object takeOff(), land(), capacity(), flyHigh(), currentAltitude;

	int maxSpeed = 400;
	int maxAltitude = 20000;
	
	public void takeOff();
	public void land();
	int capacity();
	int flyHigh();
	int currentAltitude();
	

}
