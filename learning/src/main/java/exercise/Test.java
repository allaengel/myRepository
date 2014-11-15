package exercise;

import inheritance.Vehicle;

public class Test extends Vehicle{
	
	public void testProtected(){
		super.source = "ac";
		new Test().source="ac";
	}

}
