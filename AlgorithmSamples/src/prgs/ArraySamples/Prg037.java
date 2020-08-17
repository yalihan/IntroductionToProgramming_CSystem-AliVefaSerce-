package prgs.ArraySamples;

import prgs.Prg;

public class Prg037 extends Prg{

	public void cozum() {
		int[] a = { 4 , 8 , 3 , 1 , 18 , 9 , 21 , 20 , 5 , 17};
		for(int i=0 ; i<a.length ; i++)
			if(a[i]%2 != 0)
				System.out.println(a[i]+" ");
	}
}
