package prgs.IfElseSamples;

import prgs.Prg;

public class Prg005 extends Prg {

	public void cozum() {
		System.out.print("Bir sayi giriniz : ");
		int n = scanner.nextInt();
		if(n<0)
			System.out.print("Girdiginiz sayi negatiftir.");
		else
			System.out.print("Girdiginiz sayi pozitiftir.");
	}

}
