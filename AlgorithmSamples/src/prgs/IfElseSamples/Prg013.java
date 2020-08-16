package prgs.IfElseSamples;

import prgs.Prg;

public class Prg013 extends Prg {

	public void cozum() {
		int y,x,k,t;
		System.out.print("x : ");
		x = scanner.nextInt();
		System.out.println("-------------------------");
		if(x<0) {
			k=2;
			t=0;
			System.out.println("k = 2\nt = 0");
		}
		else
			if(x<=5) {
				k=-1;
				t=10;
				System.out.println("k = -1\nt = 10");
			}else {
				k=3;
				t=-20;
				System.out.println("k = 3\nt = -20");
			}
		y = k*x + t;
		System.out.print("y = k*x + t = "+y);
	}
}
