package prgs.WhileSamples;

import prgs.Prg;

public class Prg110 extends Prg{
	public void cozum() {
		int a = 4;

		while(a != 3) {
			while(a != 2) {
				while(a != 1) {
					System.out.println("a : ");
					a = scanner.nextInt();
				}
				System.out.println("a : ");
				a = scanner.nextInt();
			}
			System.out.println("a : ");
			a = scanner.nextInt();
		}
	}
}