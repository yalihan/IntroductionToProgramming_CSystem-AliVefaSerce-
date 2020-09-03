package prgs.ArraySamples;

import prgs.Prg;

public class Prg055 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int temp;
		for(int i=0 ; i<a.length/2 ; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length -1 - i] = temp;
		}
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
