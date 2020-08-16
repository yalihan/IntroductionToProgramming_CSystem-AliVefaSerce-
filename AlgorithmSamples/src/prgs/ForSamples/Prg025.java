package prgs.ForSamples;

import prgs.Prg;

public class Prg025 extends Prg{

	public void cozum() {
		System.out.println("a : ");
		int a = scanner.nextInt();
		System.out.println("b : ");
		int b = scanner.nextInt();
		
		for(int i=a ; i<=b ; i++)
			System.out.println(i);
	}
}
