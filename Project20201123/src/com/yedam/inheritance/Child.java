package com.yedam.inheritance;

public class Child extends Parent {
	String field2;

	public Child() {
		super();
	}

	public Child(String field1, String field2) {
		super(field1);
		this.field2 = field2;
	}

	public void method2() {
		super.method1();
		System.out.println("method2() 호출.");
	}

}// end of class