package inheritance;

//Create 2 classes  which implements the Interface. 

public class FlyingPlane implements FlyingObject{

	private int currentAlt;
	
	//@Override
	public void takeOff(){
		
	}
	//@Override
	public void land(){
	}
	
	//@Override
	public int capacity(){
		return 50;
	}

	public int currentAltitude(){
		return currentAlt;
	}
		
//	@Override
	public int flyHigh(){
		currentAlt+=10000;//same as below
		//currentAlt = currentAlt +10000;
		System.out.println("Plane flying at : "+currentAlt+" now");
		return currentAlt;
	}
	
}
