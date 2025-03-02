package javaBasics02;

public class ex08_variablesWithMain {
	// This is the standard entry point for Java applications.
	// Since it is public static, the JVM will recognize and execute it when the
	// program runs.
	public static void main(String[] args) {
		System.out.println("Hello World!");

	}

	// It is not static, so the JVM does not recognize it as the starting method.
	// The parameter type is String instead of String[], meaning it is an overloaded
	// version of main, but not the actual entry point.
	public void main(String args) {
		System.out.println("Test");
	}

	// The JVM will ignore the second main method since it does not match the
	// signature of the standard entry point.
}
