package com.vektoreljava;

public class OssMatematikSorulari implements ISorular {

	@Override
	public void birinciSoruCalistir(int birinciSayi, int ikinciSayi) {
		int sonuc = Integer.toString(birinciSayi * ikinciSayi).length();
		System.out.println(sonuc);
	}

	@Override
	public void ikinciSoruCalistir(int yuzlerBasamagiArtisi, int onlarBasamagiAzalisi, int toplamSayiAdedi) {
		int sonuc = 10 * (yuzlerBasamagiArtisi * 100 - onlarBasamagiAzalisi * 10);
		System.out.println(sonuc);

	}

	@Override
	public void ucuncuSoruCalistir() {
		int sonuc = 0;
		for (int c = 0; c <= 9; c++) {
			int b = 2 * c + 1;
			int a = b + 1;
			if (a > 9 || b > 9 || c > 9)
				break;
			sonuc += (100 * a + 10 * b + c);
		}
		System.out.println(sonuc);
	}

	@Override
	public void dorduncuSoruCalistir(int toplamSayi) {
		int count = 0;
		for (int a = 1; a <= toplamSayi; a++) {
			for (int b = 0; b <= toplamSayi; b++) {
				for (int c = 0; c <= toplamSayi; c++) {
					if (a == b || a == c || b == c || a + b + c != 7) {
						continue;
					}
					count++;
				}
			}
		}
		System.out.println(count);

	}

	@Override
	public void besinciSoruCalistir(int sayfaSayisi) {
		int sonuc = 0;
		for (int i = 1; i <= sayfaSayisi; i++) {
			sonuc += Integer.toString(i).length();
		}
		System.out.println(sonuc);

	}

	@Override
	public void altinciSoruCalistir() {
		// TODO Auto-generated method stub
		int sonuc = 4343 / 43 + 2424 / 24;
		System.out.println(sonuc);
	}

	@Override
	public void yedinciSoruCalistir(int yuzlerBasamagiArtisi, int onlarBasamagiArtisi, int birlerBasamagiArtisi,
			int carpimKatsayisi) {
		int sonuc = carpimKatsayisi * (yuzlerBasamagiArtisi * 100 + onlarBasamagiArtisi * 10 + birlerBasamagiArtisi);
		System.out.println(sonuc);

	}

	@Override
	public void sekizinciSoruCalistir(int yanlisAlinanOnlarBasamagi, int gercektekiOnlarBasamagi, int yanlisSonuc,
			int carpimKatsayisi) {
		int gercekSonuc = yanlisSonuc - (10 * (yanlisAlinanOnlarBasamagi - gercektekiOnlarBasamagi) * carpimKatsayisi);
		System.out.println(gercekSonuc);
	}

	@Override
	public void dokuzuncuSoruCalistir() {
		int sonuc = 0;
		int carpim = 100;
		for (int i = 9, count = 0; i >= 4; i--) {
			sonuc += i * carpim;
			count++;
			if (count == 2) {
				carpim /= 10;
				count = 0;
			}

		}
		System.out.println(sonuc);
	}

	@Override
	public void onuncuSoruCalistir() {
		int count = 0;
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (b == a)
					continue;
				for (int c = 1; c <= 5; c++) {
					if (c == a || c == b)
						continue;
					for (int d = 1; d <= 5; d++) {
						if (d == a || d == b || d == c)
							continue;
						for (int e = 1; e <= 5; e++) {
							if (e == a || e == b || e == c || e == d)
								continue;
							if ((a + b) == (d + e))
								count++;
						}
					}
				}
			}
		}

		System.out.println(count);

	}

}
