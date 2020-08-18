package prgs.ArraySamples;

import prgs.Prg;

public class Prg048 extends Prg {

	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=a.length-1 ; i>a.length-n-1 ; i--)
			System.out.print(a[i] + " ");
	}
}
