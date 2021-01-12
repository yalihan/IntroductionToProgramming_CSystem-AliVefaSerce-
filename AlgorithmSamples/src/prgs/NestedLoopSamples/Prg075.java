package prgs.NestedLoopSamples;

import prgs.Prg;

public class Prg075 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			if(i==(n+1)/2) {
				for(int j=1 ; j<=n ; j++)
					System.out.print("*");
			}
			else {
				for(int j=1 ; j<=(n-1)/2 ; j++)
					System.out.print(" ");
				System.out.print("*");
				for(int j=1 ; j<=(n-1)/2 ; j++)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
