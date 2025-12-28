package com.tnsif.activities.codes;

public class Test_3 {
	int x;

	Test_3(int x) {
		this.x = 10;
	}

	void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		Test_3 obj = new Test_3(0);
		obj.show();
	}
}

