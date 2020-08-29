package prgs.ArraySamples;

import prgs.Prg;

public class Prg051 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int temp = a[0];
		
		for(int i=0 ; i<a.length-1 ; i++)
			a[i] = a[i+1];
		a[a.length-1] = temp;
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
