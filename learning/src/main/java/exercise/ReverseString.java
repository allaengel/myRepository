package exercise;

public class ReverseString {
	
	public static void main(String args[]){
	
	String input="Yefim";
	//char [] chArr = new char[input.length()];
	char [] chArr = input.toCharArray();
	char [] rvArr = new char[input.length()];
	int j=0;
	
	for (int i=input.length()-1; i>=0; i--){
		rvArr[j]=chArr[i];
		System.out.println(rvArr[j]);
	}
	
	for (char val: rvArr){
		System.out.println (val);
	}
	
		
  }
}
