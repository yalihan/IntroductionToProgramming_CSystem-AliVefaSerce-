package prgs.MatriceSamples;

import prgs.Prg;

public class Prg097 extends Prg{
	public void cozum() {
		int[][] matrice = new int[5][5];
		int sayac = 1;
		for(int j=0 ; j<matrice[0].length ; j++) {
			for(int i=0 ; i<matrice.length ; i++) {
				if(i+j<=2*j) {
					matrice[i][j] = sayac;
					sayac++;
				}
				else
					matrice[i][j] = 0;
			}
		}
		for(int i=0 ; i<matrice.length ; i++) {
			for(int j=0 ; j<matrice[0].length ; j++)
				System.out.print(matrice[i][j]+"\t");
			System.out.println();
		}
	}
}