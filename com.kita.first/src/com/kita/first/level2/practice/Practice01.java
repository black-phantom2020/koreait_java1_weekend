package com.kita.first.level2.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 구구단 2단 찍기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		for(int i = 1; i < 10; i++) {
//			System.out.println(2 + " * " + i + " = " + (i * 2));
			System.out.printf("2 * %d = %2d\n", i, (2*i));
		}
	}
}
