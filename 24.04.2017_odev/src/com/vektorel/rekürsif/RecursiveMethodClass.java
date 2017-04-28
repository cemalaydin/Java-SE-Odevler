package com.vektorel.rekürsif;

public class RecursiveMethodClass {

	public int recursiveToplamaYap(int sayi) {
		if (sayi == 1)
			return 1;
		else
			return sayi + this.recursiveToplamaYap(sayi - 1);

	}
}
