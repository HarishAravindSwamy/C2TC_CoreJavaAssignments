package com.tnsif.activities.codes;

	class A2 {
		int x = 10;
	}

	class B2 extends A2 {
		int x = 20;

		public String toString() {
			// System.out.println(x);
			return "x" + super.x + /* to call parent variable */this.x;// to call child class variable

		}
	}

	public class Test_4 {
		public static void main(String[] args) {
			A2 b = new B2();
			System.out.println(b.toString());
		}
	}

