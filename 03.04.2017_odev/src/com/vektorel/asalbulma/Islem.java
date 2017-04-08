package com.vektorel.asalbulma;

public class Islem {
	public static void main(String[] args) {
		AltSinif altSinif = new AltSinif();
		int[][][][] diziDortBoyut = {
				{ { { 1, 2, 3, 4, 5 }, { 10, 9 }, { 8, 7, 6, 5 } }, { { 13, 17, 21 }, { 97, 43 } },
						{ { 47 }, { 11, 80, 49 }, { 50, 52 }, { 53, 57 } } },
				{ { { 108, 107, 106, 105 }, { 104, 103, 102 } }, { { 67, 29, 31 }, { 63, 37 } } } };
		
		
		altSinif.asalDegerleriYazdir(diziDortBoyut);
	}
}
