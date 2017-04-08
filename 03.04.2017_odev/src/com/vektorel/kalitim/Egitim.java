package com.vektorel.kalitim;

public class Egitim {
	String isim;
	String[] egitmenListesi;
	String[][] ogrenciListesi;

	// constructor
	public Egitim(String isim, String[] egitmenListesi, String[][] ogrenciListesi) {
		this.isim = isim;
		this.egitmenListesi = egitmenListesi;
		this.ogrenciListesi = ogrenciListesi;
	}

	public void egitimBilgileriYazdir() {
		System.out.println("Eðitim ismi: " + this.isim);
	}

	public void egitmenleriYazdir() {
		for (int i = 0; i < this.egitmenListesi.length; i++) {
			System.out.println(i + ".Egitmen: " + this.egitmenListesi[i]);
		}
	}

	public void ogrencileriYazdir() {
		for (int i = 0; i < this.ogrenciListesi.length; i++) {
			System.out.print((i + 1) + ". Sýnýf: ");
			for (int j = 0; j < this.ogrenciListesi[i].length; j++) {
				System.out.print(ogrenciListesi[i][j] + "-");
			}
			System.out.println();
		}
	}
}
