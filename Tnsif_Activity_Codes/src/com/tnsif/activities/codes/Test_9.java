package com.tnsif.activities.codes;

	class C3 {
		void show() {
			C3 obj = new D3();

			System.out.println("C3");
		}
	}

	class D3 extends C3 {
		void show() {

			System.out.println("D3");
		}
	}

	public class Test_9 {
		public static void main(String[] arg) {

			C3 obj = new C3();
			obj.show();

		}
	}

