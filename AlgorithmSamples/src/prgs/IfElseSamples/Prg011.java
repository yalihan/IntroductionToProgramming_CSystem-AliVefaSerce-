package prgs.IfElseSamples;

import prgs.Prg;

public class Prg011 extends Prg {

	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		if(n>0)
			if(n<100)
				System.out.print(0+" < "+n+" < "+100);
			else
				System.out.print("Girdiginiz sayi 0 ile 100 arasinda degildir.");
		else
			System.out.print("Girdiginiz sayi 0 ile 100 arasinda degildir.");
	}
}
