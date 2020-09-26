package prgs.NestedLoopSamples;

import prgs.Prg;

public class Prg071 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=n ; i>=1 ; i--) {
			for(int j=1 ; j<=i ; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
