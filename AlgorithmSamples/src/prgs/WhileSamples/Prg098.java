package prgs.WhileSamples;

import prgs.Prg;

public class Prg098 extends Prg{
	public void cozum() {
		System.out.println("0 girildiginde programdan cikilacak\n");
		
		System.out.println("a = ");
		int a = scanner.nextInt();

		while(a!=0) {
			System.out.println("a = ");
			a = scanner.nextInt();
		}
	}
}