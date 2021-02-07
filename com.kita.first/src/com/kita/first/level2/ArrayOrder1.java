package com.kita.first.level2;

public class ArrayOrder1 {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		// arr[0] = arr[2];
		// {2, 67, 2, 11, 6, 90}
		int temp;
		temp = arr[0]; // 34
		arr[0] = arr[2]; // {2, 67, 2, 11, 6, 90}
		arr[2] = temp; // {2, 67, 34, 11, 6, 90}
		
		// arr를 오름차순으로 순차정렬하기
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i] > arr[z]) {
					temp = arr[i]; 
					arr[i] = arr[z]; 
					arr[z] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) { 
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		// forEach문 사용해서 배열 안의 값 출력
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}






