package prgs.ArraySamples;

import prgs.Prg;

public class Prg052 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int[] b = new int[a.length];
		
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=0 ; i<n ; i++)
			b[i] = a[i];
		
		for(int i=n ; i<a.length ; i++)
			a[i-n] = a[i];
		
		for(int i=0 ; i<n ; i++)
			a[a.length - n + i] = b[i];
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
		
	}
	public void cozum2() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		int[] b = new int[a.length];
		
		System.out.print("n : ");
		int n = scanner.nextInt();
		n = n%10;
		
		for(int i=0 ; i<a.length ; i++)
			b[i] = a[(i+n)%10];
		
		for(int i=0 ; i<a.length ; i++)
			a[i] = b[i];
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
	}
}
