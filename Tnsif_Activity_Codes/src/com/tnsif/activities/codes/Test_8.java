package com.tnsif.activities.codes;

	class C2 {
		void show(int a) {

		}
	}

	class D2 extends C2 {
		void show(int a) {
			System.out.println();
		}
	}

	public class Test_8 {
		public static void main(String[] args) {
			C2 obj = new D2();
			obj.show(0);
		}
	}


