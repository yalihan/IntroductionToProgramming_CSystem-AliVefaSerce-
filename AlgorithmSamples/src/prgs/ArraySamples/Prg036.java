package prgs.ArraySamples;

import prgs.Prg;

public class Prg036 extends Prg{

	public void cozum() {
		int[] a = { 4 , 8 , 3 , 1 , 18 , 9 , 21 , 20 , 5 , 17};
		int sum=0;
		for(int i=0 ; i<a.length ; i++)
			sum += a[i];
		System.out.println("Toplam = " + sum + "\nOrtalama = " + sum/a.length);
	}
}
