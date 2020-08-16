package prgs.IntroductionSamples;

import prgs.Prg;

public class Prg001 extends Prg {
	
	public void cozum() {
		double r,area,pi;
		System.out.print("r : ");
		pi = 3.14;
		r = scanner.nextDouble();
		area = pi*r*r;
		System.out.print("Alan = "+area);
	}
	
}
