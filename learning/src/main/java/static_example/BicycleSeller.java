package static_example;

public class BicycleSeller {
	
		public static void main(String[] args){
			
			Bicycle bike1=new Bicycle("black", 5);
			Bicycle bike2=new Bicycle("red", 3);
			Bicycle bike3=new Bicycle("green", 0);
			
			
			//calling the static variable
			System.out.println(Bicycle.numOfBike); // WHAT IS THIS? using CLASS name
			//System.out.println(bike5.numberOfBike);
			
			
			//Calling static method
			System.out.println("Hello bike");
			
			
		}

}
