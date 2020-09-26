package prgs.ArraySamples;

import prgs.Prg;

public class Prg064 extends Prg{
	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int temp = a[0];
		int j = 1;
		boolean flag = true;
		while(flag == true) {
			flag = false;
			for(int i=1 ; i<a.length ; i++) {
				if(a[i] < a[i-1]) {
					temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					flag = true;
				}
			}
			
			System.out.print(j + " .adim => ");
			for(int i=0 ; i<a.length ; i++)
				System.out.print(a[i] + " ");
			System.out.println();
			j++;
		}		
	}
	public void cozum2() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		int temp = a[0];
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.print(i + " .adim => ");
			for(int j=0 ; j<a.length ; j++)
				System.out.print(a[j] + " ");
			System.out.println();
		}
	}
}
