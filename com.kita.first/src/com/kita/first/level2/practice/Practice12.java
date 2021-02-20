package com.kita.first.level2.practice;

import java.util.Arrays;

public class Practice12 {
	public static void main(String[] args) {
		String[] arr1 = {"사과", "포도", "딸기", "귤"
						, "바나나", "코코넛"};
		String[] arr2 = new String[arr1.length];
		
		// arr2 안에 arr1의 값들을 복사하여 출력
		// arr2 안의 값들을 좋아하는 과일들로 바꾸기
		// arr2의 바뀐 값들 다시 출력
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		arr2[2] = "배";
		arr2[3] = "수박";
		System.out.println(Arrays.toString(arr2));
	}
}
