package prgs.NestedLoopSamples;

import prgs.Prg;

public class Prg076 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			if(i==1 || i==n) {
				for(int j=1 ; j<=n ; j++)
					System.out.print("*");
			}
			else {
				System.out.print("*");
				for(int j=1 ; j<=n-2 ; j++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
