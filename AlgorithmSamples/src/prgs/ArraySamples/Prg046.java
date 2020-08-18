package prgs.ArraySamples;

import prgs.Prg;

public class Prg046 extends Prg {

	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		System.out.print("n : ");
		int n=scanner.nextInt();
		
		for(int i=0 ; i<n ; i++)
			System.out.print(a[i] + " ");
	}
}
