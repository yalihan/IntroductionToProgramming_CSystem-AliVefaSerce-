package prgs.ArraySamples;

import prgs.Prg;

public class Prg056 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		System.out.print("s : ");
		int s = scanner.nextInt();
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		int temp;
		for(int i=s ; i<s+n/2 ; i++) {
			temp = a[i];
			a[i] = a[s+s+n-i-1];
			a[s+s+n-i-1] = temp;
		}
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
