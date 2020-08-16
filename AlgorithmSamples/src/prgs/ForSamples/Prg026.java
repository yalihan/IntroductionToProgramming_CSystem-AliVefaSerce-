package prgs.ForSamples;

import prgs.Prg;

public class Prg026 extends Prg {

	public void cozum() {
		System.out.println("a : ");
		int a = scanner.nextInt();
		System.out.println("b : ");
		int b = scanner.nextInt();
		
		if(a<=b)
			for(int i=a ; i<=b ; i++)
				System.out.print(i+" ");
		else
			for(int i=b ; i<=a ; i++)
				System.out.print(i+" ");
	}
}
