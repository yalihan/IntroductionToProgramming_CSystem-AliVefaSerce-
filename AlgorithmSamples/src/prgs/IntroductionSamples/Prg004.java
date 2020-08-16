package prgs.IntroductionSamples;

import prgs.Prg;

public class Prg004 extends Prg {

	public void cozum() {
		int b,o,b2,o2;
		System.out.print("Iki basamakli bir sayi giriniz : ");
		int n = scanner.nextInt();
		b = n%10;
		b2 = b*b;
		o = n/10;
		o2 = o*o;
		System.out.println("Basamaklarinin kareleri toplami = "+(b2+o2));
	}

}
