package prgs;

import prgs.IntroductionSamples.*;
import prgs.IfElseSamples.*;
import prgs.ForSamples.*;
import prgs.ArraySamples.*;
import prgs.NestedLoopSamples.*;
import prgs.MatriceSamples.*;

public class Main {

	public static void main(String[] args) {
		Cozum(new Prg082());
	}
	
	
	private static void Cozum(Prg prg) {
		System.out.print("---------------------\n");
		prg.cozum();
		System.out.print("\n\n---------------------\n");
		prg.cozum2();
	}

}
