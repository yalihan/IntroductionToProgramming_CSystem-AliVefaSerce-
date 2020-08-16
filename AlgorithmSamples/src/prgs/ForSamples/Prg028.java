package prgs.ForSamples;

import prgs.Prg;

public class Prg028 extends Prg{

	public void cozum() {
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		
		for(int i=a ; i<=b ; i++)
			if(i%5 == 0)
				System.out.print(i+"	");
	}
	public void cozum2() {
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		
		for(int i=a+(5-a%5) ; i<b ; i+=5)
			System.out.print(i+"	");
	}
}
