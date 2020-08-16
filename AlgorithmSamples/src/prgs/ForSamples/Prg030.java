package prgs.ForSamples;

import prgs.Prg;

public class Prg030 extends Prg{

	public void cozum() {
		for(int i=1 ; i<100 ; i++)
			if(i%3==0)
				System.out.println(i+" ");
			else if(i%4==0)
				System.out.println("	"+i+" ");
			else if(i%5==0)
				System.out.println("		"+i+" ");
	}
}
