package prgs;

import prgs.IntroductionSamples.*;
import prgs.IfElseSamples.*;

public class Main {

	public static void main(String[] args) {
		Cozum(new Prg019());
		//Cozum2(new Prg018());
	}
	
	
	private static void Cozum(Prg prg) {
		prg.cozum();
	}
	private static void Cozum2(Prg prg) {
		prg.cozum2();
	}

}
