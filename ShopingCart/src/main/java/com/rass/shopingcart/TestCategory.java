package com.rass.shopingcart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context = 
             new AnnotationConfigApplicationContext();


context.scan("com.rass");	
context.refresh();


context.getBean("category");
System.out.println("Bean created successfully");
		
		
	}

}
