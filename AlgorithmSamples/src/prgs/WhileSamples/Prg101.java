package prgs.WhileSamples;

import prgs.Prg;

public class Prg101 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		int[] a = new int[10];
		
		int i = 0;
		while(n>0) {
			a[i] = n%10;
			n /= 10;
			i++;
		}
		for(int j=0 ; j<a.length ; j++)
			System.out.print(a[j]+" ");
	}
}