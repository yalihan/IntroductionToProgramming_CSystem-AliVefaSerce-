package prgs.WhileSamples;

import prgs.Prg;

public class Prg100 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();

		while(n>0) {
			System.out.println(n%10);
			n /= 10;
		}	
	}
}