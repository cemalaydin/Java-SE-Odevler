package com.vektorel.rekürsif;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz .");
		int girilenSayi = scanner.nextInt();
		try {
			if (girilenSayi <= 0)
				throw new BenimSifirHatam("Girilen sayi 1'dan küçük");
			else
				System.out.println(girilenSayi + "'a kadar olan sayiarin topami = "
						+ new RecursiveMethodClass().recursiveToplamaYap(girilenSayi));
		} catch (BenimSifirHatam e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program sona erdi");
		}
	}

}
