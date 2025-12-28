package com.tnsif.activities.codes;

	class A3 {
		static void display() {
			System.out.println("A display");
		}

	}

	class B3 extends A3 {
		void show() {
			System.out.println("B display");
		}
	}

	public class Test_5 {
		public static void main(String[] arg) {
			B3 obj = new B3();
			obj.display();
			obj.show();
		}
	}

