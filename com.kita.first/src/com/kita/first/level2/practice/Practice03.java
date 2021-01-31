package com.kita.first.level2.practice;

public class Practice03 {
	public static void main(String[] args) {
		// 2 ~ 9단 찍기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 9 * 9 = 81
		
		// 2 * 1 = 2	2 * 2 = 4 ... 2 * 9 = 18
		// 3 * 1 = 3	3 * 2 = 6 ... 3 * 9 = 27
		// ...
		// 9 * 1 = 9	9 * 2 = 18 ... 9 * 9 = 81
		
		
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d * %d = %2d\n", dan, i, (dan * i));
//			}
//			System.out.println();
//		}
		
		for(int dan=2; dan<10; dan++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %2d\t", dan, i, (dan * i));
			}
			System.out.println();
		}
	}
}





