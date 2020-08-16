package prgs.IfElseSamples;

import prgs.Prg;

public class Prg010 extends Prg {

	public void cozum() {
		int y,z;
		System.out.print("x : ");
		int x = scanner.nextInt();
		if(x<0) {
			y = x*(x+2);
			z = 3*x;
			System.out.print("y = x*x+2x = "+y+"\nz = 3x = "+z);
		}else {
			y = x;
			z = x*x+10;
			System.out.print("y = x = "+y+"\nz = x*x+10 = "+z);
		}
	}
}
