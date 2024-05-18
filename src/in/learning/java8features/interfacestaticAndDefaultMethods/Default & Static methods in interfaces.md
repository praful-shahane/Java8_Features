# Java8_Features
Java8_Features
# Default & Static methods in interfaces
================================================

Agenda
===========
1)What is default & static methods in interfaces ?
2)Importance of default methods in interfaces ?
3)What is backwordCompatibility with default methods ?
4)UseCases of Default methods ?
5)Importance of static methods in interfaces ?
6)Difference between static methods and default methods ?
7)predefined default/static methods in interfaces ?


1)Until JAVA 7, in an interface, we have only one abstract method.
   we not able to provide implementation inside a interface.
   asbtract nethod means method has no implementation.
  
  public interface Iabc{
          
          //only abstract method
  }
  
2)after JAVA 8, we can have default methods and static methods in interface.

public interface Iabc{
          
          // abstract method
          // static method
          // default method
  }
  
 a)we can define any number of abstract methods inside interface.
 b)we can define any number of default methods inside inteeface.

3)How to create default method inside a interface?
=> we need to add "default" keyword with methodName.
example:- 

public interface Iabc{
          
          // abstract method
          // static method
          // default method
          
          deafult  void methoddeafault(){
             System.out.println("Hello deafult method");
          }
          
          deafult  String methoddeafault2(){
             System.out.println("Hello deafult method 2");
             return "Nice";
          }
  }
  
 4)To Access default method of an interface, we need to create 
 object of a class who implementing that interface.
 otherwise we can not access default methods of interface.
 
 ex:- 
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
 
 main()
 --------
 		ClassOne one = new ClassOne();
		 one.defaultMethodOne();
		 String result = one.defaultMethodTwo();
		 System.out.println(result);
		 
output
-------
inside default method one...
inside default method Two...
defaultMethodTwo




		 
		 
		 
 
 
 
 
 
 
 
 
 
 
 
  
  
  
  
  
  

