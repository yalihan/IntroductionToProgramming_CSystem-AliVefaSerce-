package prgs.IntroductionSamples;

import prgs.Prg;

public class Prg002 extends Prg {

	public void cozum() {
		double pi,r,h,volume;
		System.out.print("r : ");
		r = scanner.nextDouble();
		System.out.print("h : ");
		h = scanner.nextDouble();
		pi=3.14;
		volume = pi*r*r*h;
		System.out.print("Hacim = "+volume);
	}

}
