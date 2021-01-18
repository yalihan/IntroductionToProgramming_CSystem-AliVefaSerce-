package prgs.MatriceSamples;

import prgs.Prg;

public class Prg088 extends Prg{
	public void cozum() {
		int[][] m = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int max = m[0][0];
		for(int i=0 ; i<m[0].length ; i++) {
			for(int j=0 ; j<m.length ; j++) {
				if(m[j][i]>max)
					max = m[j][i];
			}
			System.out.println(i+1+".sutunun en buyuk elemani = "+max);
			max = 0;
		}
	}
}