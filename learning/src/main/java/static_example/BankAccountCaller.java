package static_example;

//Create BankAccountCaller class. Create 5 BankAccount objects and print accountNumber for every object. 

public class BankAccountCaller {

	public static void main(String args[]){
		BankAccount ba1 = new BankAccount("Robert", 300);
		BankAccount ba2 = new BankAccount("James", 500);
		BankAccount ba3 = new BankAccount("Alla", 700);
		BankAccount ba4 = new BankAccount("Fima", 800);
		BankAccount ba5 = new BankAccount("Lada", 900);
		
		
		//ba1.getAccountNumber(); //should not access properties directly like here
		//ba1.getAccountNumber(); //should use getter or setter as here
		
		System.out.println("The account number for ba1 is:"+ ba1.getAccountNumber());
		System.out.println("The account number for ba2 is:"+ ba2.getAccountNumber());
		System.out.println("The account number for ba3 is:"+ ba3.getAccountNumber());
		System.out.println("The account number for ba4 is:"+ ba4.getAccountNumber());
		System.out.println("The account number for ba5 is:"+ ba5.getAccountNumber());
		
	}
	
}
