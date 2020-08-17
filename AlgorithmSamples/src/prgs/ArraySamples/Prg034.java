package prgs.ArraySamples;

import prgs.Prg;

public class Prg034 extends Prg{

	public void cozum() {
		int[] a = new int[5];
		for(int i=0 ; i<a.length ; i++) {
			a[i] = (i+1)*2;
			System.out.print(a[i]+" ");
		}
	}
}
