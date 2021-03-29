package DesignPattern.FactoryDesignPattern.stat;
// Java program to demonstrate how to
// implement static and non-static 
// classes in a Java program. 
class OuterClass { 
	private static String msg = "GeeksForGeeks"; 

	// Static nested class 
	public static class NestedStaticClass { 

		// Only static members of Outer class 
		// is directly accessible in nested 
		// static class 
		public void printMessage() 
		{ 

			// Try making 'message' a non-static 
			// variable, there will be compiler error 
			System.out.println( 
				"Message from nested static class: "
				+ msg); 
		} 
	} 

	// Non-static nested class - 
	// also called Inner class 
	public class InnerClass { 

		// Both static and non-static members 
		// of Outer class are accessible in 
		// this Inner class 
		public void display() 
		{ 
			System.out.println( 
				"Message from non-static nested class: "
				+ msg); 
		} 
	} 
} 
class Main { 
	// How to create instance of static 
	// and non static nested class? 
	public static void main(String args[]) 
	{ 

		OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
		nested.printMessage();

		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.display();

	} 
} 
