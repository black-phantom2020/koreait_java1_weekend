package com.kita.first.level1;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오: ");
		int num = scan.nextInt();
		String sNum;
//		if(num % 2 == 1) {
//			sNum = "홀수";
//		} else {
//			sNum = "짝수";
//		}
//		System.out.printf("%s입니다.", sNum);
		
//		(조건식) ? true : false; // 조건연산자(삼항연산자)
		
		sNum = (num % 2 == 1) ? "홀수" : "짝수";
		System.out.printf("%s입니다.", sNum);
		
		
		
	}
}
