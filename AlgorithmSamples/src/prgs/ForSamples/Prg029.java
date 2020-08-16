package prgs.ForSamples;

import prgs.Prg;

public class Prg029 extends Prg{

	public void cozum() {
		for(int i=1 ; i<100 ; i++)
			if(i%3==0 || i%4==0 || i%5==0)
				System.out.print(i+" ");
	}
}
