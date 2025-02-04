package com.corejava;

import java.util.logging.LoggingPermission;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException {

		ClassB classb = new ClassB();
		
		classb.getMessage();
		//classb.getMessage1();
		ClassA classa = (ClassB) new ClassB();
		classa.getMessage();
		
		classb.add(10, 20);
		classb.add(10, 20, 30);
		
		System.out.println("Classloader of this class:"
		        + ClassB.class.getClassLoader());
		System.out.println("Classloader of Logging:"
		        + LoggingPermission.class.getClassLoader());
		
		
	}

}
