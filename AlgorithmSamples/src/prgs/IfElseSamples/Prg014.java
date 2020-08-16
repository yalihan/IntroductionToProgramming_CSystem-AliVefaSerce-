package prgs.IfElseSamples;

import prgs.Prg;

public class Prg014 extends Prg {

	public void cozum() {
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		System.out.print("c : ");
		int c = scanner.nextInt();
		if(a+b > c)
			if(a+c > b)
				if(b+c > a)
					System.out.print("Ucgen Belirtir.");
				else
					System.out.print("Ucgen Belirtmez.");
			else
				System.out.print("Ucgen Belirtmez.");
		else
			System.out.print("Ucgen Belirtmez.");
	}
	public void cozum2() {
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		System.out.print("c : ");
		int c = scanner.nextInt();
		if(a+b <= c)
			System.out.print("Ucgen Belirtmez.");
		else
			if(a+c <= b)
				System.out.print("Ucgen Belirtmez.");
			else
				if(b+c <= a)
					System.out.print("Ucgen Belirtmez.");
				else
					System.out.print("Ucgen Belirtir.");
	}
}
