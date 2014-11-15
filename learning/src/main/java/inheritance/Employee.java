package inheritance;

//Create an Employee Class with IdNum, exprYr. 
//Define a default and overloaded constructor 
//for Person class and Employee Class.  
//Employee class constructor should have all 5 
//properties.(2 of child and 3 of parent) 

public class Employee extends Person{
	int IdNum;
	int exprYr;
	
	//default constructor
	public Employee(){
		System.out.println("this is from child Employee");
	}
	
	//Child constructor with 2 properties initialized 
	public Employee (int IdNum, int exprYr){
		this.IdNum=IdNum;
		this.exprYr=exprYr;
		System.out.println("This is from child Employee constructor with 2 properties");
		
	}
	//employee class constructor with 5 properties called? or initialized?
	public Employee(String name, int age, String gender, int IdNum, int exprYr){
		super(name, age, gender);// parent properties
		this.IdNum=IdNum;
		this.exprYr=exprYr;
		
	}
	public int getIdNum() {
		return IdNum;
	}
	public void setIdNum(int idNum) {
		IdNum = idNum;
	}
	public int getExprYr() {
		return exprYr;
	}
	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}

	
	
}
