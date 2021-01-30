package com.kita.first.level1;

public class Equals {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 3;
		int n3 = 3;
		
		boolean result1 = (n1 == n2);
		System.out.println("result1: "+result1);
		
		boolean result2 = (n1 != n2);
		System.out.println("result2: " +result2);
//		>, <, >=, <=
		boolean result3 = ((n1 != n2) && (n2 == n3));
		System.out.println();
		System.out.println();
		System.out.println();
		
		String str1 = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		
		boolean result4 = (str1 == str2);
		System.out.println("result4: " +result4);
		boolean result5 = (str1 == str3);
		System.out.println("result5: " +result5);
		
		boolean result6 = ("안녕".equals(str3));
		System.out.println("result6: " +result6);
		
		boolean result7 = (str2.equals(str3));
		System.out.println("result7: " +result7);
	}
}








