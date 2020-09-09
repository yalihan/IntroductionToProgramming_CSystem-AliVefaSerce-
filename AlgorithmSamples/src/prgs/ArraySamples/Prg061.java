package prgs.ArraySamples;

import prgs.Prg;

public class Prg061 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int max = a[0];
		int indis  = 0;
		for(int i=0 ; i<a.length ; i++)
			if(a[i] > max) {
				max = a[i];
				indis = i;
			}
		
		System.out.println("Dizinin En Buyuk Elemani : " + max + "\nIndis Numarasi : " + indis);
	}
}
