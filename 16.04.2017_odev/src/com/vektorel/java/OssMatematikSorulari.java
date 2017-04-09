package com.vektorel.java;

public class OssMatematikSorulari implements ISorular {

	@Override
	public void onbirinciSoruCalistir() {
		int Mx = 30, Nx = 40;
		// (MN)x = 10Mx + Nx
		System.out.println(10 * Mx + Nx);

	}

	@Override
	public void onikinciSoruCalistir() {
		int[] secenekler = new int[] { 118, 124, 132, 144, 160 };
		int cevap = secenekler[0];
		for (int i = 0; i < secenekler.length; i++) {
			if ((secenekler[i] % 11 == 0)) {
				cevap = secenekler[i];
				break;
			}
		}
		System.out.println(cevap);

	}

	@Override
	public void onucuncuSoruCalistir() {
		int a, b, ba, count = 0;
		for (int ab = 10; ab <= 99; ab++) {
			a = ab / 10;
			b = ab % 10;
			ba = 10 * b + a;
			if (b != 0 && (ab - ba == 27))
				count++;
		}
		System.out.println(count);

	}

	@Override
	public void ondorduncuSoruCalistir() {
		int cd, count = 0;
		for (int ab = 0; ab <= 55; ab++) {
			cd = 55 - ab;
			if (cd >= 10 && ab >= 10)
				count++;
		}
		System.out.println(count);

	}

	@Override
	public void onbesinciSoruCalistir() {
		// 111* (a + b) = 1443 ===> a+b = 13
		int b;
		int abCarpimMax = 0;
		for (int a = 1; a <= 12; a++) {
			b = 13 - a;
			if (abCarpimMax < a * b)
				abCarpimMax = a * b;

		}

		System.out.println(abCarpimMax);

	}

	@Override
	public void onaltinciSoruCalistir() {
		// 11* (a + b + c) = 231 ===> a+b+c = 21
		int abc = 0;
		int maxabc = 0;
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				for (int c = 1; c <= 9; c++) {
					if (a + b + c == 21) {
						abc = 100 * a + 10 * b + c;
						if (abc > maxabc)
							maxabc = abc;
					}
				}
			}
		}
		System.out.println(maxabc);

	}

	@Override
	public void onyedinciSoruCalistir() {
		// aab + bb = 110*a + 12*b
		int c = 0;

		etiket: for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				if (110 * a + 12 * b == 940) {
					c = a + b;
					break etiket;
				}

			}
		}
		System.out.println(c);

	}

	@Override
	public void onsekizinciSoruCalistir() {

		// ab4=4(1ab) =====> 100 * a + 10*b + 4== 400+40*a+4b =====>60*a+6*b
		// ==396=====> 10a+b=66
		int c = 0;

		etiket: for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				if (10 * a + b == 66) {
					c = a + b;
					break etiket;
				}

			}
		}
		System.out.println(c);
	}

	@Override
	public void ondokuzuncuSoruCalistir() {
		// 111*a + 11*b+ 11*c = 965
		int sonuc = 0;
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				for (int c = 1; c <= 9; c++) {
					if ((111 * a + 11 * (b + c)) == 965) {
						sonuc = a + b + c;
						break;
					}
				}
			}
		}
		System.out.println(sonuc);

	}

	@Override
	public void yirminciSoruCalistir() {
		// 6*(ab) = 444
		int ab = 444 / 6;
		int c = (ab / 10) + (ab % 10);
		System.out.println(c);

	}

}
