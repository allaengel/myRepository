package basic_learning;

public class StringPractice {
	
	public static void main (String args[]){
		
		String str1 = "Soccer"; //literal 
		String str2 = new String ("Football");
		String str3 = "Cricket"; //literal
		
		System.out.println("Comparing references of str1 and str2 : " +str1==str2);
		System.out.println("Comparing value of str1 and str2 : " + str1.equals(str2));
		
		System.out.println("Comparing references of str1 and str3 : " +str1==str3);
		System.out.println("Comparing value of str1 and str3 : " + str1.equals(str3));
		
		System.out.println("Comparing references of str2 and str3 : " +str2==str3);
		System.out.println("Comparing value of str2 and str3 : " + str2.equals(str3));
		
		
		System.out.println("The Total character length of str2 (Football) is : " +str2.length());
		
		//substring prints chars where start and ends
		System.out.println("The second last character for str3 (Cricket) is : " + str3.substring(5, 6));
	
		//index
		//passing required character to find out position in the word
		System.out.println("Printing position of first c in str1 (Soccer) : " + str1.indexOf("c"));
		
		
		
		
		
	}

}
