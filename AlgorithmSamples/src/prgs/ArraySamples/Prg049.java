package prgs.ArraySamples;

import prgs.Prg;

public class Prg049 extends Prg {
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		System.out.print("s : ");
		int s = scanner.nextInt();
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=s ; i<s+n ; i++)
			System.out.print(a[i] + " ");
	}
}
