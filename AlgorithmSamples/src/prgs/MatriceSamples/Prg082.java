package prgs.MatriceSamples;

import prgs.Prg;

public class Prg082 extends Prg{
	public void cozum() {
		int[][] m = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int sum = 0;
		for(int i=0 ; i<m.length ; i++) {
			for(int j=0 ; j<m[0].length ; j++) {
				sum += m[i][j];
			}
			System.out.println(i+1+".satir Elemanlari Toplami = "+sum);
			System.out.println(i+1+".satir Ortalamasi = "+sum/m[0].length);
			sum = 0;
			System.out.println();
		}
	}
}