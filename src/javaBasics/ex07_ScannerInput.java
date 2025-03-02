package javaBasics;

import java.util.Scanner;

public class ex07_ScannerInput {
	public static void main(String[] args) {
		String name = null;

		System.out.println("My name is :" + name);
		Scanner input = new Scanner(System.in);
		name = input.next();
	}
}
