package com.kita.first.level2.practice;

import java.util.Arrays;

public class Practice13 {
	public static void main(String[] args) {
		int[][] arr = new int[5][3];
		// { {1, 2, 3}, {4, 5, 6}, ... , {13, 14, 15} }
		int l = 1;
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				arr[i][z] = l++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
}



