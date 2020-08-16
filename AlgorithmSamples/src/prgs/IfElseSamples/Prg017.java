package prgs.IfElseSamples;

import prgs.Prg;

public class Prg017 extends Prg{

	public void cozum() {
		int a,b,c,max;
		System.out.print("a : ");
		a = scanner.nextInt();
		System.out.print("b : ");
		b = scanner.nextInt();
		System.out.print("c : ");
		c = scanner.nextInt();

		if(a>b)
			if(a>c)
				max = a;
			else
				max = c;
		else
			if(b>c)
				max = b;
			else
				max = c;
		System.out.println("En buyuk olani = "+max);
			
	}
}
