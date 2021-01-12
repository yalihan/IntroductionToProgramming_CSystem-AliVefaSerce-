package prgs.MatriceSamples;

import prgs.Prg;

public class Prg080 extends Prg{
	public void cozum() {
		int[][] a = new int[4][3];
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				a[i][j] = j+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}