package prgs.ArraySamples;

import prgs.Prg;

public class Prg060 extends Prg {
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int max = a[0];
		int min = a[0];
		for(int i=0 ; i<a.length ; i++)
			if(a[i] > max)
				max = a[i];
			else if(a[i] < min)
				min = a[i];

			System.out.println("Dizinin en buyuk elemani : " + max);
		System.out.println("Dizinin en kucuk elemani : " + min);
	}
}
