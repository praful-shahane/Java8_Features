package in.learning.java8features.interfacestaticAndDefaultMethods;

public class TestingDefaultMethods {

	public static void main(String[] args) {
		 ClassOne one = new ClassOne();
		 
		 //accessing of default methods
		 one.defaultMethodOne();
		 String result = one.defaultMethodTwo();
		 System.out.println(result);
		 //accesing overriden methods.
		 one.getNames();
		 /*
		  * output
		  * --------
 inside default method one...
inside default method Two...
defaultMethodTwo
getting names
		  */
		 
		 
		 
		 }

}
