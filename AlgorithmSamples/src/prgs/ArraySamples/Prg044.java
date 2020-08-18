package prgs.ArraySamples;

import prgs.Prg;

public class Prg044 extends Prg {

	public void cozum() {
		int[] a = {4,8,3,1,18,9,21,20,5,17};
		
		System.out.print("x : ");
		int x = scanner.nextInt();
		System.out.print("y : ");
		int y = scanner.nextInt();
		
		for(int i=0 ; i<a.length ; i++)
			if(a[i] < x)
				if(a[i] > y)
					System.out.print(a[i] + " ");
	}
}
