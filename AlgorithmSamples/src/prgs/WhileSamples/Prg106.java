package prgs.WhileSamples;

import prgs.Prg;

public class Prg106 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		int avg = sum/a.length;
		System.out.println("Dizi Ortalamasi = "+avg);

		int min = a[0] - avg;
		if(min<0)
			min = -min;
		
		int p = 0;
		int dif;
		for(int i=1 ; i<a.length ; i++) {
			dif = a[i] -avg;
			if(dif < 0)				
				dif = -dif;
			
			if(dif < min) {
				min = dif;
				p = i;
			}
		}
		System.out.println("Dizinin ortalamasina en yakin dizi elemani = " + a[p]);
	}
}