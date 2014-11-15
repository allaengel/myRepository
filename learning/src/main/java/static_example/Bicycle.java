package static_example;

public class Bicycle {
	
	private String color;
	private int gear;
	public static int numOfBike; //default is assigned to 0; boolean default is FALSE
	
	public Bicycle(String color, int gear){
		
		this.color = color;
		this.gear = gear;
		numOfBike++;
	}

	public String getColor(){
		return color;
	}
	
	public void setColor(){
		
	}
}


