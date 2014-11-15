package static_example;

//Write a BankAccount class. It should have actHolderName, accountNumber, initialAmount properties.
//accountNumber should get incremented and assigned automatically to the object everytime when a BankAccount object is created

public class BankAccount {

	private String accHolderName;
	private int accountNumber;
	double initialAmount;
	
	private static int incrementAccount;
	
	public BankAccount(){
		this.initialAmount=5;
	}
	
	//constructor
	public BankAccount(String accHolderName, int initialAmount){
		this.accHolderName=accHolderName;
		this.initialAmount=initialAmount;
		incrementAccount++; //its static integer which will be shared across all objects
		//every time constructor will be called, this value will be incrementted by 1
		accountNumber=incrementAccount; //no need for this. because accountNumber is not shared(not passed here as par)
		//if class and local var defined with same name, the LOCAL var will get used, not class var 
		
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

}
