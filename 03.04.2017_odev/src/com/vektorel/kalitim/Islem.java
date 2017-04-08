package com.vektorel.kalitim;

public class Islem {

	public static void main(String[] args) {

		// Kurs veri atamalar�
		String[] egitmenListesi = { "Ali", "Ahmet", "Kaya" };
		String[][] ogrenciListesi = { { "Ay�e", "Fatma" }, { "Hasan", "Cem", "John" }, { "Adam" } };
		String kursBransi = "Yazilim";
		int[] yuzdeIndirimler = { 10, 1, 2 };

		Kurs kurs = new Kurs("Vektorel Bilisim Yazilim Kursu", egitmenListesi, ogrenciListesi, kursBransi, 1000);

		// -------------------------------------------------------------------------------------
		// Okul veri atamalar�
		String[] ogeretmenlerL�stesi = { "Sabri Hoca", "R�dvan Hoca", "Selami Hoca" };
		String[][] okuldakiOgrenciler = { { "Mehmet", "Can" }, { "H�seyin", "Abdurrahman", "Abd�rrahim" },
				{ "Seyfi" } };
		String[] dersListesi = { "Matematik", "Hayat Bilgisi" };

		Okul okul = new Okul("Haydar Okulu", ogeretmenlerL�stesi, okuldakiOgrenciler, 11111, "Haydar", dersListesi);
		// -------------------------------------------------------------------------------------
		// OzelOkul veri atamalar�
		String[] ogeretmenlerL�stesiOzel = { "Matmazel A", "Madam B", "Madam C" };
		String[][] okuldakiOgrencilerOzel = { { "Juan", "Leo" }, { "Napelon", "Zidane", "Barthez" }, { "Ribery" } };
		String[] dersListesiOzel = { "English", "Spanish" };

		OzelOkul ozelOkul = new OzelOkul("�zel Burjuva Koleji", ogeretmenlerL�stesiOzel, okuldakiOgrencilerOzel, 2222,
				"Beyefendi", dersListesiOzel, 10000, "Frans�zca");

		// Kurs Islemler
		kurs.egitimBilgileriYazdir();
		kurs.ogrencileriYazdir();
		System.out.println(kurs.indirimliKursUcretiHEsapla(yuzdeIndirimler));
		System.out.println("------------------------------------");

		// Okul Islemler
		okul.egitimBilgileriYazdir();
		okul.egitmenleriYazdir();
		okul.ogrencileriYazdir();
		System.out.println("------------------------------------");

		// Ozel Okul Islemler
		ozelOkul.egitimBilgileriYazdir();
		ozelOkul.egitmenleriYazdir();
		ozelOkul.ogrencileriYazdir();
		System.out.println("------------------------------------");

	}

}
