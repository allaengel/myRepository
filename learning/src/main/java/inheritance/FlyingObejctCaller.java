package inheritance;

//Caller should create the objects of both the 
//classes. Caller method should keep on calling 
//flyHigh() method till maxAltitude is not 
//reached. Once maxAltitude is reached, land() method should be called.

public class FlyingObejctCaller {
	
	public static void main(String[] arg){
		FlyingObject plane=new FlyingPlane();//type is of Interface and object of Implemented class
		FlyingObject sourcer=new FlyingSourcer();// same as above for sourcer object
		System.out.println("Flying the plane now");
		operate(plane);
		System.out.println("Flying the sourcer now");
		operate(sourcer);
	}
		public void add(int a, int b){
			 System.out.println(a+b);
		}
		
		public static void operate(FlyingObject ob){// we define var ob of type FlyingObject
			while(true){
				if(ob.currentAltitude() < FlyingObject.maxAltitude){
					ob.flyHigh();
				}else{
					ob.land();
					break;
				}
			}
		}
	}


