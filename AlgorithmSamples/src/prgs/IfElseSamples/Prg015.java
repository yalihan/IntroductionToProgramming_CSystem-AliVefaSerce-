package prgs.IfElseSamples;

import prgs.Prg;

public class Prg015 extends Prg{

	public void cozum() {
		int a,b,c;
		System.out.print("a : ");
		a = scanner.nextInt();
		System.out.print("b : ");
		b = scanner.nextInt();
		System.out.print("c : ");
		c = scanner.nextInt();
		if(a==b)
			if(a==c)
				System.out.print("Eskenar");
			else
				System.out.print("Eskenar degil");
		else
			System.out.print("Eskenar degil");
	}
}
