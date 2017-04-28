package com.vektorel.siralamaalgoritmalari;

public class DiziSýralamaAlgoritmasý {

	public static void main(String[] args) {

		int[] ornekDizi = new int[] { 111, 122, 13, 57, 67, 8, 32, 23, 89, 100, 8, 3 };

		kendiYazdigimMetot(ornekDizi);
		diziYazdir(ornekDizi);

		System.out.println("---------------------------");

		ornekDizi = new int[] { 17, 23, 5, -10, -19, 111, 103, 65, 43, 17, 5 };

		selectionSortAlgorithm(ornekDizi);
		diziYazdir(ornekDizi);

	}

	// Kendim yazmaya çalýþtigim metot internette insertionSort algorithme
	// benziyor.
	static int[] kendiYazdigimMetot(int[] dizi) {
		int a = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < i; j++) {
				if (dizi[i] < dizi[j]) {
					a = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = a;
				}
			}
		}

		return dizi;
	}

	// Internetten Baktigim Algoritma (SelectionSort)
	static int[] selectionSortAlgorithm(int[] dizi) {
		int a;
		for (int i = 0; i < dizi.length; i++) {
			int minIndex = i;
			for (int j = i; j < dizi.length; j++) {
				if (dizi[j] < dizi[minIndex])
					minIndex = j;
			}
			a = dizi[i];
			dizi[i] = dizi[minIndex];
			dizi[minIndex] = a;
		}
		return dizi;
	}

	static void diziYazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}

}
