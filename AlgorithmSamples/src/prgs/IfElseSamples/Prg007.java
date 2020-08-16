package prgs.IfElseSamples;

import prgs.Prg;

public class Prg007 extends Prg{
	
	public void cozum() {
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		if(a<b)
			System.out.print(a+"<"+b);
		else
			System.out.print(b+"<"+a);
	}
}
