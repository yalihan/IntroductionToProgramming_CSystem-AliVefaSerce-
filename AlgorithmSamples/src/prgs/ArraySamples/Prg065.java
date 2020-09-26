package prgs.ArraySamples;

import prgs.Prg;

public class Prg065 extends Prg {
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=0 ; j<a.length ; j++)
				System.out.print(a[j] + " ");
			System.out.println();
		}
	}
}
