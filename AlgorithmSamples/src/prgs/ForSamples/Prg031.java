package prgs.ForSamples;

import prgs.Prg;

public class Prg031 extends Prg{

	public void cozum() {
		int fahrenheit,celcius;
		for(fahrenheit=10 ; fahrenheit<=90 ; fahrenheit+=4) {
			celcius = 5*(fahrenheit-32)/9;
			System.out.print(celcius + " ");
		}
	}
}
