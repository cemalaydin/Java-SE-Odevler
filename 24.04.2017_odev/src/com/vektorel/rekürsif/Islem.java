package com.vektorel.rek�rsif;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz .");
		int girilenSayi = scanner.nextInt();
		try {
			if (girilenSayi <= 0)
				throw new BenimSifirHatam("Girilen sayi 1'dan k���k");
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
