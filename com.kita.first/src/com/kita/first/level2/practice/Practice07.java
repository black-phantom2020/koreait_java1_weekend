package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
//		랜덤값 10~90을 맞추는 게임
//		UP / DOWN /Great!!
		int max = 90;
		int min = 10;
		int rNum = (int)(Math.random() * (max - min + 1) + min);
		Scanner sc = new Scanner(System.in);
		int myNum;
		
		while(true) {
			System.out.printf("정수 하나 입력하시오(%d ~ %d): \n", min, max);
			myNum = sc.nextInt();
			if(myNum > max || myNum < min) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(rNum > myNum) {
				System.out.println("UP");
			} else if(rNum < myNum) {
				System.out.println("DOWN");
			} else {
				sc.close();
				System.out.println("GREAT!!!");
				break;
			}
		}
	}
}






