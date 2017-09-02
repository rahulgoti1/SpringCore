package com.rv.spring.lifecycle.SpringLifeCycle;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rv.spring.lifecycle.bean.*;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		// With DI
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
		System.out.println("Address : " + student.getAddress());
		System.out.println("Adhar : " + student.getAdhar());
		System.out.println("Bio : " + student.getBio());
		((AbstractApplicationContext) context).registerShutdownHook();

	}
}
