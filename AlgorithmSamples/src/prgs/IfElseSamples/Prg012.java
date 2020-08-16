package prgs.IfElseSamples;

import prgs.Prg;

public class Prg012 extends Prg {

	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		if(n<1000)
			if(n>=100)
				System.out.print("Sayi 3 basamaklidir.");
			else
				if(n>=10)
					System.out.print("Sayi 2 basamaklidir.");
				else
					if(n>=0)
						System.out.print("Sayi 1 basamaklidir.");
					else
						System.out.print("Lutfen 0 ile 1000 arasinda bir sayi giriniz.");
		else
			System.out.println("Lutfen 0 ile 1000 arasinda bir sayi giriniz.");
	}
}
