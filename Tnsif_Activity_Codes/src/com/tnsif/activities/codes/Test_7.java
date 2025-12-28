package com.tnsif.activities.codes;

	import java.util.Scanner;

	class C1 {
	}

	class D1 extends C1 {
	}

	public class Test_7 {
		public static void main(String[] args) {

			C1 obj = new D1();
			C1 b = obj;

			System.out.println("Casting successful");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int n = sc.nextInt();

			System.out.println("You entered: " + n);
			sc.close();
		}
	}

