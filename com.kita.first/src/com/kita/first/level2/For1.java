package com.kita.first.level2;

public class For1 {
	public static void main(String[] args) {
//			A		B		C
//		for(초기식; 조건식; 증감식) {
//			D
//			실행식
//		}
		for(int i=0; i<10; i++) {
			System.out.println(i+"입니다.");
		}
		
//		A > B > D > C
//			B > D > C
//			B > D > C	
		
		// 1에서 5까지 반복문
		// 1회 반복했습니다.
		// 2회 반복했습니다.
		// ...
		// 5회 반복했습니다.
		
		for(int i=1; i<6; i++) {
//			System.out.println((i+1)+"회 반복했습니다.");
			System.out.printf("%d회 반복했습니다.\n", i);
		}
		
	}
}









