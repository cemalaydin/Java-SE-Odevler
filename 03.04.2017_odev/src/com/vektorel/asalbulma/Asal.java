package com.vektorel.asalbulma;

public class Asal {

	public static void main(String[] args) {

	}

	public boolean sayiAsalmiKontrolEt(int sayi) {
		if (sayi == 2)
			return true;
		else if (sayi < 2)
			return false;
		else {
			for (int i = 2; i <= sayi / 2; i++) {
				if (sayi % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

	public void asalDegerleriYazdir(int[][][][] dortBoyutluDizi) {
		for (int i = 0; i < dortBoyutluDizi.length; i++) {
			for (int j = 0; j < dortBoyutluDizi[i].length; j++) {
				for (int k = 0; k < dortBoyutluDizi[i][j].length; k++) {
					for (int l = 0; l < dortBoyutluDizi[i][j][k].length; l++) {
						System.out.print(this.sayiAsalmiKontrolEt(dortBoyutluDizi[i][j][k][l])
								? dortBoyutluDizi[i][j][k][l] + "\n" : "");
					}
				}
			}
		}
	}

}
