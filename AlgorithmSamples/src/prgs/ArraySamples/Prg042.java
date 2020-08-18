package prgs.ArraySamples;

import prgs.Prg;

public class Prg042 extends Prg {

	public void cozum() {
		int[] a = {4 , 8 , 3 , 1 , 18 , 9 , 21 , 20 , 5 , 17};
		int csayac=0,tsayac=0,csum=0,tsum=0;
		System.out.println("n : ");
		int n = scanner.nextInt();
		
		for(int i=0 ; i<a.length ; i++)
			if(a[i] < n)
				if(a[i]%2 == 0) {
					csayac++;
					csum += a[i];
				}
				else {
					tsayac++;
					tsum += a[i];
				}
		System.out.println("Cift sayilarin adedi = " + csayac);
		System.out.println("Cift sayilarin toplami = " + csum);
		System.out.println("Tek sayilarin toplami = " + tsayac);
		System.out.println("Tek sayilarin toplami = " + tsum);
	}
}
