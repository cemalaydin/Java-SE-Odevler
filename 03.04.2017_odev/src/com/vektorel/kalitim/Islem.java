package com.vektorel.kalitim;

public class Islem {

	public static void main(String[] args) {

		// Kurs veri atamalarý
		String[] egitmenListesi = { "Ali", "Ahmet", "Kaya" };
		String[][] ogrenciListesi = { { "Ayþe", "Fatma" }, { "Hasan", "Cem", "John" }, { "Adam" } };
		String kursBransi = "Yazilim";
		int[] yuzdeIndirimler = { 10, 1, 2 };

		Kurs kurs = new Kurs("Vektorel Bilisim Yazilim Kursu", egitmenListesi, ogrenciListesi, kursBransi, 1000);

		// -------------------------------------------------------------------------------------
		// Okul veri atamalarý
		String[] ogeretmenlerLýstesi = { "Sabri Hoca", "Rýdvan Hoca", "Selami Hoca" };
		String[][] okuldakiOgrenciler = { { "Mehmet", "Can" }, { "Hüseyin", "Abdurrahman", "Abdürrahim" },
				{ "Seyfi" } };
		String[] dersListesi = { "Matematik", "Hayat Bilgisi" };

		Okul okul = new Okul("Haydar Okulu", ogeretmenlerLýstesi, okuldakiOgrenciler, 11111, "Haydar", dersListesi);
		// -------------------------------------------------------------------------------------
		// OzelOkul veri atamalarý
		String[] ogeretmenlerLýstesiOzel = { "Matmazel A", "Madam B", "Madam C" };
		String[][] okuldakiOgrencilerOzel = { { "Juan", "Leo" }, { "Napelon", "Zidane", "Barthez" }, { "Ribery" } };
		String[] dersListesiOzel = { "English", "Spanish" };

		OzelOkul ozelOkul = new OzelOkul("Özel Burjuva Koleji", ogeretmenlerLýstesiOzel, okuldakiOgrencilerOzel, 2222,
				"Beyefendi", dersListesiOzel, 10000, "Fransýzca");

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
