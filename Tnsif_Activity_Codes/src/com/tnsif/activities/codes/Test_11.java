package com.tnsif.activities.codes;

	class E2 {
		protected int x = 5; // made accessible to child
	}

	class F2 extends E2 {
		int x = 15;

		void print() {
			System.out.println(super.x); // prints parent variable
		}
	}

	public class Test_11 {
		public static void main(String[] args) {
			F2 obj = new F2();
			obj.print();
		}
	}

