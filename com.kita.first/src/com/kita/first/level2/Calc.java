package com.kita.first.level2;

public class Calc {
//	public static (리턴타입 or void) 메소드명동사형(매개변수) {
//		실행코드
//		return 리턴타입 값;
//	}
	public static void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	// int값을 2개 받아서 둘을 더한 값을 돌려주는 메소드
	public static int sum(int n1, int n2) {
//		int result = n1 + n2;
//		return result;
		return n1 + n2;
	}
	// 오버로드(오버로딩) Overloading
	// 개수, 타입, 
	public static double sum(double n1, double n2) {
		return n1 + n2;
	}
	
	public static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public static int sum(int... arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	// 전원 끄는 메소드
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	// int값을 2개 받아서 둘을 뺀 값을 돌려주는 메소드
	// 단, 두 값 중에 큰 수에서 작은 수를 빼서
	// 결과가 무조건 양수 또는 0으로 나오게 만드시오
	public static int minus(int n1, int n2) {
		int result;
		
		if(n1 > n2) {
			result = n1 - n2;
		} else {
			result = n2 - n1;
		}
		
		return result;
	}
	// int값을 2개 받아서 둘을 곱한 값을 돌려주는 메소드
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	// int값을 2개 받아서 둘을 나눈 값(실수)을 돌려주는 메소드
	public static double divide(int n1, int n2) {
		double result = (double)n1 / n2;
		return result;
	}
}







