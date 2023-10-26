package com.springcore.ci;

public class Addition {

	private int a;
	private int b;

	public Addition(float a, float b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double ,double");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int ,int");
	}
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String ,String");
	}

	public void doSum() {
		System.out.println("The value of a = "+this.a);
		System.out.println("The value of b = "+this.b);
		System.out.println("Sum is :- " + (this.a + this.b));
	}

}
