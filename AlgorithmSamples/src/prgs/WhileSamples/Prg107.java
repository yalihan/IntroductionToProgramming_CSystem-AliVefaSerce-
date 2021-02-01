package prgs.WhileSamples;

import prgs.Prg;

public class Prg107 extends Prg{
	public void cozum() {
		int[] a = {2,0,1};
		
		int max1,max2;
		if(a[0] > a[1]) {
			max1 = a[0];
			max2 = a[1];
		}
		else {
			max1 = a[1];
			max2 = a[0];
		}
		
		for(int i=2 ; i<a.length ; i++) {
			if(a[i] > max2) {
				if(a[i] > max1) {
					max2 = max1;
					max1 = a[i];
				}
				else
					max2 = a[i];
			}
		}
		System.out.println("Dizinin en buyuk 2. elemani = " + max2);
	}
}