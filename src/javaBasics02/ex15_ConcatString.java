package javaBasics02;

public class ex15_ConcatString {
	public static void main(String[] args) {

		String first_name = "Suresh";
		String last_name = "Aryaav";
		int a = 10;
		int b = 10;

		System.out.println(first_name + last_name + a + b);
		// PramodDutta1010 - first operator - + performed as Concatenation

		System.out.println(a + b + first_name + last_name);
		// First + math -> 20PramodDutta

		System.out.println(first_name + last_name + (a + b));

		// BODMAS rule - Bracket of Div, mul, add, sub
		System.out.println((9 * 3 / 9 + 1) * 3);
        System.out.println((27 / 9 + 1) * 3);
	}
}
