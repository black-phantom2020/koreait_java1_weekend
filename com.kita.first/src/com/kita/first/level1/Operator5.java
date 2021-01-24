package com.kita.first.level1;

public class Operator5 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		System.out.println(n1 == n2);
		boolean result = (n1 == n2);
		n2 = 3;
		result = n1 == n2;
		System.out.println(result);
		System.out.println(!result);
		System.out.println(!!result);
		
		result = (n1 > n2);
		System.out.println(result);
		
		n2 = 5;
		result = (n1 != n2);
		System.out.println(result);
	}
}








