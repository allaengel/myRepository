package inheritance;

public class CabServiceImpl implements IBusiness {

	public boolean isOpen(){
		return true;
	}
	
	public String getContactInfo(){
		return "123-345-345";
	}
	
	public int getCapacity(){
		return 4;
	}
	
	public String getCabType(){
		return "Hybrid";
	}
}
