package prgs.MatriceSamples;

import prgs.Prg;

public class Prg081 extends Prg{
	public void cozum() {
		int[][] a = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int sum = 0;
		int sayac = 0;
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				sum += a[i][j];
				sayac++;
			}
		}
		System.out.println("Elemanlar Toplami = "+sum);
		System.out.println("Ortalama = "+sum/sayac);
	}
}