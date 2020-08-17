package prgs.ArraySamples;

import prgs.Prg;

public class Prg039 extends Prg{

	public void cozum() {
		int[] a = { 4 , 8 , 3 , 1 , 18 , 9 , 21 , 20 , 5 , 17};
		int count = 0;
		int sum = 0;
		System.out.print("Dizide ki tek sayilar = ");
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]%2 != 0) {
				System.out.print(a[i] + " ");
				count++;
				sum += a[i];
			}
		}
		System.out.println("\n\nTek sayilarin adedi = "+ count);
		System.out.println("Tek sayilarin toplami = " + sum);
		System.out.println("Tek sayilarin ortalamasi = " + sum / count);
	}
}
