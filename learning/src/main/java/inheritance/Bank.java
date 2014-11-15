package inheritance;

//Write a Bank class that will have a bank name properties which is shared across all the object. 
//Value of these properties is “MyBank”.Bank class will have these properties: Bank address totalEmployees, balance
//Bank class has these function makeDeposit withdrawMoney

public class Bank {
	
	//Public means accessible to all objects while adding Static means that value can be used by all objects (like constant
	//if public only all objects can use it, but each has it's own value?
	// all properties of the class should be private to the class, should use getter and setters
	
	private static String bankName = "MyBank";//define is here; since all objects will need to have the same value
	private static String bankAddress;
	private static int totalEmployees;
	private double balance;
	
	//default constructor
	public Bank(){
		System.out.println("this is from defaul constructor");
	}
	//defining overloaded constructor
	public Bank(String bankAddress, int totalEmployees, double balance) {     
        this.bankAddress = bankAddress;
        this.totalEmployees = totalEmployees;
        this.balance = balance;
	}
	public void makeDeposit1(){
		System.out.println("Money is being deposited");
	}
	
	public double makeDeposit(double x){
		System.out.println("Money is being deposited. New balance is:"+(balance+x));
				return balance +x;
	}
	
	public double withdrawMoney(double y){
		System.out.println("Money is being withdrawn.New balance is : "+(balance-y-0.1));//so no extra calculation is needed
		return balance-y-0.1;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
