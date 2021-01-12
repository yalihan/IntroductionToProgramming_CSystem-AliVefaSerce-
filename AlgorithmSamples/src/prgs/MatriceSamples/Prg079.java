package prgs.MatriceSamples;

import prgs.Prg;

public class Prg079 extends Prg{
	public void cozum() {
		int[][] a = new int[3][4];
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				a[i][j] = j*3+i+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}