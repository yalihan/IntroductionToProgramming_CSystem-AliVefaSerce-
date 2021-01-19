package prgs.WhileSamples;

import prgs.Prg;

public class Prg103 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		int[] a = new int[10];
		int i = 0;
		
		int basamakDegeri = 1;
		while(n != 0) {
			a[i] = n%10;
			i++;
			n /= 10;
			basamakDegeri *= 10;
		}
		basamakDegeri /= 10;
		
		for(int j=0 ; j<a.length-1 ; j++) {
			for(int k=j+1 ; k<a.length ; k++) {
				if(a[k] > a[j]) {
					int box = a[j];
					a[j] = a[k];
					a[k] = box;
				}
			}
			n += a[j]*basamakDegeri;
			basamakDegeri /= 10;
		}
		
		System.out.println(n);
	}
}