package com.vektoreljava;

public class Test {

	public static void main(String[] args) {
		ISorular iSorular = new OssMatematikSorulari();
		iSorular.birinciSoruCalistir(1000, 100);
		iSorular.ikinciSoruCalistir(2, 4, 10);
		iSorular.ucuncuSoruCalistir();
		iSorular.dorduncuSoruCalistir(7);
		iSorular.besinciSoruCalistir(234);
		iSorular.altinciSoruCalistir();
		iSorular.yedinciSoruCalistir(1, -2, 5, 20);
		iSorular.sekizinciSoruCalistir(4, 2, 6880, 20);
		iSorular.dokuzuncuSoruCalistir();
		iSorular.onuncuSoruCalistir();
		
	}

}
