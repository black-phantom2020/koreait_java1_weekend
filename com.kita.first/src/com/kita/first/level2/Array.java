package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		char[] arr2 = new char[10];
		double[] arr3 = new double[100];
		// 기본형 변수들의 기본값
		// 숫자형 : 0
		// char : (빈값) 숫자로 변환 시 0
		// boolean : false
		
		String[] arr4 = new String[10];
		// 참조형 변수의 기본값 : null
		
		arr1[0] = 1;
		System.out.println("arr1[0]: " + arr1[0]);
		arr1[2] = 5;
		System.out.println("arr1[2]: " + arr1[2]);
		
		int[] arr7 = {10, 20, 30, 40};
		arr7 = new int[] {10, 20, 30};
		
		int len = arr1.length;
		
		// 배열 안에 값 집어넣기
		for(int i=0; i<=arr1.length-1; i++) { 
					// i<arr1.length
			arr1[i] = 3;
		}
		
		// 배열 안의 값 출력하기
		for(int i=0; i<arr1.length; i++) { 
			System.out.print(arr1[i] + ", ");
		}
		
		
		
	}
}





