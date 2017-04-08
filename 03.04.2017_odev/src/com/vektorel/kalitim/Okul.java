package com.vektorel.kalitim;

public class Okul extends Egitim {
	int okulNo;
	String mudurIsmi;
	String[] dersListesi;
	// constructor
	public Okul(String isim, String[] egitmenListesi, String[][] ogrenciListesi, int okulNo, String mudurIsmi,
			String[] dersListesi) {
		super(isim, egitmenListesi, ogrenciListesi);
		this.okulNo = okulNo;
		this.mudurIsmi = mudurIsmi;
		this.dersListesi = dersListesi;
	}

	@Override
	public void egitimBilgileriYazdir() {
		super.egitimBilgileriYazdir();
		System.out.println("Okulun muduru: " + this.mudurIsmi);
	}

	@Override
	public void egitmenleriYazdir() {
		System.out.print("Okulun ogretmenleri: ");
		for (int i = 0; i < this.egitmenListesi.length; i++) {
			System.out.print(this.egitmenListesi[i] + ",");
		}
		System.out.println();
	}
}
