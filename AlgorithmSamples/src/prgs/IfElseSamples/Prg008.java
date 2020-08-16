package prgs.IfElseSamples;

import prgs.Prg;

public class Prg008 extends Prg {

	public void cozum() {
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		if(a%b == 0)
			System.out.print("a, b' nin katidir.");
		else
			System.out.print("a, b' nin kati degildir.");
	}
}
