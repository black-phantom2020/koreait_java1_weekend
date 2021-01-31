package com.kita.first.level2;

public class Continue {
	public static void main(String[] args) {
//		for(int i=0; i<9; i++) {
//			if(i == 5) {
//				System.out.println("continue를 만납니다.");
//				continue;
//			}
//			System.out.printf("i는 %d입니다\n", i);
//		}
		
		for(int i=0; i<4; i++) {
			for(int z=0; z<5; z++) {
				if(z==2) {
//					continue;
					break;
				}
				System.out.printf("i: %d, z: %d\n", i, z);
			}
		}
	}
}






