package com.kita.first.level2.practice;

public class Practice05 {
	public static void main(String[] args) {
//		while문에 조건식을 사용하여
//		1~100을 모두 더한 값이 출력되도록 하세요
//		합계: 5050
		
		int n = 1;
		int total = 0;
		
		while(true) {
			if(n==101) {
				break;
			}
//			total = total + n;
			total += n;
			n++;
		}
		System.out.printf("합계: %d", total);
//		System.out.println("합계: " + total);
	}
}
