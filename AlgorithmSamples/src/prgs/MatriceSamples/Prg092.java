package prgs.MatriceSamples;

import prgs.Prg;

public class Prg092 extends Prg{
	public void cozum() {
		int[][] matrice = new int[25][25];
		for(int i=0 ; i<matrice.length ; i++) {
			for(int j=0 ; j<matrice[0].length ; j++) {
				if(i==j || i+j==24)
					matrice[i][j] = 1;
				else
					matrice[i][j] = 0;
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
