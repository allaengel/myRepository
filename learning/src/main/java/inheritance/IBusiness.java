package inheritance;
//Rules for Interface:
//interface is a keyword;
//all member variables are public static final by default.If you define any variable, you need to provide a value;
//All the methods/functions are public abstract by default. you only have to provide:
//1)return type, 2)name of the method 3) parameter list if applicable,
//for e.g. String myMethod(int number);


public interface IBusiness {
	
	String CURRENCY="USD";//value needs to be provided here since you defining a variable
	//public static final String CURRENCY="USD";//"public static final" is REDUNDANT
	
	//abstract boolean isOpen();//"abstract" is redundant here because abstract means you are not going to provide implementation
	boolean isOpen();
	int getCapacity();
	String getContactInfo();
	//boolean processOrder(int orderNum);
	
	
	//public void getName();
}
