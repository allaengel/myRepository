package inheritance;

public class FlyingSourcer implements FlyingObject{

	private int currentAlt;
	
//	@Override
	public void takeOff(){
		
	}
//	@Override
	public void land(){
		
	}
//	@Override
	public int capacity(){
		return 3;
	}
//	@Override
	public int flyHigh(){
		currentAlt+=5000;
		//currentAlt = currentAlt +10000;
		System.out.println("Source flying at : "+currentAlt+" now");
		return currentAlt;
	}
	
	public int currentAltitude(){
		return currentAlt;
	}
		
	
}
