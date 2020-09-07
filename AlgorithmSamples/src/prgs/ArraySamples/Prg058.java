package prgs.ArraySamples;

import prgs.Prg;

public class Prg058 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int temp;
		int tek = 0;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]%2 != 0) {
				temp = a[tek];
				a[tek] = a[i];
				a[i] = temp;
				tek++;
			}
		}

		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
