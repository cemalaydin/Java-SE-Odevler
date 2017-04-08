package com.vektorel.kalitimvemaksimumarraybulma;

public class Islem {

	public static void main(String[] args) {
		int[][][] diziUcBoyut = new int[][][] { { { 1, 2, 3, 4, 5, 6 }, { 10, 20, 30 } },
				{ { -5, -4 }, { -20, -21, -22 }, { 32, 23, 17 } }, { { 11, 12 }, { 13, 14 } } };

				Altsinif altsinif = new  Altsinif();
			System.out.println(altsinif.makDegerBul(diziUcBoyut));
				
	}

}
