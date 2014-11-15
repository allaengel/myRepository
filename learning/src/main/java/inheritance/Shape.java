package inheritance;

public abstract class Shape {
	
	String name;
	
	public Shape(){
	}
	//define overloaded constructor that takes parameter String name and sets that value to name property
	public Shape (String name){
		this.name=name;
	}
	
	//declare one abstract method
	public abstract double getArea();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
