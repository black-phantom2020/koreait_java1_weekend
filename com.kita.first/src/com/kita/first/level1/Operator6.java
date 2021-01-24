package com.kita.first.level1;

public class Operator6 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 3;
		int n3 = 4;
		
		boolean result;
		result = (n1==n2 && n2==n3 && n1==n3);
		System.out.println(result);
		result = (n1==n2 || n2==n3 || n1==n3);
		System.out.println(result);
	}
}
