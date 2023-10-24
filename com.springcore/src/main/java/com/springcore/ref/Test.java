package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A a1 = (A) context.getBean("aref");
		System.out.println("value of x of the from the A class object                    :- "+a1.getX());
		System.out.println("value of y of the from the B class object of A class object  :- "+a1.getB().getY());
		System.out.println(a1.toString());
	}

}
