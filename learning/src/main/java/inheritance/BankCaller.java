package inheritance;

//Write a caller class that creates the object of branch and access all the properties and call all the methods.

public class BankCaller {

	public static void main(String args[]){
		
		
		Branch branch1 = new Branch("22 Main St", 32, 500, "San Francisco Branch", "Melrose Place");
		Bank bank1 = new Bank("123 Los Palmos Dr", 8, 43 );
		Bank branch2 = new Branch("22 Main St", 12, 550, "San Mateo Branch", "Teresita Place");
		
		
		printProp(branch1);
		//printProp(bank1);
		//printProp(branch2);
	}
		public static void printProp(Branch bran){
			
			//branch1.getBranchName();
			//branch1.getBranchAddress();
			//branch1.getTotalEmployees();
			
			//branch1.getTotalEmployees();
		}
			
	
}
