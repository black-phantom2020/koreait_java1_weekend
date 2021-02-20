package com.kita.first.level2;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4}; // arr1[0] == 1
		int[] arr2 = arr1;
		// {0, 2, 3, 4}
//		arr2[0] = 0;
//		System.out.println(arr1[0]);
		System.out.println("arr1: " + arr1);
		System.out.println("arr2: " + arr2);
		
		int[] arr3 = new int[arr1.length]; 
		// {0, 0, 0, 0}
		
//		arr3[0] = arr1[0];
//		arr3[1] = arr1[1];
//		arr3[2] = arr1[2];
//		arr3[3] = arr1[3];
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println(arr3[i] + ", ");
//		}
//		
//		for(int val : arr3) {
//			System.out.println(val + ", ");
//		}
		
		System.out.println(Arrays.toString(arr3));
		System.out.println("arr3: " + arr3);
		
		arr3[0] = 0;
		System.out.println("arr1[0]: " + arr1[0]);
		System.out.println("arr3[0]: " + arr3[0]);
	}
}







