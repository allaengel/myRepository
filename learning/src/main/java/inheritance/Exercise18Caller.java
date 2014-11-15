package inheritance;

public class Exercise18Caller {

	public static void main(String args[]){
		
		 //the type should be of INTERFACE (since it's just another class and it helps to create
		// generic array of similar objects of the same type (SQL and Oracle) &create the object of that class
		
		Exercise18MySQKDBOps mySql= new Exercise18MySQKDB();
		Exercise18MySQKDBOps oracle = new Exercise18MySQKDB();
		
		System.out.println(mySql.update());
		System.out.println(oracle.update());
	}
}
