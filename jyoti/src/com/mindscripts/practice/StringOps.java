package com.mindscripts.practice;

public class StringOps {
	
	public static void main(String[] args) {
		String s = "Hello World";
		
		int length = s.length();
		System.out.println("Length = "+length);
		
		String s1 = s.toLowerCase();
		System.out.println("Lower case string is="+s1);
		
		String s2 =s.toUpperCase();
		System.out.println("Uooer case string is="+s2);
		
		char c = s.charAt(10);
		System.out.println("Character at index 10 is="+c);
		
		boolean contains = s.contains("ello");
		System.out.println("Contains sequence ello="+ contains);
		
		boolean startYesOrNo = s.startsWith("World");
		System.out.println("String Starts with World is ="+startYesOrNo);
		
	}

}