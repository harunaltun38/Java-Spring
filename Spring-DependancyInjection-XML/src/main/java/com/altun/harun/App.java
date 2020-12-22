package com.altun.harun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Car car = new Car();
		// Vehicle obj = new Car();
		// obj.drive();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// xml basiert Abschnitt spring.xml
		// Vehicle obj= (Vehicle)context.getBean("vehicle");

		// Annotationsbasiert basiert Abschnitt spring.xml
		 Vehicle obj= (Vehicle)context.getBean("car");
		 obj.drive();
		
		
		//Tyre t = (Tyre)context.getBean("tyre");
	//	System.out.println(t);
	}
}
