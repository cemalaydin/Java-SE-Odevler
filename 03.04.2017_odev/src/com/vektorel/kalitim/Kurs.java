package com.vektorel.kalitim;

public class Kurs extends Egitim {
	String kursBransi;
	int kursUcreti;

	// constructor
	public Kurs(String isim, String[] egitmenListesi, String[][] ogrenciListesi, String kursBransi, int kursUcreti) {
		super(isim, egitmenListesi, ogrenciListesi);
		this.kursBransi = kursBransi;
		this.kursUcreti = kursUcreti;
	}

	@Override
	public void egitimBilgileriYazdir() {
		super.egitimBilgileriYazdir();
		System.out.println("Kursun bransi: " + this.kursBransi);
		System.out.println("Kurs ucreti: " + this.kursUcreti);
	}

	public double indirimliKursUcretiHEsapla(int[] indirimYuzdeleri) {
		double toplamIndirimYuzdesi = 0;
		for (int i = 0; i < indirimYuzdeleri.length; i++) {
			toplamIndirimYuzdesi += indirimYuzdeleri[i];
		}

		return this.kursUcreti * (1 - (toplamIndirimYuzdesi / 100));
	}
}
