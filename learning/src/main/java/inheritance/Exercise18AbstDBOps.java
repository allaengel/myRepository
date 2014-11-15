package inheritance;

//this class implements interface, which means it will have to implement all methods of interface. 
//But this class decides to provide implementation of only 1  method and delegate 3 remaining methods
//to further child classes.In order to do that you need to define this class as abstract, which may provide implementation
//for some methods but not the others

public abstract class Exercise18AbstDBOps implements Exercise18MySQKDBOps{

	/*@Override
	public int create() {
		// TODO Auto-generated method stub
		return 0;
	}


	//public int update();

	*/
}
