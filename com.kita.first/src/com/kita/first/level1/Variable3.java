package com.kita.first.level1;

public class Variable3 {
	public static void main(String[] args) {
		// int < long < float < double < String
		int n1 = 1;
		int n2 = 3;
		double n3 = n1;
		System.out.println(n3);
		n3 = 10.1;
		System.out.println(n3);
		n1 = (int)n3;
		System.out.println(n1);
		
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		System.out.println(1 + "2" + 3);
		System.out.println("1" + 2 + 3);
		
		String s1 = "123";
		int n4 = Integer.parseInt(s1);
		int n5 = 1;
		System.out.println(n4 + n5);
	}
}















