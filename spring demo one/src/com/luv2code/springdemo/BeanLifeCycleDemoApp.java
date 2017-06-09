package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		//retrieve bean from spring container
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		 
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach == alphaCoach);
		
		System.out.println("\n pointing to the same object: "+result);
		
		System.out.println("\n Memory location for the coach:"+theCoach);
		
		System.out.println("\n Memory location for alpha coach" +alphaCoach+ "\n");
		
		context.close();

	}

}
