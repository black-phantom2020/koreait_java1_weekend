package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원
		
//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원
		
		Scanner scan = new Scanner(System.in);
		String[] menuArr = {"콜라", "사이다", "캔커피"
							, "데자와", "환타", "웰치스", "솔의눈"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000, 800};
		int num;
		int total=0;
		
		System.out.println("--메뉴--");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1
						, menuArr[i], priceArr[i]);
		}
		System.out.println();
		
		while(true) {
			System.out.print("메뉴를 입력하세요(0 입력 시 종료): ");
			num = scan.nextInt();
			
			if(num < 0 || num > menuArr.length) {
				System.out.println("범위 내의 값을 입력해주세요.");
				continue;
			} else if(num == 0) {
				break;
			}
			
			System.out.printf("%s %d원\n", menuArr[num-1]
							, priceArr[num-1]);
			total += priceArr[num-1];
		}
		
//		System.out.println("합계: " + total + "원");
		System.out.printf("합계: %d원\n", total);
	}
}
