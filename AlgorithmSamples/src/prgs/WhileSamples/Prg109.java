package prgs.WhileSamples;

import prgs.Prg;

public class Prg109 extends Prg{
	public void cozum() {
		int a = 4;

		while(a != 1) {
			System.out.println("a : ");
			a = scanner.nextInt();
		}
		
		while(a != 2) {
			System.out.println("a : ");
			a = scanner.nextInt();
		}
		
		while(a != 3) {
			System.out.println("a : ");
			a = scanner.nextInt();
		}
	}
}