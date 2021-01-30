package com.kita.first.level1;

public class Switch {
	public static void main(String[] args) {
		int num = 1;
		String str = "가";
		switch(str) { // 문자열 비교
		case "가":
			System.out.println("가");
			break;
		case "나":
			System.out.println("나");
			break;
		default:
			System.out.println("다");
		}
		
	}
}
