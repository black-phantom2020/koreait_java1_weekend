package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
//		int[] arr = new int[100];
		int[] arr1 = new int[5]; // {0, 0, 0, 0, 0}
		char[] arr2 = new char[10]; // { , , , , ... , }
		double[] arr3 = new double[100];  // {0.0, 0.0, ... 0.0}
		boolean[] arr8 = new boolean[3]; // {false, false, false}
		// 기본형 변수들의 기본값
		// 숫자형 : 0
		// char : (빈값) 숫자로 변환 시 0
		// boolean : false
		
		String[] arr4 = new String[10]; // {null, null, ..., null}
		// 참조형 변수의 기본값 : null
		
		// 순서 :   1  2  3  4  5
		// index : 0  1  2  3  4
		// arr1 : {0, 0, 0, 0, 0}
		arr1[0] = 4; // arr1 : {4, 0, 0, 0, 0}
		System.out.println("arr1[0]: " + arr1[0]);
		arr1[2] = 5; // arr1 : {4, 0, 5, 0, 0}
		System.out.println("arr1[2]: " + arr1[2]);
		
		for(int val : arr1) {
			System.out.print(val + ", ");
		}
		System.out.println();
		int[] arr7 = {10, 20, 30, 40};
		arr7 = new int[] {10, 20, 30};
		
		int len = arr1.length;
		
		// int배열 arr1 안에 각각 3 집어넣기
		// 순서 :   1  2  3  4  5(==arr1.length)
		// index : 0  1  2  3  4(==arr1.length-1)
		// arr1 : {4, 0, 5, 0, 0}
		// arr1.length번 반복
		arr1[0] = 3;
		arr1[1] = 3;
		arr1[2] = 3;
		arr1[3] = 3;
		arr1[4] = 3;
		// arr1[ ] = 3;
		for(int i=1; i<10; i++) { // i<=9  // i<9+1
			
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = 3;
		}
		for(int i=0; i<=arr1.length-1; i++) { 
			arr1[i] = 3;
		}
		
		// 배열 안의 값 출력하기
		// arr1: {3, 3, 3, 3, 3}
		for(int i=0; i<=arr1.length-1; i++) { 
			
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) { 
			System.out.print(arr1[i] + ", ");
		}
		
		
		
	}
}





