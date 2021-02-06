package com.kita.first.level2;

public class Random {
	public static void main(String[] args) {
		double n = Math.random(); // 0 ~ 0.99999999999999
						// 0 <= n < 1
		System.out.println("n: " + n);
		
		// 1 ~ 10
		int n2 = (int)(Math.random() * 10 + 1);
		// 0 * 10 <= mr * 10 < 1 * 10
		// 0 <= mr * 10 < 10  	// 0.0 ~ 9.9999
		// 0 + 1 <= mr * 10 + 1 < 10 + 1
		// 1 <= mr * 10 + 1 < 11   // 1.0 ~ 10.9999
		System.out.println("n2: " + n2);
		
		// 1~5
		// 0 ~ 4   // 0 + 1 <= n+1 < 5 + 1
		int n3 = (int)(Math.random() * 5 + 1);
		System.out.println("n3: " + n3);
		
		// 2 ~ 13
		// 0 ~ 11   // 0 + 2 <= n * 12 + 2 < 12 + 2
		int n4 = (int)(Math.random() * 12 + 2);
		System.out.println("n4: " + n4);
		
		// 17 ~ 51
		// 0 ~ 34   0 + 17 <= n * 35 + 17 < 35 + 17
		int n5 = (int)(Math.random() * 35 + 17);
		System.out.println("n5: " + n5);
		
		int max = 51;
		int min = 17;
		int rNum = (int)(Math.random() * (max - min + 1) + min);
	}
}







