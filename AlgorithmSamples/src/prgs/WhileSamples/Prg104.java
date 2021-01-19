package prgs.WhileSamples;

import prgs.Prg;

public class Prg104 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int flag = 0;

		int i=0;
		while(flag == 0) {
			if(a[i]%2 == 1)
				flag = 1;
			i++;
		}
		System.out.println(a[i-1]);
	}
}