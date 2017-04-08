package com.vektorel.kalitimvemaksimumarraybulma;

public class MakArray {
	public int makDegerBul(int[][][] ucBoyutluDizi) {
		int makDeger = Integer.MIN_VALUE;
		for (int i = 0; i < ucBoyutluDizi.length; i++) {
			for (int j = 0; j < ucBoyutluDizi[i].length; j++) {
				for (int k = 0; k < ucBoyutluDizi[i][j].length; k++) {
					if (ucBoyutluDizi[i][j][k] > makDeger)
						makDeger = ucBoyutluDizi[i][j][k];
				}
			}
		}
		return makDeger;
	}
}
