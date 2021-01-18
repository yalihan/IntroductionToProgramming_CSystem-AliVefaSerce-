package prgs.MatriceSamples;

import prgs.Prg;

public class Prg089 extends Prg{
	public void cozum() {
		int[][] m = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int[][] transposeM = new int[m[0].length][m.length];
		for(int i=0 ; i<transposeM.length ; i++) {
			for(int j=0 ; j<transposeM[0].length ; j++) {
				transposeM[i][j] = m[j][i];
				System.out.print(transposeM[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}