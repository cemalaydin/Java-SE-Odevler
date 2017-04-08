package com.vektoreljava;

public interface ISorular {
	public void birinciSoruCalistir(int birinciSayi, int ikinciSayi);

	public void ikinciSoruCalistir(int yuzlerBasamagiArtisi, int onlarBasamagiAzalisi, int toplamSayiAdedi);

	public void ucuncuSoruCalistir();

	public void dorduncuSoruCalistir(int toplamSayi);

	public void besinciSoruCalistir(int sayfaSayisi);

	public void altinciSoruCalistir();

	public void yedinciSoruCalistir(int yuzlerBasamagiArtisi, int onlarBasamagiArtisi, int birlerBasamagiArtisi,
			int carpimKatsayisi);

	public void sekizinciSoruCalistir(int yanlisAlinanOnlarBasamagi, int gercektekiOnlarBasamagi, int yanlisSonuc,
			int carpimKatsayisi);

	public void dokuzuncuSoruCalistir();

	public void onuncuSoruCalistir();
}
