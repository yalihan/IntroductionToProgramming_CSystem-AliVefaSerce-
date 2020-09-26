package prgs.ArraySamples;

import prgs.Prg;

public class Prg063 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int min;
		int p = 0;
		for(int i=0 ; i<a.length ; i++) {
			min = a[i];
			p = i;
			for(int j=i ; j<a.length ; j++) {
				if(a[j] < min) {
					min = a[j];
					p = j;
				}
			}
			a[p] = a[i];
			a[i] = min;

			System.out.print(i + " .adim => ");
			for(int k=0 ; k<a.length ; k++)
				System.out.print(a[k] + " ");
			System.out.println();
		}
	}
}