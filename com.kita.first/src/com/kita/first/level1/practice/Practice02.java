package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
//		스캐너로 정수값 하나 입력 받고
//		그 값이 홀수면 "홀수입니다."
//		짝수면 "짝수입니다."
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력해주세요: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
	}
}










