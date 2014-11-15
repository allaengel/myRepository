package inheritance;

//Branch class extends Bank class, it has these properties : Branch Name, Branch address 
//Branch class overrides the withdrawMoney function and provides its own implementation.

public class Branch extends Bank{
	String branchName;
	String branchAddress;
	
	//default constructor
	public Branch (){
		System.out.println("Default constructor");
	}
	//defining the constructor
	public Branch(String bankAddress, int totalEmployees , double balance, String branchName, String branchAddress){
		super(bankAddress, totalEmployees, balance);
		
	}
	
	@Override
	public double withdrawMoney(double y){
		System.out.println("Money withdrawal is at the Branch without processing fee of 0.1");
		System.out.println("new balance: "+(this.getBalance()));
		return this.getBalance();
			
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
	
}
