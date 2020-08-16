package prgs.ForSamples;

import prgs.Prg;

public class Prg032 extends Prg{

	public void cozum() {
		System.out.println("n : ");
		int n = scanner.nextInt();
		int sum=0;
		for(int i=1 ; i<=n ; i++)
			sum += i;
		System.out.println(sum);
	}
}
