package com.kita.first.level2;

public class For2 {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int z=0; z<2; z++) {
				for(int k=0; k<4; k++) {
					System.out.printf("i: %d, z: %d, k: %d\n", i, z, k);
				}
			}
		}
	}
}
