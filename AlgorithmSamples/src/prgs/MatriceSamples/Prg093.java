package prgs.MatriceSamples;

import prgs.Prg;

public class Prg093 extends Prg{
	public void cozum() {
		int[][] matrice = new int[25][25];
		for(int i=0 ; i<matrice.length ; i++) {
			for(int j=0 ; j<matrice[0].length ; j++) {
				if(i==matrice.length/2 || j==matrice.length/2)
					matrice[i][j] = 1;
				else
					matrice[i][j] = 0;
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
