package prgs.MatriceSamples;

import prgs.Prg;

public class Prg083 extends Prg{
	public void cozum() {
		int[][] m = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int sum = 0;
		for(int i=0 ; i<m[0].length ; i++) {
			for(int j=0 ; j<m.length ; j++) {
				sum += m[j][i];
			}
			System.out.println(i+1+".sutun Elemanlari Toplami = "+sum);
			System.out.println(i+1+".sutun Ortalamasi = "+sum/m.length);
			sum = 0;
			System.out.println();
		}
	}
}