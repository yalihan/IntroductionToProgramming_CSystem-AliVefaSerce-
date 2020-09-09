package prgs.ArraySamples;

import prgs.Prg;

public class Prg062 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int min = a[0];
		int indis = 0;
		for(int i=0 ; i<a.length ; i++)
			if(a[i] < min) {
				min = a[i];
				indis = i;
			}
		
		a[indis] = a[0];
		a[0] = min;
		
		System.out.print("Dizinin en kucuk elemani : " + min + "\n\n");
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
