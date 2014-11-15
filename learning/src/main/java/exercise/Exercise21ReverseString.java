package exercise;

public class Exercise21ReverseString {
	
	public static void main(String args[]){
		
		String input = "Tlorashant";
		
		char [] chArr = input.toCharArray();
		//char [] revChArr= new char[input.length()]; //define reverse array of the same length
		reverse(chArr, input);
		
	}
	//need to return array, how do you do that? Or don't return anything
	
	public static void reverse(char [] chArr, String input){
		
		//for loop to traverse through the string
		//for(int i=0; i<input.length(); i++){
		for (int i=input.length()-1; i>=0; i--){
			System.out.print(chArr[i]);
			
		}//can we use for each loop here?
		//for (char chArr: Character){
			//System.out.println();
		//}
		
	}

}
