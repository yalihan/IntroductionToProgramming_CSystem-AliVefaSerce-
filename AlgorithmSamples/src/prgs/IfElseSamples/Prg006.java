package prgs.IfElseSamples;

import prgs.Prg;

public class Prg006 extends Prg {
	
	public void cozum() {
		System.out.println("Bir Sayi Giriniz : ");
		int n = scanner.nextInt();
		if(n%2 == 0)
			System.out.println("Cift Sayi");
		else
			System.out.println("Tek Sayi");
	}
	
}
