package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Yes , It's me. ");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/main/springConfiguration.xml");
		Student st1 = (Student) applicationContext.getBean("student1");
		System.out.println(st1);
		Student st2 = (Student) applicationContext.getBean("student2");
		System.out.println(st2);
		Student st3 = (Student) applicationContext.getBean("student3");
		System.out.println(st3);
	}
}
