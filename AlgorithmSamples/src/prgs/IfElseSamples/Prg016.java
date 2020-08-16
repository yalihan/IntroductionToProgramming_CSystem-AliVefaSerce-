package prgs.IfElseSamples;

import prgs.Prg;

public class Prg016 extends Prg{

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
				System.out.print("Ikizkenar");
		else
			if(a==c)
				System.out.print("Ikizkenar");
			else
				if(b==c)
					System.out.println("Ikizkenar");
				else
					System.out.println("Ikizkenar degil");
		
	}
}
