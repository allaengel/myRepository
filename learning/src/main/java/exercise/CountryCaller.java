package exercise;

public class CountryCaller {

	public static void main(String args[]){
		//Q: how does it know about object of type Country? Through the package?
		
	//create objects of type Country
		Country canada1=new Country("Canada","CAN", "Canadian dollar", 100000000);
		Country canada2=new Country("Canada","CAN", "Canadian dollar", 100000000);
		Country america1=new Country("America", "USA", "Dollar", 300000000);
		Country america2=new Country("America", "USA", "Dollar", 300000000);
		Country italy1=new Country("Italy", "ITA", "euro", 150000000);
		Country italy2=new Country("Italy", "ITA", "euro", 150000000);
		Country spain1 = new Country("Spain", "SPA","euro", 120000000);
		Country spain2 = new Country("Spain", "SPA","euro", 120000000);
		Country england1 =new Country("England", "ENG","pound", 180000000);
		Country england2=new Country("England", "ENG","pound", 180000000);
		
		
		printOut(canada1, canada2);
		printOut(america1, america2);
		printOut(italy1, italy2);
		printOut(spain1, spain2);
		printOut(italy1, italy2);
		printOut(england1, england2);
	
	}
		public static void printout(Country canada, Country canada1){

			//System.out.println("canada1.equals=america1 = "+canada2.equals(america2));
			//System.out.println("canada==america = "+(canada==america));
		
		}
	
		public static void printOut(Country cnt1, Country cnt2) {
			System.out.println(cnt1.getCountryCode()+" == "+cnt2.getCountryCode()+" is: "+(cnt1 == cnt2));
			System.out.println(cnt1.getCountryCode()+" .equals() "+cnt2.getCountryCode()+" is: "+(cnt1.equals(cnt2)));
			System.out.println("**************************************");
		}

}
	

