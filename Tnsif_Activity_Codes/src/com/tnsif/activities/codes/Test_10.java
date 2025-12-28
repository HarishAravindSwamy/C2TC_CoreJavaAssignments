package com.tnsif.activities.codes;

	class E1 {
		E1(int x) {
			System.out.println("E1: " + x);
		}
	}

	class F1 extends E1 {
		F1() {
			super(10); // Calls parent constructor
			System.out.println("F1 constructor");
		}
	}

	public class Test_10 {
		public static void main(String[] args) {
			F1 obj = new F1();
		}
	}


