package in.learning.java8features.interfacestaticAndDefaultMethods;

public class ClassOne implements InterfaceOne {

	//Implementation of abstract method inside a class
	
	@Override
	public void printNames() {
		System.out.println("printing names");

	}

	@Override
	public String getNames() {
		System.out.println("getting names");
		return "deafult method name";
	}
	
	
	

}
