package prgs.IfElseSamples;

import prgs.Prg;

public class Prg019 extends Prg{

	public void cozum() {
		int n;
		
		System.out.print("n : ");
		n = scanner.nextInt();

		if (n <= 20)
			System.out.print("E");
		else if (n <= 40)
			System.out.print("D");
		else if (n <= 60)
			System.out.print("C");
		else if (n <= 80)
			System.out.print("B");
		else
			System.out.print("A");
	}
}
