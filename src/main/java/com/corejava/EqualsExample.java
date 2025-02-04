package com.corejava;

public class EqualsExample {

	public static void main(String[] args) {
		
		String s1 = "chandu";
		
		String s2 = "chandu";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		StudentImpl s3 = new StudentImpl("mkyong", 35, "111222333");
		StudentImpl s4 = new StudentImpl("mkyong", 35, "111222333");
		StudentImpl s5 = s4;
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s4==s5);
	}
}
