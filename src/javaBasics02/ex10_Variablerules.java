package javaBasics02;

public class ex10_Variablerules {
	public static void main(String[] args) {
		int a = 10;
		byte b = 10;
		double c = 2.5;
		long d = 9876543210l; // -128 to 127 (circular)
		String e = "Suresh Aryaav";
		float f = 3.14f;
		boolean is_he_single = true;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		 System.out.println(f);
		System.out.println(is_he_single);
		 char ch = 'A';
		 System.out.println(ch);

		int val = 10;
		System.out.printf("Your variable name is  %d", val);
		// %d -> int, byte, long, short - data
		// %s
		// %f float, %b boolean

		final float PI = 3.14f; //not possible to change the value - Final

	}
}
