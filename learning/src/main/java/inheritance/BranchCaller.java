package inheritance;

public class BranchCaller {
	public static void main(String args[]) {
        
        Branch branch1 = new Branch("22 Main Street", 32, 500, "Mall Branch", "3 Mall Lane");
        Branch branch2 = new Branch("732 Evergreen Terrace", 8, 4300, "Springfield Branch", "1 Simpson Blvd");
        Branch branch3 = new Branch("4 Park Road", 14, 2100, "Green Space", "7 Green Street");
         
        printProp(branch1);
        printProp(branch2);
        printProp(branch3);             
    }
     
    public static void printProp(Branch bran) {
        System.out.println("Bank Name: "+bran.getBankName());
        System.out.println("Bank Address: "+bran.getBankAddress());
        System.out.println("Total Employees: "+bran.getTotalEmployees());
        System.out.println("Branch Name: "+bran.getBranchName());
        System.out.println("Branch Address: "+bran.getBranchAddress());     
        bran.withdrawMoney(15);
        bran.makeDeposit(100);
        System.out.println("******************************************************");
    }
}
