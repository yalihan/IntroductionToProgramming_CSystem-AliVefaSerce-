package prgs.ArraySamples;

import prgs.Prg;

public class Prg054 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int[] b = new int[10];
		
		for(int i=0 ; i<a.length ; i++) {
			b[a.length-1-i] = a[i];
		}
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(b[i] + " ");
	}
}
