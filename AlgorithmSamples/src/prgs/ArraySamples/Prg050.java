package prgs.ArraySamples;

import prgs.Prg;

public class Prg050 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};

		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for (int i=0 ; i<n ; i++)
			a[a.length-1-i] = a[n-1-i];

		for (int i=0 ; i<a.length-n ; i++)
			a[i]=0;
		
		for (int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
