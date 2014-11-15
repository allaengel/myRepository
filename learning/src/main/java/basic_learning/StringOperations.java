package basic_learning;

public class StringOperations {

		public static void main(String args[]){
			String str1 = "Java classes are funny";
			String str2 = "are they rally";
			
			int length = str1.length();
			System.out.println("length of str1 is : "+length);
			
			String subStr1 = str1.substring(1, 5); //why is starts from 0 not 1?????
			System.out.println("Substring of str1 is : " +subStr1);
			
			int indexStr2 = str2.indexOf("they"); //will return -1, means character is not present in this string
			int indexStr3 = str2.indexOf("b");
			System.out.println("Index of  ' are' in str2 is : "+indexStr2);
			
			
		}
}
