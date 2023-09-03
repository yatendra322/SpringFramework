package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springConfiguration.xml");
    Student st1=(Student)applicationContext.getBean("student1");
    System.out.println(st1);
  }
}
