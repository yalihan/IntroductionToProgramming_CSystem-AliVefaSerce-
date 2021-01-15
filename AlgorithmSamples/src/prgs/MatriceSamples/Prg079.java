package prgs.MatriceSamples;

import prgs.Prg;

public class Prg079 extends Prg{
	public void cozum() {
		int[][] m = new int[3][4];
		for(int i=0 ; i<m.length ; i++) {
			for(int j=0 ; j<m[0].length ; j++) {
				m[i][j] = j*3+i+1;
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
}