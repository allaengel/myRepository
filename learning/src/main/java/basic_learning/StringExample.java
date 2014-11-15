package basic_learning;

public class StringExample {

	public static void main(String args[]){
		String str1;
		str1 = "Test1"; //"Test1" is string literal
		String str2 = new String ("Test2"); //creating new instance of the object
		//new operator will create new memory for you
		String str3= str1+str2;
		String str4 = "Test1";
		
		String subStr = str1.substring(2);
		System.out.println("substring is : "+subStr);
		
		int indexStr = str1.indexOf("st1");
		System.out.println("Index of : " +indexStr);
		
		
		System.out.println("Comparing references of str1 and str2 : "+str1==str2); //here it compares
		//address of the memory, because it's string objects. == is always compares address of the objects if compared
		//things are object (but not necessary string obejcts
		
		System.out.println("Comparing references of str1 and str2 : "+str1.equals(str2));//here compares value of strings
	
		
		System.out.println("Testing string pool for str1 and str4 : "+str1.equalsIgnoreCase(str4));//True because it's string literals
		
		System.out.println("Testing value equality for str1 and str4: "+str1.equals(str4));
		System.out.println("Comparing references of str1 and str2"+str2==str3);
			
	}
	
}
