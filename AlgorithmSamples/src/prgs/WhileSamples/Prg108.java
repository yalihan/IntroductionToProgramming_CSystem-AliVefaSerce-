package prgs.WhileSamples;

import prgs.Prg;

public class Prg108 extends Prg{
	public void cozum() {
		int[] a = {4,8,-3,-1,18,9,-21,20,5,-17};
		
		int min = a[0];
		for(int i=0 ; i<a.length ; i++) {
			if(a[i] < 0) {
				a[i] = -a[i];
				if(a[i] < min)
					min = a[i];
			}
		}
		System.out.println("En Buyuk Negatif Sayi = "+min);
	}
}