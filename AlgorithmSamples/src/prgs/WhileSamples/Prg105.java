package prgs.WhileSamples;

import prgs.Prg;

public class Prg105 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int flag = 0;

		int i=a.length-1;
		while(flag == 0) {
			if(a[i]%2 == 0)
				flag = 1;
			i--;
		}
		System.out.println(a[i+1]);
	}
}