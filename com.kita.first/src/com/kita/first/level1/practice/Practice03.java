package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
//		수학 응시 유형을 입력해 주세요(가/나): 
//		점수를 입력해 주세요:
//			 
//		가형 기준 : 60
//		나형 기준 : 70
//			 
//		"평균 미만입니다."
//		"평균입니다."
//		"평균 초과입니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해 주세요(가/나): ");
		String type = sc.next();
		System.out.print("점수를 입력해 주세요: ");
		int score = sc.nextInt();
		
		int avg = 0;
		
		if("가".equals(type)) {
			avg = 60;
		} else if("나".equals(type)) {
			avg = 70;
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		if(avg == 0) {
			System.out.println("다시 입력해주세요.");
		} else if(score < avg) {
			System.out.println("평균 미만입니다.");
		} else if(score > avg) {
			System.out.println("평균 초과입니다.");
		} else {
			System.out.println("평균입니다.");
		}
	}
}














