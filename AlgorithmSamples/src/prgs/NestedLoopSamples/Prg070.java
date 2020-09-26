package prgs.NestedLoopSamples;

import prgs.Prg;

public class Prg070 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
