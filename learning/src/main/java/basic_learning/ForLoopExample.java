package basic_learning;

public class ForLoopExample {
	
	public static void main(String[] args){
	
		Integer[] intArr = new Integer[]{1, 2, 3, 4,5,6,7,8,9,10};
		String [] strArr = new String[]{"india","russia","ukraine"};
		Integer k =0;
		int myInt = 0;
		// can't do myInt. methods
		
		System.out.println("Incrementing for loop **********");
	
		for (int i = 0; i<10; i++){
			System.out.println("Value of is is : "+i);	
		}
		
		System.out.println("Decrementing for loop **********");
		for (int j = 0; j>0; j--){
			System.out.println("Value of is is : "+j);	
		
		}
			System.out.println("for each loop **********");
		for (Integer arrValue : intArr){ // you can do (int arrValue : intArr)
			System.out.println("Value of array element is : "+arrValue);
		}
		
		for (String countryName : strArr){
			System.out.println("Name of the country is : "+countryName);
		}
		
	}
}

