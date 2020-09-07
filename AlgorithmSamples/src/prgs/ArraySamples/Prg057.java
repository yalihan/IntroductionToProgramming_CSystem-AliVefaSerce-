package prgs.ArraySamples;

import prgs.Prg;

public class Prg057 extends Prg {
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int[] b = new int[10];
		
		int tek = 0;
		int cift = a.length -1 ;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]%2 == 0) {
				b[cift] = a[i];
				cift--;
			}
			else {
				b[tek] = a[i];
				tek++;
			}
		}

		for(int i=0 ; i<b.length ; i++)
			System.out.print(b[i] + " ");
	}
}
