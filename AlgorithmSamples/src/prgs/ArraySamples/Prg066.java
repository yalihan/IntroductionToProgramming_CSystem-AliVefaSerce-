package prgs.ArraySamples;

import prgs.Prg;

public class Prg066 extends Prg {
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		for(int i=0 ; i<a.length ; i++) {
			for(int j=1 ; j<=5 ; j++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
	}
}
