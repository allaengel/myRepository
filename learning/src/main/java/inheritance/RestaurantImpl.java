package inheritance;
/*
 * Rules to implement an interface
 * i) it should have "implements <interface name>
 * ii) It should provide the implementation/definition of all the methods that
 * interface has declared. 
 */
public class RestaurantImpl implements IBusiness{

	//@Override
	public boolean isOpen(){
		//I will compare the current time
        //if current time > 11.00 pm. then return false
        //else return true;
		return true;
	}
	
	
	
	//@Override
	public String getContactInfo(){
		return "myemail@yahoo.com";
	}
	
	//@Override
	public int getCapacity(){
		return 30;
	}
	
	public String getRestaurantType(){
		return "Italian";
	}
	
	public String getMenu(boolean isVeg){
        //if currtime is b/w 7-10 a.m
        //return breakfast;
        //else if //current time is noon
    //return "lunch"
    //else //return dinner;
            return "breakfast, lunch, dinner";  
    }
}

