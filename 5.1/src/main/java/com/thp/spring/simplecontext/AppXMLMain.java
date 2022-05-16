package com.thp.spring.simplecontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXMLMain {

	public AppXMLMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        ApplicationContext Context = new ClassPathXmlApplicationContext("/simple-spring-context/src/main/resources/applicationContext.xml");

     Moussaillon moussaillon=   (Moussaillon) Context.getBean("moussaillon") ;
		
     moussaillon.speak();
	}

	
	
}
