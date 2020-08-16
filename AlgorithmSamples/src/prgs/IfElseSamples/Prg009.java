package prgs.IfElseSamples;

import prgs.Prg;

public class Prg009 extends Prg {

	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		if(n<0)
			n=-n;
		System.out.print("|n| = "+n);
	}
}
