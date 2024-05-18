package in.learning.java8features.interfacestaticAndDefaultMethods;

public interface InterfaceOne {

	//abstract methods/Non-implemented methods
	void printNames();
	String getNames();
	
	//How to create default methods
	
	default void defaultMethodOne() {
		//logic 
		System.out.println("inside default method one...");
		
	}
	
	default String defaultMethodTwo() {
		//logic 
		System.out.println("inside default method Two...");
		return "defaultMethodTwo";
	}
}
