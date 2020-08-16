package prgs.ForSamples;

import prgs.Prg;

public class Prg027 extends Prg{

	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=0 ; i<=n ; i+=2)
			if(n%2 == 0)
				System.out.print(i+" ");
			else
				System.out.print(i+1+" ");
	}
	
	public void cozum2() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		for(int i=n%2 ; i<=n ; i+=2)
			System.out.print(i+" ");
	}
}
