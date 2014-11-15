package inheritance;

	public class EmployeeClassCaller {
//Write an Employee class caller. Create 2 objects one without any arguments and other 
//with setting all the properties. 

//	Print out all the properties for both the objects. 
		
		//good idea ALWAYS to define DEFAULT constructor
		public EmployeeClassCaller(){
			System.out.println("This is from EmployeeClassCaller");
		}
	
		public static void main(String args[]){
		
		//do object have to have the same name as class?
		//Employee myEmployee = new Employee (String gender, int age, String name, int IdNum, int expYr);
		
		Employee myEmployee1 = new Employee(); //created object without any args
		//created object with setting 5 properties
		Employee myEmployee2 = new Employee("Fima",25,"male",123, 10);
		
		System.out.println("Employee name is: "+myEmployee2.getName());
		System.out.println("Employee age is: "+myEmployee2.getAge());
		System.out.println("Employee gender is: "+myEmployee2.getGender());
		System.out.println("Employee age is: "+myEmployee2.getIdNum());
		System.out.println("Employee age is: "+myEmployee2.getExprYr());
		
		//defined by Prashant
		System.out.println("Properties of employee are: ");
		System.out.println("IdNum :"+myEmployee2.getIdNum()+", expeYear : "+myEmployee2.getExprYr()+", "
				+ "\n gender: "+myEmployee2.gender+", name is :"+myEmployee2.name+", age is:"+myEmployee2.age);
		
		
		
		
		
		
		
		
		
	}
	
}
