package prgs.MatriceSamples;

import prgs.Prg;

public class Prg084 extends Prg{
	public void cozum() {
		int[][] m = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int max = m[0][0];
		for(int i=0 ; i<m.length ; i++) {
			for(int j=0 ; j<m[0].length ; j++) {
				if(m[i][j]>max)
					max = m[i][j];
			}
		}
		System.out.println("Matrisin En Buyuk Elemani = "+max);
	}
}