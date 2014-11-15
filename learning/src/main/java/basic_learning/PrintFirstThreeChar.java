package basic_learning;

public class PrintFirstThreeChar {
	//Define a function that accepts a String array and print only first 3 characters of every string value. 
	//Call this function from the main method and pass a String array that has name of any 5 countries.

	public static void main(String args[]){

		String[] strArrWords = new String[]{"Allan", "Yefim", "Mariya", "Fedir", "Tobik", "Alla"};
		String[] countries= new String []{"USA", "Ukraine","Argentina", "Poland","India"};

		printFirstThree(strArrWords);

		printCountryName(countries);
	}
	public static void printFirstThree(String[] inputStrArray){
		int i;

		for(i=0; i<inputStrArray.length; i++){

			//substring prints chars where start and ends
			System.out.println("The word is: "+inputStrArray[i]);
			System.out.println("The first three characters are : " + inputStrArray[i].substring(0, 3));

		}
	}
	public static void printCountryName(String[] countryNames){
		for(String countryName : countryNames){
			//System.out.println(countryName.substring(0,3));
			
			 if (countryName.length() > 3)
			System.out.println(countryName.trim().substring(0,3).toLowerCase());
			 
			 String trimmedName=countryName.trim();
			 String subString = trimmedName.substring(0,3);
			 String lowerString = subString.toLowerCase();
			 
		}
	}
	public static void printCountryName1(String[] cntNames){
		for(int i=0; i<cntNames.length; i++){
			if(cntNames[i].length()>3){		
				String country=cntNames[i].substring(0,3);
				System.out.println(country.toLowerCase().trim());
			}

		}

	}

}

//String.toLowerCase()), String.trim();



