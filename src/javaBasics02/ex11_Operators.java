package javaBasics02;

import java.util.Scanner;

public class ex11_Operators {
	public static void main(String[] args) {
		int a=10, b=3;
		float c=3.14f;
		
		Scanner input =new  Scanner(System.in);
		System.out.println("The value of a & b is:");
		a=input.nextInt();
		b=input.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
}
