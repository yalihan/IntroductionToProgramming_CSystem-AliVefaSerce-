package prgs.MatriceSamples;

import prgs.Prg;

public class Prg077 extends Prg{
	public void cozum() {
		int[][] m = new int[4][3];
		for(int i=0 ; i<m.length ; i++) {
			for(int j=0 ; j<m[0].length ; j++) {
				m[i][j] = 7;
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
