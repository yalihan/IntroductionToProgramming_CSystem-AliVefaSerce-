package prgs.IntroductionSamples;

import prgs.Prg;

public class Prg003 extends Prg {

	public void cozum() {
		System.out.print("1.Sayi : ");
		int n1=scanner.nextInt();
		System.out.print("2.Sayi : ");
		int n2=scanner.nextInt();
		int n3;
		n3=n1;
		n1=n2;
		n2=n3;
		System.out.print("1.Sayi = "+n1+"\n2.Sayi = "+n2);
	}

}
