package com.vektorel.kalitim;

public class OzelOkul extends Okul {
	int okulUcreti;
	String egitimDili;

	// constructor
	public OzelOkul(String isim, String[] egitmenListesi, String[][] ogrenciListesi, int okulNo, String mudurIsmi,
			String[] dersListesi, int okulUcreti, String egitimDili) {
		super(isim, egitmenListesi, ogrenciListesi, okulNo, mudurIsmi, dersListesi);
		this.okulUcreti = okulUcreti;
		this.egitimDili = egitimDili;
	}

	@Override
	public void egitimBilgileriYazdir() {
		super.egitimBilgileriYazdir();
		System.out.println("Okul ücreti: " + this.okulUcreti);
		System.out.println("Eðitim Dili: " + this.egitimDili);
	}
}
